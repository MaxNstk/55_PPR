/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controlador.manterpaciente;

import br.udesc.prog2.dao.PacienteDAO;
import br.udesc.prog2.modelo.Paciente;
import br.udesc.prog2.visao.manterpaciente.TelaCadastrarPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author matth
 */
public class ControladorCadastrarPaciente {
    private TelaCadastrarPaciente telaCadastrarPaciente;
    private Paciente modeloPaciente;

    public ControladorCadastrarPaciente(TelaCadastrarPaciente telaCadastrarPaciente, Paciente pacienteModelo) {
        this.telaCadastrarPaciente = telaCadastrarPaciente;
        this.modeloPaciente = pacienteModelo;
        adicionarAcoes();
    }
    
    public void adicionarAcoes(){
        telaCadastrarPaciente.adicionarAcaoBotaoSalvarPaciente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarPaciente();
                System.out.println(PacienteDAO.getTodosPaciente());
            }
        });
    }
    
    public void exibir(){
        telaCadastrarPaciente.exibirTela();
    }
    
    public void salvarPaciente(){
        modeloPaciente = new Paciente(telaCadastrarPaciente.getNome(), telaCadastrarPaciente.getCPF());
        if(validarPaciente()){
            if(PacienteDAO.salvarPaciente(modeloPaciente)){
                telaCadastrarPaciente.exibirMensagem("Paciente salvo com sucesso. " + modeloPaciente);
                telaCadastrarPaciente.limparTela();
            }
            else {
                telaCadastrarPaciente.exibirMensagem("Já existe paciente com esse CPF");
            }
        }
        else {
            telaCadastrarPaciente.exibirMensagem("Nome/CPF vazio");
        }
    }
    
    public boolean validarPaciente(){
        if (this.modeloPaciente.getNome().equals(""))
            return false;
        if (this.modeloPaciente.getCPF().equals(""))
            return false;
        return true;
    }

    public TelaCadastrarPaciente getTelaCadastrarPaciente() {
        return telaCadastrarPaciente;
    }    
    
    
}
