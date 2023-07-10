package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.visao.TelaInicial;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaListarContasBanco;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovaConta;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovoBanco;


/**
 *
 * @author mattheus
 */
public class ControladorTelaInicial {

    private TelaInicial telaInicial;

    private ControladorNovoBanco controladorNovoBanco;
    private ControladorNovaConta controladorNovaConta;
    private ControladorListarContasBanco controladorListarContasBanco;

    public ControladorTelaInicial() {
        telaInicial = new TelaInicial();
        adicionarAcaoBotoes();
    }

    public void abrirTela() {
        telaInicial.exibirTela();
    }

    private void adicionarAcaoBotoes() {
        telaInicial.adicionarAcaoBtnNovoBanco(e -> {
            controladorNovoBanco = new ControladorNovoBanco(new TelaNovoBanco(), null);
            controladorNovoBanco.abrirTela();
        });

        telaInicial.adicionarAcaoBtnNovaConta(e -> {
            controladorNovaConta = new ControladorNovaConta(new TelaNovaConta(), null);
            controladorNovaConta.abrirTela();
        });

        telaInicial.adicionarAcaoBtnListarContas(e -> {
            controladorListarContasBanco = new ControladorListarContasBanco(new TelaListarContasBanco(), null);
            controladorListarContasBanco.abrirTela();
        });
    }

}
