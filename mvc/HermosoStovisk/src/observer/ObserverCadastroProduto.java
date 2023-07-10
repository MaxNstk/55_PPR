package observer;

import model.Categoria;
import model.Produto;

import java.util.List;

public interface ObserverCadastroProduto {

    void criandoProduto(String nome);

    void listandoCategorias(List<Categoria> categorias);
    void listandoProdutos(List<Produto> produtos);
    void recuperandoProduto(Produto produto);
}
