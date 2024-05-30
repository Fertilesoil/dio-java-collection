package set.Desafios.ListaDeTarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa(String descricao, boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if(!status) {
            return "{" + "descricao: '" + descricao + ", status: " + "pendente" + '}';
        }
        return "{" + "descricao: '" + descricao + ", status: " + "concluída" + '}';
    }
}
