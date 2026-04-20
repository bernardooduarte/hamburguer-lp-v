package org.bernardo.duarte.hamburguer.decorator;

import org.bernardo.duarte.hamburguer.factorymethod.Hamburguer;
import org.bernardo.duarte.hamburguer.factorymethod.HamburguerCarneFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DecoratorTest {

    @Test
    void deveAdicionarAdicionaisNoHamburguer() {
        Hamburguer base = new HamburguerCarneFactory().criarHamburguer();
        HamburguerMontavel montavel = new HamburguerBaseAdapter(base);
        montavel = new QueijoExtraDecorator(montavel);
        montavel = new BaconDecorator(montavel);
        montavel = new MolhoEspecialDecorator(montavel);

        assertTrue(montavel.getDescricao().contains("queijo extra"));
        assertTrue(montavel.getDescricao().contains("bacon"));
        assertTrue(montavel.getDescricao().contains("molho especial"));
        assertEquals(34.9, montavel.getPreco(), 0.001);
    }
}
