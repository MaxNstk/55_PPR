package controller;

import dao.CategoriaDAO;
import model.Categoria;
import observer.ObserverCadastroCategoria;

import java.util.ArrayList;
import java.util.List;

public class ControllerCadastroCategoria {

    private List<ObserverCadastroCategoria> observers = new ArrayList<>();

    public void anexarObservador(ObserverCadastroCategoria obs){
        this.observers.add(obs);
    }

    public void criarCategoria(String codigo, String nome){
        new CategoriaDAO().adicionarCategoria(new Categoria(Integer.parseInt(codigo), nome));
        for (ObserverCadastroCategoria obs : observers){
            obs.criandoCategoria(nome);
        }
    }


}
