

public class PlayerMusica {

	private int tocando; // 0-stop 1-tocando 2-pause
	private Disco disco;
	private boolean ligado;
        private EstadoMusica estado;

	public PlayerMusica(Disco disco) {
		this.disco = disco;
		this.tocando = 0;
                this.estado = new EstadoDesligado(this);
	}
        
        public void setEstado(EstadoMusica estado) {
            this.estado = estado;
//            System.out.println("mudou para estado: " + estado); // serve apenas para depuracao
            estado.proxEstado();
	}
	
	public void play()  {
            this.estado.play();
// 0 parado, 1 tocando, 2 pause
//		if (!ligado)
//			return;
//		
//		if (tocando == 0 || tocando == 2) {
//			tocando = 1;
//			disco.getFaixa().tocar();
//		} else {
//			if (tocando == 1) {
//				tocando = 2;
//				disco.getFaixa().pause();
//			}
//		}
	}
	
	public void stop()  {
            this.estado.stop();
            // 0 parado, 1 tocando, 2 pause

//		if (!ligado)
//			return ;
//		
//		if (tocando > 0) {
//			tocando = 0;
//			disco.getFaixa().parar();
//		}
	}
	
	public void next() {
            this.estado.next();
            
// 0 parado, 1 tocando, 2 pause

//		if (!ligado)
//			return;
//		
//		if (tocando == 1)
//			disco.getFaixa().praFrente();
//		else
//			if (tocando == 0)
//				disco.proxFaixa();
			
	}
	
	public void prev() {
            
            this.estado.prev();
//		if (!ligado)
//			return;
//		
//		if (tocando == 1)
//			disco.getFaixa().praTras();
//		else
//			if (tocando == 0)
//				disco.voltarFaixa();
//			
		
	}
	
	public void ligar() {
            this.estado.ligar();
//		if (!ligado) {
//			ligado = true;
//			tocando = 0;
//		} 
	}
	
	public void desligar() {		
            this.estado.desligar();
//		if (ligado)
//			ligado = false;
		
		
	}

	public String getStatus() {
            return this.estado.getStatus();
            // 0 parado, 1 tocando, 2 pause
//		return (!ligado?"Desligado":(tocando == 0?"Parado ":((tocando == 1?"Tocando ":"Pause ")) + disco.getFaixa()));
	}
        
        public Disco getDisco(){
            return this.disco;
        }
	
}
