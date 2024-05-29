package set.Desafios.PalavrasUnicas;

public class Dicionario {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas dicionario = new ConjuntoPalavrasUnicas();

        dicionario.adicionarPalavra("Kallinka");
        dicionario.adicionarPalavra("Contribuição");
        dicionario.adicionarPalavra("Artigo");
        dicionario.adicionarPalavra("Movel");

        dicionario.verificarPalavra("Kali");
        dicionario.verificarPalavra("kallinka");

        dicionario.removerPalavra("Kallinka");

        dicionario.exibirPalavrasUnicas();
    }
}
