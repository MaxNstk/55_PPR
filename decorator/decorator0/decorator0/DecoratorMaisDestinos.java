package decorator0;

import java.util.List;

public class DecoratorMaisDestinos extends ServicoDecorator{

    private String[] destinos;

    public DecoratorMaisDestinos(ServicoEmailBase servicoEmail, String... destinos) {
        super(servicoEmail);
        this.destinos = destinos;
    }

    @Override
    public void enviar(Email email) {
        super.enviar(email);
        for (String destino:destinos){
            email.setDestino(destino);
            super.enviar(email);
        }
    }
}
