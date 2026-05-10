package org.bernardo_duarte.hamburguer.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void testItemSimples() {
        ItemSimples hamburguer = new ItemSimples("Hamburgão Classic", 30.00, "Carne, pão, salada");
        
        assertEquals("Hamburgão Classic", hamburguer.getNome());
        assertEquals(30.00, hamburguer.getPreco());
    }

    @Test
    void testComboComDoisItens() {
        ComboHamburguer combo = new ComboHamburguer("Combo Família");
        
        ItemSimples hamburguer1 = new ItemSimples("Hamburgão", 30.00, "Grande");
        ItemSimples hamburguer2 = new ItemSimples("Hamburgesa", 25.00, "Média");
        
        combo.adicionarComponente(hamburguer1);
        combo.adicionarComponente(hamburguer2);
        
        assertEquals(55.00, combo.getPreco());
    }

    @Test
    void testComboComMultiplosItens() {
        ComboHamburguer combo = new ComboHamburguer("Combo Premium");
        
        combo.adicionarComponente(new ItemSimples("Hamburguesa", 35.00, "Premium"));
        combo.adicionarComponente(new ItemSimples("Batata Frita", 8.00, "Grande"));
        combo.adicionarComponente(new ItemSimples("Refrigerante", 5.00, "2L"));
        combo.adicionarComponente(new ItemSimples("Sobremesa", 12.00, "Brownie"));
        
        assertEquals(60.00, combo.getPreco());
    }

    @Test
    void testRemoverComponentesDoCombo() {
        ComboHamburguer combo = new ComboHamburguer("Combo Simples");
        
        ItemSimples hamburguer = new ItemSimples("Hamburgão", 30.00, "Grande");
        ItemSimples bebida = new ItemSimples("Refrigerante", 5.00, "Médio");
        
        combo.adicionarComponente(hamburguer);
        combo.adicionarComponente(bebida);
        
        assertEquals(35.00, combo.getPreco());
        
        combo.removerComponente(bebida);
        assertEquals(30.00, combo.getPreco());
    }

    @Test
    void testMenuComMultiplosItensECombos() {
        Menu menu = new Menu("Menu Gourmet");
        
        ItemSimples hamburguer = new ItemSimples("Hamburgão Especial", 45.00, "Gourmet");
        ItemSimples batata = new ItemSimples("Batata Rústica", 12.00, "Especial");
        
        ComboHamburguer combo = new ComboHamburguer("Combo Completo");
        combo.adicionarComponente(new ItemSimples("Hamburguesa", 40.00, "Premium"));
        combo.adicionarComponente(new ItemSimples("Molho Especial", 3.00, "Gourmet"));
        
        menu.adicionarComponente(hamburguer);
        menu.adicionarComponente(batata);
        menu.adicionarComponente(combo);
        
        double precoTotal = menu.getPreco();
        assertEquals(100.00, precoTotal); // 45 + 12 + 40 + 3
    }

    @Test
    void testItemSimplesCantAddComponents() {
        ItemSimples item = new ItemSimples("Item", 10.00, "Desc");
        ItemSimples outro = new ItemSimples("Outro", 5.00, "Desc");
        
        assertThrows(UnsupportedOperationException.class, () -> {
            item.adicionarComponente(outro);
        });
    }
}
