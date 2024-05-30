package set.Desafios.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }

    void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao, false));
    }

    void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        if(!listaDeTarefas.isEmpty()) {
            for(Tarefa t: listaDeTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada na lista");
        }

        listaDeTarefas.remove(tarefaParaRemover);
        System.out.println("Tarefa removida com sucesso!");
    }

    void exibirTarefas() {
        System.out.println(listaDeTarefas);
    }

    void contarTarefas() {
        System.out.println(listaDeTarefas.size());
    }

    void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!listaDeTarefas.isEmpty()) {
            for(Tarefa t: listaDeTarefas) {
                if(t.isStatus()) {
                    tarefasConcluidas.add(t);
                }
            }
        }

        if(tarefasConcluidas.isEmpty()) {
            System.out.println("Não existem tarefas concluídas...");
        }

        System.out.println("Tarefas concluídas: " + tarefasConcluidas);
    }

    void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!listaDeTarefas.isEmpty()) {
            for(Tarefa t: listaDeTarefas) {
                if(!t.isStatus()) {
                    tarefasPendentes.add(t);
                }
            }
        }

        if(tarefasPendentes.isEmpty()) {
            System.out.println("Não existem tarefas pendentes...");
        }

        System.out.println("Tarefas pendentes: " + tarefasPendentes);
    }

    void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;

        if(!listaDeTarefas.isEmpty()) {
            for(Tarefa t: listaDeTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(true);
                    tarefaConcluida = t;
                    break;
                }
            }
        }

        if(tarefaConcluida == null) {
            System.out.println("Não encontramos tarefa alguma com essa descrição");
        }

        System.out.println("A tarefa " + tarefaConcluida + " foi marcada como concluída");
    }

    void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;

        if(!listaDeTarefas.isEmpty()) {
            for(Tarefa t: listaDeTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(false);
                    tarefaPendente = t;
                    break;
                }
            }
        }

        if(tarefaPendente == null) {
            System.out.println("Não encontramos tarefa alguma com essa descrição");
        }

        System.out.println("A tarefa " + tarefaPendente + " foi marcada como pendente");
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Limpar a casa");
        tarefas.adicionarTarefa("Limpar a casa");
        tarefas.adicionarTarefa("Comprar comida da cachorra");
        tarefas.adicionarTarefa("Comprar a minha comida");
        tarefas.adicionarTarefa("Terminar a escultura");

        tarefas.contarTarefas();
        tarefas.exibirTarefas();
        System.out.println();

        tarefas.marcarTarefaConcluida("Comprar comida da cachorra");
        tarefas.marcarTarefaConcluida("Limpar a casa");
        tarefas.exibirTarefas();
        System.out.println();

        tarefas.marcarTarefaPendente("Limpar a casa");
        System.out.println();

        tarefas.obterTarefasConcluidas();
        tarefas.obterTarefasPendentes();
        System.out.println();

        tarefas.removerTarefa("Limpar a casa");
        tarefas.exibirTarefas();
    }
}
