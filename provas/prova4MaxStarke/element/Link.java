package element;

import visitor.Visitor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class Link implements Element {

    private String titulo;
    private String endereco;

    public Link(String titulo, String endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLink(this);
    }
    
    
    
}
