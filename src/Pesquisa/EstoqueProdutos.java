package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    void exibirProdutos() {
        System.out.println("Todos os produtos: " + estoque);
    }

    double calcularValorTotalEstoque() {
        double valorTotal = 0d;

        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotal;
    }

    Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }

    Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;

        if (!estoque.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }

        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1341L, "Banana", 37, 12.0d);
        estoque.adicionarProduto(1342L, "Caramelo", 90, 6.0d);
        estoque.adicionarProduto(1343L, "Quebra Queixo", 120, 0.9d);
        estoque.adicionarProduto(1344L, "Marmelada", 60, 6.7d);
        estoque.adicionarProduto(1345L, "Doce de Mocotó", 30, 1.0d);

        estoque.exibirProdutos();
        System.out.println();

        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println();

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println();

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println();

        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
