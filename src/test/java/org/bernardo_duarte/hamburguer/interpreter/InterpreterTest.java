package org.bernardo_duarte.hamburguer.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InterpreterTest {

    @Test
    void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 + 2");
        assertEquals(8.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 - 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 * 2");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 / 2");
        assertEquals(3.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 / 2 * 3 + 1 - 4");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveRetornarExcecaoElementoInvalido() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new InterpretadorExpressoesAritmeticas("2 ^ 2")
        );

        assertEquals("Expressao com elemento invalido", exception.getMessage());
    }

    @Test
    void deveRetornarExcecaoExpressaoInvalida() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new InterpretadorExpressoesAritmeticas("2 +")
        );

        assertEquals("Expressao invalida", exception.getMessage());
    }

    @Test
    void deveCalcularExpressaoComFormulaDaLanchonete() {
        Pedido pedido = new Pedido();
        pedido.setPrecoHamburguer(2.0);
        pedido.setPrecoBebida(5.0);

        assertEquals(9.0, pedido.calcularTotal());
    }
}
