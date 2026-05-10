package org.bernardo_duarte.hamburguer.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void testConstroiHamburguerComTodosOsComponentes() {
        HamburguerPersonalizado hamburguer = new ConstrutorHamburguer()
                .comPao("Pão de Brioche")
                .comCarne("Carne Wagyu")
                .adicionarVegetal("Alface")
                .adicionarVegetal("Tomate")
                .adicionarQueijo("Cheddar")
                .adicionarQueijo("Brie")
                .adicionarMolho("Maionese")
                .adicionarMolho("Mostarda")
                .adicionarComplemento("Bacon")
                .adicionarComplemento("Ovo")
                .construir();

        assertNotNull(hamburguer);
        assertEquals("Hambúrguer Personalizado com Carne Wagyu", hamburguer.getNome());
        assertTrue(hamburguer.getPreco() > 25.00);
    }

    @Test
    void testConstroiHamburguerSimples() {
        HamburguerPersonalizado hamburguer = new ConstrutorHamburguer()
                .comPao("Pão Francês")
                .comCarne("Carne Normal")
                .construir();

        assertNotNull(hamburguer);
        assertEquals(25.00, hamburguer.getPreco());
    }

    @Test
    void testConstroiHamburguerComMultiplosQueijos() {
        HamburguerPersonalizado hamburguer = new ConstrutorHamburguer()
                .comPao("Pão Integral")
                .comCarne("Carne Magra")
                .adicionarQueijo("Queijo Meia Cura")
                .adicionarQueijo("Parmesão")
                .adicionarQueijo("Mozzarela")
                .construir();

        assertNotNull(hamburguer);
        assertEquals(3, hamburguer.getQueijos().size());
        assertEquals(32.50, hamburguer.getPreco()); // 25 + 2.50 * 3
    }

    @Test
    void testErroQuandoFaltamIngredientesObrigatorios() {
        ConstrutorHamburguer construtor = new ConstrutorHamburguer();
        
        assertThrows(IllegalStateException.class, () -> {
            construtor.construir(); // Deve lançar erro pois falta pão e carne
        });
    }

    @Test
    void testDescricaoCompleta() {
        HamburguerPersonalizado hamburguer = new ConstrutorHamburguer()
                .comPao("Pão Artesanal")
                .comCarne("Carne Prime")
                .adicionarVegetal("Rúcula")
                .adicionarQueijo("Gouda")
                .construir();

        String descricao = hamburguer.getDescricaoCompleta();
        assertTrue(descricao.contains("HAMBÚRGUER PERSONALIZADO"));
        assertTrue(descricao.contains("Pão Artesanal"));
        assertTrue(descricao.contains("Carne Prime"));
    }
}
