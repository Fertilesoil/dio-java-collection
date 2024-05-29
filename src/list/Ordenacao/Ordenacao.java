package list.Ordenacao;

public class Ordenacao {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenar = new OrdenacaoPessoas();

        ordenar.adicionarPessoa("Fernando", 27, 1.74);
        ordenar.adicionarPessoa("Totoro", 67, 1.90);
        ordenar.adicionarPessoa("Beatriz", 27, 1.70);
        ordenar.adicionarPessoa("Roberto", 20, 1.72);
        ordenar.adicionarPessoa("Lavígnia", 35, 1.65);

        System.out.println(ordenar.pessoas);

        System.out.println(ordenar.ordenarPorIdade());
        System.out.println(ordenar.ordenarPorAltura());
    }
}
