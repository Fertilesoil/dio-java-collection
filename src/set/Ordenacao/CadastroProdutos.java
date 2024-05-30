package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    void adicionarProduto(int cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtos);
    }

    Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(123, "Tech T-Shirt P", 230.0, 7);
        cadastro.adicionarProduto(124, "Tech T-Shirt M", 210.0, 7);
        cadastro.adicionarProduto(125, "Tech T-Shirt G", 300.0, 7);
        cadastro.adicionarProduto(126, "Calçado Esportivo", 30.0, 9);
        cadastro.adicionarProduto(127, "Solitária", 120.0, 11);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println();
        System.out.println(cadastro.exibirPorPreco());
    }
}
