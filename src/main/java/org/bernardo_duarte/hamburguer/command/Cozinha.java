package org.bernardo_duarte.hamburguer.command;

public class Cozinha {
    private final String turno;
    private String situacao;

    public Cozinha(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirTurno() {
        this.situacao = "Cozinha aberta";
    }

    public void fecharTurno() {
        this.situacao = "Cozinha fechada";
    }
}
