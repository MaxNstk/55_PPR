package br.udesc.pro2.exercicio.banco.mvc.dao;

import br.udesc.pro2.exercicio.banco.mvc.excecoes.BancoException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class BancoDAO {
    private static List<Banco> bancos = new ArrayList<Banco>();

    public static void salvarBanco(Banco banco) throws BancoException{
        for(Banco b : bancos) {
        	if(b.getNome().equals(banco.getNome())) {
        		throw new BancoException("Banco já existe");
        	}
        }
        
        bancos.add(banco);
    }
    
    public static List<Banco> getBancos(){
        return bancos;
    }
    
}
