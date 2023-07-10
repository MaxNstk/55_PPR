/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Categoria;
/**
 *
 * @author gusdev0258
 */
public class CategoriaDAO {
    public static List<Categoria> categorias = new ArrayList<>();

    public List<Categoria> retornarCategorias() {
        return categorias;
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }
    
}
