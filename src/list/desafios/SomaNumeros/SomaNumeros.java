package list.desafios.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Numeros> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(new Numeros(numero));
    }

    public int calcularSoma() {
        int valorTotal = 0;

        if(!numeros.isEmpty()) {
            for(Numeros n: numeros) {
                valorTotal += n.getNumero();
            }
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorValor = Integer.MIN_VALUE;

        if(!numeros.isEmpty()) {
            for(Numeros n: numeros) {
                if(n.getNumero() > maiorValor) {
                    maiorValor = n.getNumero();
                }
            }
        }
        return maiorValor;
    }

    public int encontrarMenorNumero() {
        int menorValor = Integer.MAX_VALUE;

        if(!numeros.isEmpty()) {
            for(Numeros n: numeros) {
                if(n.getNumero() < menorValor) {
                    menorValor = n.getNumero();
                }
            }
        }
        return menorValor;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }
}
