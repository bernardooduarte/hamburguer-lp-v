package org.bernardo_duarte.hamburguer.command;

public class AberturaTurnoTarefa implements Tarefa {
    private final Cozinha cozinha;

    public AberturaTurnoTarefa(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public void executar() {
        this.cozinha.abrirTurno();
    }

    @Override
    public void cancelar() {
        this.cozinha.fecharTurno();
    }
}
