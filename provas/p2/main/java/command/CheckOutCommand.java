/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import controller.PagamentoController;
import java.util.Date;
import model.Cliente;
import model.Hotel;
import observer.Observer;

/**
 *
 * @author 09479306980
 */
public class CheckOutCommand implements Command {
    
    Cliente cliente;
    int quarto;
    Date date;
    Hotel hotel;
    Observer obs;
    
    public CheckOutCommand(Observer obs,  Hotel hotel, Date date, int quarto, Cliente cliente) {
        this.date = date;
        this.quarto = quarto;
        this.cliente = cliente;
        this.hotel = hotel;
        this.obs = obs;
    }

    @Override
    public void execute() {
        double total = hotel.checkOut(date, quarto, cliente);
        obs.fazendoCheckout(total);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
