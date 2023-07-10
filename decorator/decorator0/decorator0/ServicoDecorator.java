package decorator0;

public abstract class ServicoDecorator extends ServicoEmailBase{

    public ServicoDecorator(ServicoEmailBase servicoEmail) {
        this.servicoEmail = servicoEmail;
    }

    @Override
    public void enviar(Email email) {
        this.servicoEmail.enviar(email);
    }

    protected ServicoEmailBase servicoEmail;
}