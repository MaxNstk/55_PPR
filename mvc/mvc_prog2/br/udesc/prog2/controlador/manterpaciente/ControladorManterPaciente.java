/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controlador.manterpaciente;

import br.udesc.prog2.dao.PacienteDAO;
import br.udesc.prog2.modelo.Paciente;
import br.udesc.prog2.modelo.tabela.PacienteTableModel;
import br.udesc.prog2.visao.manterpaciente.TelaCadastrarPaciente;
import br.udesc.prog2.visao.manterpaciente.TelaManterPaciente;
import br.udesc.prog2.visao.manterpaciente.TelaListarPacientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author matth
 */
public class ControladorManterPaciente {

    private TelaManterPaciente telaManterPaciente;
    private Paciente pacienteModel;

    //Controladores
    private ControladorListarPacientes controladorListarPacientes;
    private ControladorCadastrarPaciente controladorCadastrarPaciente;

    private PacienteTableModel pacienteTableModel;

    public ControladorManterPaciente(TelaManterPaciente telaManterPaciente) {
        this.telaManterPaciente = telaManterPaciente;
        inicializarTelaListarDados();
        inicializarTelaCadastrarPaciente();
        inicializarAcaoBotoes();
        atualizarListaAoSalvarPaciente();
    }

    public void inicializarAcaoBotoes() {
        telaManterPaciente.adicionarAcaoCadastrarPaciente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controladorCadastrarPaciente.exibir();
            }
        });

        telaManterPaciente.adicionarAcaoListarPacientes(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controladorListarPacientes.exibir();
            }
        });

    }

    public void inicializarTelaListarDados() {
        pacienteTableModel = new PacienteTableModel(PacienteDAO.getTodosPaciente());
        controladorListarPacientes = new ControladorListarPacientes(new TelaListarPacientes(), pacienteTableModel);
    }

    public void inicializarTelaCadastrarPaciente() {
        controladorCadastrarPaciente = new ControladorCadastrarPaciente(new TelaCadastrarPaciente(), new Paciente("", ""));
    }

    public void exibirTelaManterPaciente() {
        telaManterPaciente.exibirTela();
    }

    public void exibirTelaListarPacientes() {
        controladorListarPacientes.exibir();
    }

    public void exibirTelaCadastrarPaciente() {
        controladorCadastrarPaciente.exibir();
    }

    public void atualizarListaAoSalvarPaciente() {
        controladorCadastrarPaciente.getTelaCadastrarPaciente().adicionarAcaoBotaoSalvarPaciente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controladorListarPacientes.atualizarDados();
            }
        });
    }

}
