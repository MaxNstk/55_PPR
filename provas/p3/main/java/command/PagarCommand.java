/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import controller.PagamentoController;
import java.util.Date;
import model.Cliente;
import model.Hotel;

/**
 *
 * @author 09479306980
 */
public class PagarCommand implements Command {
    
    Cliente cliente;
    int quarto;
    Hotel hotel;
    PagamentoController controller;
    
    public PagarCommand(Hotel hotel, int quarto, Cliente cliente, PagamentoController controller) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.hotel = hotel;
        this.controller = controller;
    }

    @Override
    public void execute() {
        hotel.pagar(quarto, cliente, controller.getTotalApagar());
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
