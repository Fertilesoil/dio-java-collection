package list.desafios.CarrinhoCompras;

public class Carrinho {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();


        System.out.println(carrinho.obterNumeroTotalItens());

        carrinho.adicionarItem("Cueca", 27.9, 3);
        carrinho.adicionarItem("Cueca", 27.9, 3);
        carrinho.adicionarItem("Exoesqueleto Usado", 50.0, 7);
        carrinho.adicionarItem("Relógio Creme", 21.67, 9);

        System.out.println(carrinho.obterNumeroTotalItens());
        carrinho.removerItem("relógio creme");
        System.out.println(carrinho.obterNumeroTotalItens());

        System.out.println(String.format("%.2f", carrinho.calcularValorTotal()));

        carrinho.exibirItens();
    }
}
