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
public class Cabecalho implements Element {
    
    private int i;
    private String titulo;

    public Cabecalho(int i, String titulo) {
        this.i = i;
        this.titulo = titulo;
    }

    public int getI() {
        return i;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCabecalho(this);
    }
    
}
