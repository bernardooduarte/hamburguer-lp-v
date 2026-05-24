package org.bernardo_duarte.hamburguer.command;

import java.util.ArrayList;
import java.util.List;

public class GerenteTurno {
    private final List<Tarefa> tarefas = new ArrayList<>();

    public void executarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (!tarefas.isEmpty()) {
            Tarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }
}
