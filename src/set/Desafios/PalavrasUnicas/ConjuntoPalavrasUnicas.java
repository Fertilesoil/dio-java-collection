package set.Desafios.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<Palavra> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraEncontrada = null;

        if (!palavras.isEmpty()) {
            for (Palavra p : palavras) {
                if (p.getPalavra().equalsIgnoreCase(palavra)) {
                    palavraEncontrada = p;
                    break;
                }
            }
        }

        if (palavraEncontrada == null) {
            System.out.println("Não encontramos esta palavra em nosso banco de dados, sinto muito");
        }

        palavras.remove(palavraEncontrada);
    }

    public void verificarPalavra(String palavra) {

        Palavra palavraEncontrada = null;

        if (!palavras.isEmpty()) {
            for (Palavra p : palavras) {
                if (p.getPalavra().equalsIgnoreCase(palavra)) {
                    palavraEncontrada = p;
                    System.out.println("A palavra " + palavra + " existe dentro do conjunto");
                    break;
                }
            }

            if (palavraEncontrada == null) {
                System.out.println("A palavra " + palavra + " não existe dentro do conjunto");
            }
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }
}
