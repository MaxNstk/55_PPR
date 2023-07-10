package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.BancoException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovoBanco;


/**
 *
 * @author mattheus
 */
public class ControladorNovoBanco {

    private TelaNovoBanco telaNovoBanco;
    private Banco modeloBanco;

    public ControladorNovoBanco(TelaNovoBanco telaNovoBanco, Banco modeloBanco) {
        this.telaNovoBanco = telaNovoBanco;
        this.modeloBanco = modeloBanco;
        adicionarAcaoBotoes();
    }

    private void adicionarAcaoBotoes() {
        telaNovoBanco.adicionarAcaoBtnSalvar(acao -> acaoSalvar());
    }

    public void abrirTela() {
        telaNovoBanco.exibirTela();
    }

    private void acaoSalvar() {
        try {
            telaNovoBanco.validarCampos();
            String nomeBanco = telaNovoBanco.getNomeBanco();
            modeloBanco = new Banco(nomeBanco);
            BancoDAO.salvarBanco(modeloBanco);
            telaNovoBanco.exibirMensagem("Banco adicionado com sucesso1: " + modeloBanco);
            telaNovoBanco.fecharTela();
        } catch (BancoException ex) {
            telaNovoBanco.exibirMensagem(ex.getMessage());
        } 
    }

}
