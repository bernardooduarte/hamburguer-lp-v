package org.bernardo_duarte.hamburguer.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemPedidoVisitorTest {

    @Test
    void deveExibirHamburguer() {
        Hamburguer hamburguer = new Hamburguer(1, "X-Bacon", new CategoriaHamburguer("Artesanal"));

        ItemPedidoVisitor visitor = new ItemPedidoVisitor();
        assertEquals("Hamburguer{codigo=1, nome='X-Bacon', categoria=Artesanal}", visitor.exibir(hamburguer));
    }

    @Test
    void deveExibirBebida() {
        Bebida bebida = new Bebida(2, "Refrigerante", "Grande");

        ItemPedidoVisitor visitor = new ItemPedidoVisitor();
        assertEquals("Bebida{codigo=2, nome='Refrigerante', tamanho='Grande'}", visitor.exibir(bebida));
    }

    @Test
    void deveExibirSobremesa() {
        Sobremesa sobremesa = new Sobremesa(3, "Brownie", 11.9f);

        ItemPedidoVisitor visitor = new ItemPedidoVisitor();
        assertEquals("Sobremesa{codigo=3, nome='Brownie', preco=11.9}", visitor.exibir(sobremesa));
    }

}
