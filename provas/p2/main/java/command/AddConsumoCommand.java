/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import java.util.Date;
import model.Hotel;
import model.Produto;

/**
 *
 * @author 09479306980
 */
public class AddConsumoCommand implements Command{
    
    int quarto;
    Date date;
    Hotel hotel;
    Produto produto;
    int quantidade; 
    
    public AddConsumoCommand(Hotel hotel, Date date, int quarto, Produto produto, int quantidade) {
        this.date = date;
        this.quarto = quarto;
        this.hotel = hotel;
        this.produto = produto;
        this.quantidade = quantidade;
    }


    @Override
    public void execute() {
        hotel.addConsumo(date, quarto, produto, quantidade);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
