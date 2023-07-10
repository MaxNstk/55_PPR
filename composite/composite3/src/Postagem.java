import java.util.ArrayList;
import java.util.List;

public class Postagem extends ComponenteSite{

    private List<ComponenteSite> componentes = new ArrayList<>();

    public Postagem(String titulo, String url) {
        super(titulo, url);
    }

    public void removeComponente(ComponenteSite componente){
        this.componentes.remove(componente);
    }

    public ComponenteSite getComponenteSite(int index){
        return this.componentes.get(index);
    }

    public void addComponente(ComponenteSite componente){
        this.componentes.add(componente);
    }

    @Override
    public void imprimir() {
        System.out.println("[<"+this.titulo+"><"+this.url+">]");
        for (ComponenteSite c: componentes){
            c.imprimir();
        }
    }
}
