
import br.udesc.prog2.controlador.manterpaciente.ControladorManterPaciente;
import br.udesc.prog2.visao.manterpaciente.TelaManterPaciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matth
 */
public class App {
    public static void main(String[] args){
        ControladorManterPaciente controlador = new ControladorManterPaciente(new TelaManterPaciente());
        controlador.exibirTelaManterPaciente();
        
    }
}
