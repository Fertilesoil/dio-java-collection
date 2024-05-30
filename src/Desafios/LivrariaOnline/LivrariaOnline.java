package Desafios.LivrariaOnline;

import Ordenacao.Evento;

import java.time.LocalDate;
import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    void removerLivro(String titulo) {

        if (!livros.isEmpty()) {
            Collection<String> livroParaRemover = new ArrayList<>();
            for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                String livroAtual = entry.getValue().getTitulo();

                if (livroAtual.equalsIgnoreCase(titulo)) {
                    livroParaRemover.add(entry.getKey());
                }
            }

            for (String livro : livroParaRemover) {
                livros.remove(livro);
            }

            System.out.println("Livro apagado com sucesso!");
        } else {
            System.out.println("A coleção está vazia");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livros.isEmpty()) {
            for (Livro livro : livros.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livros.isEmpty()) {
            for (Livro livro : livros.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://amazon.com.br/livro1", "O homem na estrada", "Lucas", 67.0d);
        livraria.adicionarLivro("https://amazon.com.br/livro2", "O homem no caminho", "Pompel", 39.0d);
        livraria.adicionarLivro("https://amazon.com.br/livro3", "O homem", "Graciliano", 20.0d);

        livraria.removerLivro("O homem no caminho");

        System.out.println(livraria.livros);
    }
}
