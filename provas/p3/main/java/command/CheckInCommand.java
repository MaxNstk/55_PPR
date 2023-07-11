/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import java.util.Date;
import model.Cliente;
import model.Hotel;

/**
 *
 * @author 09479306980
 */
public class CheckInCommand implements Command{
    
    Cliente cliente;
    int quarto;
    Date date;
    Hotel hotel;
    
    public CheckInCommand(Hotel hotel, Date date, int quarto, Cliente cliente) {
        this.date = date;
        this.quarto = quarto;
        this.cliente = cliente;
        this.hotel = hotel;
    }

    @Override
    public void execute() {
        hotel.checkIn(date, quarto, cliente);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
