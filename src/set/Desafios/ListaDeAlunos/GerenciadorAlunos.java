package set.Desafios.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    void removerAluno(Long matricula) {
        Aluno alunoParaRemover = null;

        if (!alunos.isEmpty()) {
            for(Aluno a: alunos) {
                if(a.getMatricula().equals(matricula)) {
                    alunoParaRemover = a;
                    break;
                }
            }
        }

        alunos.remove(alunoParaRemover);
        System.out.println("Aluno " + alunoParaRemover + " foi removido da lista");
    }

    Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunos);
    }

    Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    void exibirAlunos() {
        System.out.println("Alunos: " + alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Rebeca", 784637L, 9);
        alunos.adicionarAluno("Flávio", 784632L, 9);
        alunos.adicionarAluno("Fonseca", 784631L, 7);
        alunos.adicionarAluno("Carla", 784634L, 5);
        alunos.adicionarAluno("Leandra", 784633L, 10);

        System.out.println("Por nome: " + alunos.exibirAlunosPorNome());
        System.out.println();
        System.out.println("Por nota: " + alunos.exibirAlunosPorNota());
        System.out.println();

        alunos.removerAluno(784631L);
        System.out.println();

        alunos.exibirAlunos();
    }
}
