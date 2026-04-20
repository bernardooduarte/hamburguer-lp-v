package org.bernardo.duarte.hamburguer.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class PedidoIdGeneratorTest {

    @BeforeEach
    void limparSequencia() {
        PedidoIdGenerator.getInstance().reiniciar();
    }

    @Test
    void deveRetornarSempreMesmaInstancia() {
        PedidoIdGenerator instancia1 = PedidoIdGenerator.getInstance();
        PedidoIdGenerator instancia2 = PedidoIdGenerator.getInstance();

        assertSame(instancia1, instancia2);
    }

    @Test
    void deveIncrementarIdsSequencialmente() {
        PedidoIdGenerator generator = PedidoIdGenerator.getInstance();

        assertEquals(1, generator.proximoId());
        assertEquals(2, generator.proximoId());
        assertEquals(3, generator.proximoId());
    }
}
