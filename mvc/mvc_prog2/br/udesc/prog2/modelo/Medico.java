/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class Medico extends Pessoa {
    
    public static List<Medico> medicos = new ArrayList<>();
    
    public Medico(String nome, String CPF) {
        super(nome, CPF);
    }
    
    public static void carregarDadosIniciais(){
        Medico m1 = new Medico("Ana", "1123");
        Medico m2 = new Medico("Matheus", "1456");
        Medico m3 = new Medico("Gabriel", "1789");
        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);
    }
    
    
    
}
