/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 *
 * @author 09479306980
 */
public interface Observer {

    public void novoJogoAcionado();

    public void adicionandoDedo();

    public void jogandoPartida(int maoPc);
    
    public void voceGanhou();
    
    public void pcGanhou();
    
}
