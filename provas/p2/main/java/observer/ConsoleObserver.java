/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import controller.PagamentoController;

/**
 *
 * @author 09479306980
 */
public class ConsoleObserver implements Observer {   

    double total;
    PagamentoController controller;

    public ConsoleObserver(PagamentoController controller) {
        this.controller = controller;
    }

    @Override
    public void fazendoCheckout(double total) {
        controller.setTotalApagar(total);
    }
    
}
