package org.bernardo_duarte.hamburguer.flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {

    private FabricaTempero fabrica;

    @BeforeEach
    void setUp() {
        fabrica = FabricaTempero.getInstance();
    }

    @Test
    void testObtenerTemperoCompartilhado() {
        Tempero sal1 = fabrica.obterTempero("SAL");
        Tempero sal2 = fabrica.obterTempero("SAL");
        
        // Mesmo objeto deve ser retornado (compartilhado)
        assertSame(sal1, sal2);
    }

    @Test
    void testDiferentesTemperos() {
        Tempero sal = fabrica.obterTempero("SAL");
        Tempero pimenta = fabrica.obterTempero("PIMENTA");
        
        assertNotSame(sal, pimenta);
        assertNotEquals(sal.getNome(), pimenta.getNome());
    }

    @Test
    void testCriacaoDeNovoTemperoCustomizado() {
        int totalAntes = fabrica.getTotalTemperos();
        
        Tempero novo = fabrica.obterTempero("ALECRIM", "Alecrim", 1.50, "Erva fresca");
        int totalDepois = fabrica.getTotalTemperos();
        
        assertTrue(totalDepois > totalAntes);
    }

    @Test
    void testReceitaCompartilhaTemperos() {
        ReceitaHamburguer receita1 = new ReceitaHamburguer("Receita Premium");
        ReceitaHamburguer receita2 = new ReceitaHamburguer("Receita Clássica");
        
        Tempero sal = fabrica.obterTempero("SAL");
        
        receita1.adicionarTempero(sal);
        receita2.adicionarTempero(sal);
        
        // Ambas usam o mesmo objeto de sal
        assertNotNull(receita1);
        assertNotNull(receita2);
    }

    @Test
    void testReceitaComMultiplosTemperos() {
        ReceitaHamburguer receita = new ReceitaHamburguer("Receita Gourmet");
        
        receita.adicionarTempero("SAL");
        receita.adicionarTempero("PIMENTA");
        receita.adicionarTempero("ALHO");
        receita.adicionarTempero("OREGANO");
        
        double custo = receita.calcularCustoTemperos();
        assertTrue(custo > 0);
    }

    @Test
    void testObtenerTemperosPorChave() {
        Tempero mostarda = fabrica.obterTempero("MOSTARDA");
        
        assertNotNull(mostarda);
        assertEquals("Mostarda", mostarda.getNome());
        assertEquals(1.75, mostarda.getPreco());
    }

    @Test
    void testMultiplasReceitasCompartilhamMasmosTemperos() {
        int totalAntes = fabrica.getTotalTemperos();
        
        ReceitaHamburguer receita1 = new ReceitaHamburguer("R1");
        ReceitaHamburguer receita2 = new ReceitaHamburguer("R2");
        ReceitaHamburguer receita3 = new ReceitaHamburguer("R3");
        
        // Todas usam os mesmos temperos
        receita1.adicionarTempero("SAL");
        receita1.adicionarTempero("PIMENTA");
        
        receita2.adicionarTempero("SAL");
        receita2.adicionarTempero("ALHO");
        
        receita3.adicionarTempero("PIMENTA");
        receita3.adicionarTempero("OREGANO");
        
        int totalDepois = fabrica.getTotalTemperos();
        
        // Nenhum novo tempero foi criado (todos já existiam)
        assertEquals(totalAntes, totalDepois);
    }
}
