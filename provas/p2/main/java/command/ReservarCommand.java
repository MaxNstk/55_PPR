package command;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Hotel;
import observer.Observer;
/**
 *
 * @author 09479306980
 */
public class ReservarCommand implements Command {

    Cliente cliente;
    int quarto;
    Date date;
    Hotel hotel;
    Observer obs;
    
    public ReservarCommand(Observer obs, Hotel hotel, Date date, int quarto, Cliente cliente) {
        this.obs = obs;
        this.date = date;
        this.quarto = quarto;
        this.cliente = cliente;
        this.hotel = hotel;
    }

    @Override
    public void execute() {
         hotel.reservar(date, quarto, cliente);
    }

    @Override
    public void undo(){
        try {
            hotel.cancelarReserva(date, quarto, cliente);
        } catch (Exception ex) {
            Logger.getLogger(ReservarCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
