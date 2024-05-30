package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();

        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().startsWith(nome)) {
                    contatosEncontrados.add(c);
                }
            }
        }

        if (contatosEncontrados.isEmpty()) {
            System.out.println("Não foram encontrados contatos com esse nome");
        }

        System.out.println("Contatos encontrados: " + contatosEncontrados);
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if(c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }

        System.out.println("Contato atualizado com sucesso! " + contatoAtualizado);
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Leon", 8977);
        agenda.adicionarContato("Leon Balada", 897);
        agenda.adicionarContato("Nilce", 845);
        agenda.adicionarContato("Blink 182", 287);
        agenda.adicionarContato("Travis", 97);


        agenda.exibirContatos();

        agenda.pesquisarPorNome("Leon");
        agenda.atualizarNumeroContato("Leon Balada", 230);
    }
}
