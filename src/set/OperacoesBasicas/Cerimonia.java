package set.OperacoesBasicas;

public class Cerimonia {
    public static void main(String[] args) {
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();

        listaConvidados.adicionarConvidado("Leon", 12);
        listaConvidados.adicionarConvidado("Nilce", 15);
        listaConvidados.adicionarConvidado("Sr. Frango", 43);
        listaConvidados.adicionarConvidado("Lucia", 9);
        listaConvidados.adicionarConvidado("Bennett", 14);

        System.out.println(listaConvidados.contarConvidados());
        listaConvidados.removerConvidadoPorCodigoConvite(20);
        System.out.println(listaConvidados.contarConvidados());

        listaConvidados.exibirConvidados();
    }
}
