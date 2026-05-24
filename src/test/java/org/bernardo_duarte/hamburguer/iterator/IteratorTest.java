package org.bernardo_duarte.hamburguer.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IteratorTest {

    @Test
    void deveContarItensVegetarianosCardapio() {
        Cardapio cardapio = new Cardapio(
                new ItemCardapio("Hamburguer de Carne", false),
                new ItemCardapio("Hamburguer de Frango", false),
                new ItemCardapio("Hamburguer Vegetariano", true),
                new ItemCardapio("Salada", true)
        );

        assertEquals(2, RelatorioCardapio.contarItensVegetarianos(cardapio));
    }

    @Test
    void deveContarTotalItensCardapio() {
        Cardapio cardapio = new Cardapio(
                new ItemCardapio("Hamburguer de Carne", false),
                new ItemCardapio("Hamburguer de Frango", false),
                new ItemCardapio("Hamburguer Vegetariano", true),
                new ItemCardapio("Salada", true)
        );

        assertEquals(4, RelatorioCardapio.contarTotalItens(cardapio));
    }
}
