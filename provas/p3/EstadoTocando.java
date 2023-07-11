/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class EstadoTocando extends EstadoMusica{
    
    public EstadoTocando(PlayerMusica player) {
        super(player);
    }
    
    @Override
    public void next(){
        player.getDisco().getFaixa().praFrente();
    }
    
    @Override
    public void prev(){
        player.getDisco().getFaixa().praTras();
    }
    
    @Override
    public void desligar(){
        player.setEstado(new EstadoDesligado(player));
    }
    
    @Override
    public void play(){
        player.setEstado(new EstadoPause(player));
        player.getDisco().getFaixa().pause();
    }
    
    @Override
    public void stop(){
        player.setEstado(new EstadoParado(player));
        player.getDisco().getFaixa().parar();
    }
    
    @Override
    public String getStatus(){
      return "Tocando "+ player.getDisco().getFaixa().toString();
    }
    
}
