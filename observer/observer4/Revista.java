import java.util.ArrayList;

public class Revista {
    private String nome;

    private ArrayList<Edicao> edicoes;

    private ArrayList<Observer> observers = new ArrayList<>();

    public Revista(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }

    public void lancarNovaEdicao(Edicao edicao){
        edicao.setRevista(this);
        for (Observer observer: this.observers){
            observer.receberEdicao(edicao);
        }
    }

    public void anexarObserver(Observer observer){
        this.observers.add(observer);
    }

}
