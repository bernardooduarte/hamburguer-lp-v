package org.bernardo_duarte.hamburguer.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void testHamburguerComCoberturadeQueijo() {
        HamburguerComEstrategia hamburguer = new HamburguerComEstrategia("Hamburguesa Dupla", 35.00);
        hamburguer.setEstrategiaCobertura(new CoberturaQueijo("Cheddar"));

        assertEquals("Hamburguesa Dupla", hamburguer.getNome());
        assertEquals(38.50, hamburguer.getPreco());
        assertTrue(hamburguer.prepararComCobertura().contains("Queijo"));
    }

    @Test
    void testHamburguerComCoberturadeOvo() {
        HamburguerComEstrategia hamburguer = new HamburguerComEstrategia("Hamburguesa Tripla", 40.00);
        hamburguer.setEstrategiaCobertura(new CoberturaOvo(true));

        assertEquals("Hamburguesa Tripla", hamburguer.getNome());
        assertEquals(42.50, hamburguer.getPreco());
        assertTrue(hamburguer.prepararComCobertura().contains("Ovo"));
    }

    @Test
    void testHamburguerComCoberturaBacon() {
        HamburguerComEstrategia hamburguer = new HamburguerComEstrategia("Hamburgão Bacon", 38.00);
        hamburguer.setEstrategiaCobertura(new CoberturaBacon(3));

        assertEquals("Hamburgão Bacon", hamburguer.getNome());
        assertEquals(42.00, hamburguer.getPreco());
        assertTrue(hamburguer.prepararComCobertura().contains("Bacon"));
    }

    @Test
    void testTrocaDeEstrategia() {
        HamburguerComEstrategia hamburguer = new HamburguerComEstrategia("Hamburguesa", 30.00);
        
        hamburguer.setEstrategiaCobertura(new CoberturaQueijo("Mozzarela"));
        double precoComQueijo = hamburguer.getPreco();
        
        hamburguer.setEstrategiaCobertura(new CoberturaOvo(false));
        double precoComOvo = hamburguer.getPreco();
        
        assertNotEquals(precoComQueijo, precoComOvo);
    }

    @Test
    void testHamburguerSemCobertura() {
        HamburguerComEstrategia hamburguer = new HamburguerComEstrategia("Hamburguesa Simples", 20.00);
        
        assertEquals(20.00, hamburguer.getPreco());
        assertTrue(hamburguer.prepararComCobertura().contains("simples"));
    }
}
