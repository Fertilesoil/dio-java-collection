package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidados> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidados convidado = null;

        if (!convidados.isEmpty()) {
            for (Convidados c : convidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidado = c;
                    break;
                }
            }

            if (convidado == null) {
                System.out.println("Não existem convidados com esse código de convite, sinto muito.");
            }

            convidados.remove(convidado);
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }
}
