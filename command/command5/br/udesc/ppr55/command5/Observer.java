package br.udesc.ppr55.command5;

import java.util.List;

public interface Observer {
    void listandoMusicas(List<Musica> musicas);
    void imprimir(String msg);
}
