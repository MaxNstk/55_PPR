package decorator0;

public class ServicoEmail extends ServicoEmailBase {

	public void enviar(Email email) {
		System.out.println("Enviado para "+email.getDestino()+
				" de "+email.getRemetente()+
				" \nAssunto : " + email.getAssunto() + 
				" \nCorpo : " + email.getConteudo());
	}
}
