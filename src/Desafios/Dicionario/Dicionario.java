package Desafios.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    void removePalavra(String palavra) {
        dicionario.remove(palavra);
    }

    void exibirPalavras() {
        System.out.println("Palavras cadastradas: " + dicionario);
    }

    void pesquisarPorPalavra(String palavra) {

        Map.Entry<String, String> parEncontrado =
                dicionario.entrySet().stream()
                        .filter(entrada -> entrada.getKey().equals(palavra))
                        .findFirst()
                        .orElse(null);

        if (parEncontrado != null) {
            String chave = parEncontrado.getKey();
            String valor = parEncontrado.getValue();

            System.out.println("{ Palavra: " + chave + ", Definição: " + valor + " }");
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    @Override
    public String toString() {
        return "Dicionario{" + "dicionario: " + dicionario + '}';
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Calabresa", "Embutido não saudável");
        dicionario.adicionarPalavra("Bola", "Objeto central do esporte futebol");
        dicionario.adicionarPalavra("Mesa", "Onde você apoia coisas");
        dicionario.adicionarPalavra("Cadeira", "Onde você se senta");
        dicionario.adicionarPalavra("Porta", "Você passa por ela");

        dicionario.exibirPalavras();
        System.out.println();

        dicionario.pesquisarPorPalavra("Total");
        dicionario.pesquisarPorPalavra("Quina");
        dicionario.pesquisarPorPalavra("Mesa");
        dicionario.pesquisarPorPalavra("Porta");
        System.out.println();

        dicionario.removePalavra("Calabresa");

        dicionario.exibirPalavras();
    }
}
