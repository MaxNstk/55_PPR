
import element.Element;
import visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public class Documento {
    
    private List<Element> elementos = new ArrayList<>();

    void addElemento(Element elemento) {
        this.elementos.add(elemento);
    }
   
    public void accept(Visitor visitor) throws Exception {
        for (Element element:elementos){ 
                element.accept(visitor);
        }
    }
    
    
    
}
