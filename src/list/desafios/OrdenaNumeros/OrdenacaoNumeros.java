package list.desafios.OrdenaNumeros;

import list.Ordenacao.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    List<Numero> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> ordemCrescente = new ArrayList<>(numeros);
        Collections.sort(ordemCrescente);
        return ordemCrescente;
    }

    public List<Numero> ordenarDecrescente() {
        List<Numero> ordemDecrescente = new ArrayList<>(numeros);
        Collections.sort(ordemDecrescente, new NumerosOrdemDecrescente().reversed());
        return ordemDecrescente;
    }

}
