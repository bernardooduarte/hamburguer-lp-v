package org.bernardo_duarte.hamburguer.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrototypeTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Hamburguer hamburguer = new Hamburguer(1, "Burger Original", new Ingrediente("Queijo", 2), "Brioche");

        Hamburguer hamburguerClone = hamburguer.clone();
        hamburguerClone.setCodigo(2);
        hamburguerClone.setNome("Burger Clonado");
        hamburguerClone.getIngrediente().setQuantidade(3);

        assertEquals("Hamburguer{codigo=1, nome='Burger Original', ingrediente=Ingrediente{nome='Queijo', quantidade=2}, tipoPao='Brioche'}", hamburguer.toString());
        assertEquals("Hamburguer{codigo=2, nome='Burger Clonado', ingrediente=Ingrediente{nome='Queijo', quantidade=3}, tipoPao='Brioche'}", hamburguerClone.toString());
    }
}
