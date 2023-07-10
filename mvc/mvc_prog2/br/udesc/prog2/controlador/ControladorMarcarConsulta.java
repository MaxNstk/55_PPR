/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controlador;

import br.udesc.prog2.dao.ConsultaDAO;
import br.udesc.prog2.dao.PacienteDAO;
import br.udesc.prog2.excecoes.ConsultaException;
import br.udesc.prog2.modelo.Consulta;
import br.udesc.prog2.modelo.Funcionario;
import br.udesc.prog2.modelo.Medico;
import br.udesc.prog2.modelo.Paciente;
import br.udesc.prog2.visao.TelaMarcarConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author matth
 */
public class ControladorMarcarConsulta {
    private Consulta modelConsulta;
    private TelaMarcarConsulta telaMarcarConsulta;

    public ControladorMarcarConsulta() {
        modelConsulta = new Consulta();
        telaMarcarConsulta = new TelaMarcarConsulta();
        popularDadosTela();
        adicionarAcaoBotoes();
    }
    
    
    public void popularDadosTela(){
        Medico.carregarDadosIniciais();
        telaMarcarConsulta.popularPacientes(PacienteDAO.getTodosPaciente());
        telaMarcarConsulta.popularMedicos(Medico.medicos);
    }
    
    
    public void exibir(){
        telaMarcarConsulta.exibirTela();
    }
    
    public void adicionarAcaoBotoes(){
        telaMarcarConsulta.adicionarAcaoBtnMarcarConsulta(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                marcarConsulta();
            }
        });
    }
    
    public void marcarConsulta() {
        Medico medico = telaMarcarConsulta.getMedico();
        Paciente paciente = telaMarcarConsulta.getPaciente();
        String data = telaMarcarConsulta.getData();
        String hora = telaMarcarConsulta.getHora();
        try {
            Consulta consulta = Funcionario.marcarConsulta(paciente, medico, data, hora);
            ConsultaDAO.salvarConsulta(consulta);
            telaMarcarConsulta.exibirMensagem("Consulta Marcada com sucesso");
            telaMarcarConsulta.limparTela();
            System.out.println(ConsultaDAO.getTodasConsultas());
        } catch (ConsultaException ex) {
            telaMarcarConsulta.exibirMensagem("Erro: Você está tentando agendar uma consulta para o sábado");
        }
    }
    
    
    
}
