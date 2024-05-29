package list.desafios.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Itens> carrinho = new ArrayList<>();

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Itens(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Itens> produtosParaRemocao = new ArrayList<>();

        for(Itens item: carrinho) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                produtosParaRemocao.add(item);
            }
        }

        carrinho.removeAll(produtosParaRemocao);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for(Itens item: carrinho) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public int obterNumeroTotalItens() {
        return carrinho.size();
    }
}
