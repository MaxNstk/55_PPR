package visitor;

import element.Cabecalho;
import element.Negrito;
import element.Element;
import element.Paragrafo;
import element.Link;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public interface Visitor {
        
    public void visitNegrito(Negrito negrito);
    public void visitLink(Link link);
    public void visitCabecalho(Cabecalho cabecalho);
    public void visitParagrafo(Paragrafo paragrafo);
    
}
