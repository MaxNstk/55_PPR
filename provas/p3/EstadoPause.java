/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class EstadoPause extends EstadoMusica{
    
    public EstadoPause(PlayerMusica player) {
        super(player);
    }
    
    @Override
    public void play(){
        player.setEstado(new EstadoTocando(player));
        player.getDisco().getFaixa().tocar();
    }
    
    @Override
    public void stop(){
        player.setEstado(new EstadoParado(player));
    }
    
    @Override
    public void desligar(){
        player.setEstado(new EstadoDesligado(player));
    }
    
    @Override
    public void next(){
      
    }
    
    @Override
    public String getStatus(){
      return "Pause "+player.getDisco().getFaixa().toString();
    }
    

    
}
