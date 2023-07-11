/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.Mao;
import observer.Observer;
import visao.TelaParImpar;

/**
 *
 * @author 09479306980
 */
public class ControllerMao {
    
    private int idxMao;
    private JList<Mao> listSorteios;
    private Random sorteio = new Random();;
    private int minhaVit, pcVit;
    private List<Mao> maos = new ArrayList<>();       
    
    private List<Observer> observers = new ArrayList();
   

    
    public void anexar(Observer obs){
        this.observers.add(obs);            
    }
    
    public void novoJogo(){
        maos.clear();
        minhaVit = 0;
        pcVit = 0;
                               
        for (Observer obs: observers){
            obs.novoJogoAcionado();
        }
    }
    
    public void addDedoMao(){
        idxMao = (idxMao + 1) % 6;
        
        for (Observer obs: observers){
            obs.adicionandoDedo();
        }
    }
    
    public List<Mao> getMaos(){
        return maos;
    }
    
    public void jogarPartida(boolean selected){
        
        int maoPC = sorteio.nextInt(6);

        Mao mao = new Mao(selected, maoPC, idxMao);
        maos.add(mao);

        for (Observer obs: observers){
            obs.jogandoPartida(maoPC);
        }
        
        boolean vencePar = ((maoPC + idxMao)%2) == 0;
        if (mao.isPar() == vencePar) {
                minhaVit++;

                if (minhaVit == 3) {
                    for (Observer obs: observers){
                        obs.voceGanhou();
                    }
                    
                }
        } else {
                pcVit++;
                if (pcVit == 3) {
                   for (Observer obs: observers){
                        obs.pcGanhou();
                    }     
                }
        }     
        
    }
    
    
    
}
