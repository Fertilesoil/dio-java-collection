package list.desafios.OrdenaNumeros;

public class Ordenador {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenador = new OrdenacaoNumeros();

        ordenador.adicionarNumero(30);
        ordenador.adicionarNumero(70);
        ordenador.adicionarNumero(50);
        ordenador.adicionarNumero(30);
        ordenador.adicionarNumero(320);

        System.out.println(ordenador.ordenarAscendente());
        System.out.println(ordenador.ordenarDecrescente());
    }
}
