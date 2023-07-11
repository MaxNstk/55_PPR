/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Hotel;

/**
 *
 * @author 09479306980
 */
public class CancelarReservaCommand implements Command {
    
    Cliente cliente;
    int quarto;
    Date date;
    Hotel hotel;
    
    public CancelarReservaCommand(Hotel hotel, Date date, int quarto, Cliente cliente) {
        this.date = date;
        this.quarto = quarto;
        this.cliente = cliente;
        this.hotel = hotel;
    }

    @Override
    public void execute() {
        try {
            hotel.cancelarReserva(date, quarto, cliente);
        } catch (Exception ex) {
            Logger.getLogger(CancelarReservaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
