package org.bernardo_duarte.hamburguer.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandTest {
    private GerenteTurno gerenteTurno;
    private Cozinha cozinha;

    @BeforeEach
    void setUp() {
        gerenteTurno = new GerenteTurno();
        cozinha = new Cozinha("Noite");
    }

    @Test
    void deveAbrirTurnoCozinha() {
        Tarefa aberturaTurno = new AberturaTurnoTarefa(cozinha);
        gerenteTurno.executarTarefa(aberturaTurno);

        assertEquals("Cozinha aberta", cozinha.getSituacao());
    }

    @Test
    void deveFecharTurnoCozinha() {
        Tarefa fechamentoTurno = new FechamentoTurnoTarefa(cozinha);
        gerenteTurno.executarTarefa(fechamentoTurno);

        assertEquals("Cozinha fechada", cozinha.getSituacao());
    }

    @Test
    void deveCancelarFechamentoTurnoCozinha() {
        Tarefa aberturaTurno = new AberturaTurnoTarefa(cozinha);
        Tarefa fechamentoTurno = new FechamentoTurnoTarefa(cozinha);

        gerenteTurno.executarTarefa(aberturaTurno);
        gerenteTurno.executarTarefa(fechamentoTurno);
        gerenteTurno.cancelarUltimaTarefa();

        assertEquals("Cozinha aberta", cozinha.getSituacao());
    }
}
