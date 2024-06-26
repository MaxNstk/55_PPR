package visitor;

import element.Cabecalho;
import element.Element;
import element.Link;
import element.Negrito;
import element.Paragrafo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class HTMLVisitor implements Visitor {
    
    private String text = "";


    @Override
    public void visitNegrito(Negrito negrito) {
       this.text += "<b>"+negrito.getTexto()+"</b>";
    }

    @Override
    public void visitLink(Link link) {
        this.text += "<a href='"+link.getEndereco()+"'>"+link.getTitulo()+"</a>";
    }

    @Override
    public void visitCabecalho(Cabecalho cabecalho) {
        this.text += "<h"+cabecalho.getI()+">"+cabecalho.getTitulo()+"</h"+cabecalho.getI()+">";
    }

    @Override
    public void visitParagrafo(Paragrafo paragrafo) {
        this.text += "<p>"+paragrafo.getText()+"</p>";
    }

    @Override
    public String toString() {   
        return "<html><body> "+
        this.text+           
        "</body> </html>";
    }
    
    
    
    
}
