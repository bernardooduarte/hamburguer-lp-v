package org.bernardo_duarte.hamburguer.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterTest {

    @Test
    void deveRetornarPreparoHamburguer() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setPreparo("demorado");

        assertEquals("demorado", hamburguer.getPreparo());
    }

    @Test
    void deveRetornarTempoPreparoHamburguer() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setPreparo("demorado");

        assertEquals(12.0f, hamburguer.getTempoPreparo());
    }
}
