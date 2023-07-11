/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09479306980
 */
public abstract class EstadoMusica {
    
    protected PlayerMusica player;

    public EstadoMusica(PlayerMusica player) {
        this.player = player;
    }
        
    public void play()  {
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
//		if (!ligado)
//			return ;
//		
//		if (tocando > 0) {
//			tocando = 0;
//			disco.getFaixa().parar();
//		}
	}
	
	public void next() {
//		if (!ligado)
//			return;
//		
//		if (tocando == 1)
//			disco.getFaixa().praFrente();
//		else
//			if (tocando == 0)
//				disco.proxFaixa();
//			
	}
	
	public void prev() {
//		if (!ligado)
//			return;
//		
//		if (tocando == 1)
//			disco.getFaixa().praTras();
//		else
//			if (tocando == 0)
//				disco.voltarFaixa();
//			
//		
	}
	
	public void ligar() {
//		if (!ligado) {
//			ligado = true;
//			tocando = 0;
//		} 
	}
	
	public void desligar() {
		
//		if (ligado)
//			ligado = false;
//		
		
	}

    public void proxEstado() {
    }

    public String getStatus() {
        return "";
    }
    
}
