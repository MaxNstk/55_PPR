package composite3;

import java.util.ArrayList;
import java.util.List;

public class Postagem extends ComponenteSite {
	
	private List<ComponenteSite> componentes = new ArrayList<>();

	public void add(ComponenteSite comp) {
		this.componentes.add(comp);
	}
	
	public void remove(ComponenteSite comp) {
		this.componentes.remove(comp);
	}
	
	public ComponenteSite getComponenteSite(int numero) {
		return componentes.get(numero);
	}
	
	@Override
	public void imprimir() {
		System.out.println(super.getTitulo() + " " + super.getUrl());
		
		for(ComponenteSite comp : componentes) {
			comp.imprimir();
		}
	}

}
