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
public interface Element {
    
    public void accept(Visitor visitor);
    
}
