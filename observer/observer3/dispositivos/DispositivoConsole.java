package observer3.dispositivos;

public class DispositivoConsole implements DispositivoObervador {

    @Override
    public void atualizar(double temperatura, double umidade) {
        System.out.println("Temperatura: "+temperatura);
        System.out.println("Umidade: "+umidade);
    }

}
