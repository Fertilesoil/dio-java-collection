package list.OperacoesBasicas;


public class Instancias {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Limpar os três primeiros cômodos.");
        tarefas.adicionarTarefa("Limpar os três primeiros cômodos.");
        tarefas.adicionarTarefa("Comprar solvente para a gata.");
        tarefas.adicionarTarefa("Levar os livros no sebo.");


        System.out.println(tarefas.obterNumeroTotalTarefas());

        tarefas.removerTarefa("Levar os livros no sebo.");
        System.out.println(tarefas.obterNumeroTotalTarefas());

        tarefas.obterDescricoesTarefas();
    }
}
