

import command.AddConsumoCommand;
import command.CheckInCommand;
import command.CheckOutCommand;
import model.Produto;
import model.Hotel;
import model.Cliente;
import command.CommandInvoker;
import command.PagarCommand;
import command.ReservarCommand;
import controller.PagamentoController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import observer.ConsoleObserver;

public class Sistema {

	public static void main(String[] args) throws Exception {
            
            CommandInvoker ci = new CommandInvoker();
            PagamentoController controller = new PagamentoController();
            ConsoleObserver co = new ConsoleObserver(controller);
            Hotel hotel = new Hotel();

            Cliente cliente = buscarCliente(1);
            Date date = converterData("27/04/2023");
            
            ci.execute(new ReservarCommand(co,hotel, date, 10, cliente));
//            hotel.reservar(date, 10, cliente);
            
            ci.undo();
//            hotel.cancelarReserva(date, 10, cliente);

            ci.execute(new ReservarCommand(co,hotel, date, 15, cliente));
//            hotel.reservar(date, 15, cliente);

            ci.execute(new CheckInCommand(hotel, date, 15, cliente));
//            hotel.checkIn(date, 15, cliente);
            
            ci.execute(new AddConsumoCommand(hotel, date, 15, buscarProduto(30), 3));
//            hotel.addConsumo(date, 15, buscarProduto(30), 3);
            ci.execute(new AddConsumoCommand(hotel, date, 15, buscarProduto(50), 10));
//            hotel.addConsumo(date, 15, buscarProduto(50), 10);

            ci.execute(new CheckOutCommand(co, hotel, date, 10, cliente));
//            double total = hotel.checkOut(date, 10, cliente);
            
            ci.execute(new PagarCommand(hotel, 10, cliente, controller));                   
//            hotel.pagar(10, cliente, total);
		
	}

	private static Produto buscarProduto(int i) {
		// metodo fake
		return new Produto();
	}

	private static Date converterData(String dataS) throws ParseException {
		return sdf.parse(dataS);
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private static Cliente buscarCliente(int i) {
		// metodo fake
		return new Cliente();
	}

}
