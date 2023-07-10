package controller;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import model.Categoria;
import model.Produto;
import observer.ObserverCadastroProduto;

import java.util.ArrayList;
import java.util.List;

public class ControllerCadastroProduto {

    private List<ObserverCadastroProduto> observers = new ArrayList<>();

    public void anexarObserver(ObserverCadastroProduto obs){
        this.observers.add(obs);
    }

    public void setUpInfo(){
        List<Categoria> categorias = new CategoriaDAO().retornarCategorias();
        for (ObserverCadastroProduto obs: this.observers){
            obs.listandoCategorias(categorias);
        }
        listandoProdutos();
    }

    public void recuperarProduto(String prdDescricao){
        Produto p = new ProdutoDAO().recuoperarProduto(prdDescricao);
        for (ObserverCadastroProduto obs: observers){
            obs.recuperandoProduto(p);
        }
    }

    public void criarProduto(String nome, double preco, String descricao, Categoria categoria){
        new ProdutoDAO().addProduto(new Produto(nome, preco, descricao, categoria));
        for (ObserverCadastroProduto obs: observers){
            obs.criandoProduto(nome);
        }
        listandoProdutos();
    }

    public void listandoProdutos(){
        List<Produto> produtos = new ProdutoDAO().getProdutos();
        for (ObserverCadastroProduto obs:observers){
            obs.listandoProdutos(produtos);
        }
    }

}
