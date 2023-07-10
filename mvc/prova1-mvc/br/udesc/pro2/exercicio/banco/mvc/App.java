package br.udesc.pro2.exercicio.banco.mvc;

import br.udesc.pro2.exercicio.banco.mvc.controlador.ControladorTelaInicial;


/**
 *
 * @author mattheus
 */
public class App {
    
    public static void main(String[] args) {
        ControladorTelaInicial controladorTelaInicial = new ControladorTelaInicial();
        controladorTelaInicial.abrirTela();
    }
    
}
