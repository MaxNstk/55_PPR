/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controlador.manterpaciente;

import br.udesc.prog2.dao.PacienteDAO;
import br.udesc.prog2.modelo.tabela.PacienteTableModel;
import br.udesc.prog2.visao.manterpaciente.TelaListarPacientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author matth
 */
public class ControladorListarPacientes {
    private TelaListarPacientes telaListarPacientes;
    private PacienteTableModel pacienteTableModel;

    public ControladorListarPacientes(TelaListarPacientes telaListarDados, PacienteTableModel pacienteTableModel) {
        this.telaListarPacientes = telaListarDados;
        this.pacienteTableModel = pacienteTableModel;
        setTableModel();
        adicionarAcaoBotaoExcluir();
    }
    private void setTableModel(){
        telaListarPacientes.setTableModel(this.pacienteTableModel);
    }
    
    public void exibir(){
        telaListarPacientes.exibirTela();
    }
    
    public void atualizarDados(){
        pacienteTableModel.fireTableDataChanged();
    }
    
    public void adicionarAcaoBotaoExcluir(){
        telaListarPacientes.adicionarAcaoExcluir(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirPaciente();
            }
        });
    }
    
    public void excluirPaciente(){
        String CPF = telaListarPacientes.getCPFLinhaSelecionada();
        if(PacienteDAO.excluirPaciente(CPF)){
            telaListarPacientes.exibirMensagem("Paciente excluido com sucesso");
            atualizarDados();
        }
        else {
            telaListarPacientes.exibirMensagem("Não foi possível excluir o paciente");
        }
    }
    
}
