package decorator0;

public class TraduzirAssuntoDecorator extends ServicoDecorator{

    private String idioma;

    public TraduzirAssuntoDecorator(ServicoEmailBase servicoEmail, String idioma) {
        super(servicoEmail);
        this.idioma = idioma;
    }

    @Override
    public void enviar(Email email) {
        email.setAssunto("["+this.idioma+"] "+email.getAssunto());
        super.enviar(email);
    }
}
