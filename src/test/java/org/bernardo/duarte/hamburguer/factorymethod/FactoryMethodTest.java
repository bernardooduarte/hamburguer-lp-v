package org.bernardo.duarte.hamburguer.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FactoryMethodTest {

    @Test
    void deveCriarHamburguerDeCarne() {
        HamburguerFactory factory = new HamburguerCarneFactory();
        Hamburguer hamburguer = factory.criarHamburguer();

        assertInstanceOf(HamburguerCarne.class, hamburguer);
        assertEquals("Hamburguer de Carne", hamburguer.getNome());
        assertEquals(24.90, hamburguer.getPreco());
    }

    @Test
    void deveCriarHamburguerDeFrango() {
        HamburguerFactory factory = new HamburguerFrangoFactory();
        Hamburguer hamburguer = factory.criarHamburguer();

        assertInstanceOf(HamburguerFrango.class, hamburguer);
        assertEquals("Hamburguer de Frango", hamburguer.getNome());
        assertEquals(22.90, hamburguer.getPreco());
    }

    @Test
    void deveCriarHamburguerVegetariano() {
        HamburguerFactory factory = new HamburguerVegetarianoFactory();
        Hamburguer hamburguer = factory.criarHamburguer();

        assertInstanceOf(HamburguerVegetariano.class, hamburguer);
        assertEquals("Hamburguer Vegetariano", hamburguer.getNome());
        assertEquals(21.50, hamburguer.getPreco());
    }
}
