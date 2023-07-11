/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class EstadoDesligado extends EstadoMusica{
   
    public EstadoDesligado(PlayerMusica player) {
        super(player);
    }
       
    @Override
    public void ligar(){
       player.setEstado(new EstadoParado(player));
    }
    
    @Override
    public String getStatus(){
      return "Desligado";
    }
    
}
