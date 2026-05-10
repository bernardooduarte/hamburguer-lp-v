package org.bernardo_duarte.hamburguer.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {

    @Test
    void testHamburguerClassicoPreparacao() {
        ProcessoPreparacaoHamburguer hamburguer = new HamburguerClassico();
        // O template method deve executar sem erros
        hamburguer.preparar();
        assertTrue(true);
    }

    @Test
    void testHamburguerGourmetPreparacao() {
        ProcessoPreparacaoHamburguer hamburguer = new HamburguerGourmet();
        hamburguer.preparar();
        assertTrue(true);
    }

    @Test
    void testHamburguerVegetarianoPreparacao() {
        ProcessoPreparacaoHamburguer hamburguer = new HamburguerVegetariano();
        hamburguer.preparar();
        assertTrue(true);
    }

    @Test
    void testDiferentesImplementacoes() {
        ProcessoPreparacaoHamburguer classico = new HamburguerClassico();
        ProcessoPreparacaoHamburguer gourmet = new HamburguerGourmet();
        ProcessoPreparacaoHamburguer vegetariano = new HamburguerVegetariano();

        // Todos devem seguir o mesmo padrão de preparação
        assertNotNull(classico);
        assertNotNull(gourmet);
        assertNotNull(vegetariano);
    }
}
