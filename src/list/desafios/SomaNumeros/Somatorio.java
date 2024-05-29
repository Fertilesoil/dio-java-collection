package list.desafios.SomaNumeros;

public class Somatorio {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(300);
        soma.adicionarNumero(3);
        soma.adicionarNumero(900);
        soma.adicionarNumero(12);
        soma.adicionarNumero(3987);
        soma.adicionarNumero(23);
        soma.adicionarNumero(25);
        soma.adicionarNumero(2);

        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());

        soma.exibirNumeros();
    }
}
