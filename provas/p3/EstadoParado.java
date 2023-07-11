/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class EstadoParado extends EstadoMusica{
    
    public EstadoParado(PlayerMusica player) {
        super(player);
    }
    
    @Override
    public void next(){
        player.getDisco().proxFaixa();
    }
    
    @Override
    public void prev(){
        player.getDisco().voltarFaixa();
    }
    
    @Override
    public void desligar(){
        player.setEstado(new EstadoDesligado(player));
    }
    
    @Override
    public void play(){
        player.setEstado(new EstadoTocando(player));
        player.getDisco().getFaixa().tocar();
    }
    
    
    
    @Override
    public String getStatus(){
      return "Parado";
    }
    
    
}
