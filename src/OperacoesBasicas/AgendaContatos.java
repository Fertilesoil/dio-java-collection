package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    void removerContato(String nome) {
        if (!contatos.isEmpty()) {
            contatos.remove(nome);
        }
    }

    void exibirContatos() {
        System.out.println("Todos os contatos: " + contatos);
    }

    Integer pesquisarPorNome(String nome) {
        Integer numeroEncontrado = null;

        if (!contatos.isEmpty()) {
            numeroEncontrado = contatos.get(nome);
        }

        return numeroEncontrado;
    }

    @Override
    public String toString() {
        return "{" + "contatos: " + contatos + "\n" + '}' ;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Ferrez", 0);
        agenda.adicionarContato("Luara", 90);
        agenda.adicionarContato("Briana", 0);
        agenda.adicionarContato("Cleyton", 0);
        agenda.adicionarContato("Fernando", 0);

        System.out.println(agenda.pesquisarPorNome("Luara"));
        System.out.println();

        agenda.exibirContatos();
        System.out.println();

        agenda.removerContato("Cleyton");
        agenda.exibirContatos();
    }
}
