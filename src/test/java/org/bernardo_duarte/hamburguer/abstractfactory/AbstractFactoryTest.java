package org.bernardo_duarte.hamburguer.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AbstractFactoryTest {

    @Test
    void deveMontarComboGourmetCompleto() {
        ComboFactory factory = new ComboGourmetFactory();
        Combo combo = Combo.criar(factory);

        assertInstanceOf(BatataRustica.class, combo.getAcompanhamento());
        assertInstanceOf(Brownie.class, combo.getSobremesa());
        assertEquals("Hamburguer de Carne + Batata Rustica + Brownie", combo.descricao());
        assertEquals(46.7, combo.getPrecoTotal(), 0.001);
    }

    @Test
    void deveMontarComboSaudavelCompleto() {
        ComboFactory factory = new ComboSaudavelFactory();
        Combo combo = Combo.criar(factory);

        assertInstanceOf(SaladaVerde.class, combo.getAcompanhamento());
        assertInstanceOf(FrutaCortada.class, combo.getSobremesa());
        assertEquals("Hamburguer Vegetariano + Salada Verde + Fruta Cortada", combo.descricao());
        assertEquals(37.4, combo.getPrecoTotal(), 0.001);
    }
}
