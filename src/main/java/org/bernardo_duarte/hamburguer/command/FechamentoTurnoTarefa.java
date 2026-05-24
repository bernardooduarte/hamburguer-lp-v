package org.bernardo_duarte.hamburguer.command;

public class FechamentoTurnoTarefa implements Tarefa {
    private final Cozinha cozinha;

    public FechamentoTurnoTarefa(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public void executar() {
        this.cozinha.fecharTurno();
    }

    @Override
    public void cancelar() {
        this.cozinha.abrirTurno();
    }
}
