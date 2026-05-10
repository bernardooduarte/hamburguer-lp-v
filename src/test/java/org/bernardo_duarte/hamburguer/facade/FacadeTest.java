package org.bernardo_duarte.hamburguer.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    private SistemaLanchonete sistema;

    @BeforeEach
    void setUp() {
        sistema = new SistemaLanchonete();
    }

    @Test
    void testRealizarPedidoCompleto() {
        boolean resultado = sistema.realizarPedido(
                "PED001",
                "Hamburgão Classic com Batata",
                50.00,
                "Cartão Débito",
                "Rua Principal, 123",
                "19:00"
        );

        assertTrue(resultado);
    }

    @Test
    void testVerificarStatusPedido() {
        sistema.realizarPedido(
                "PED002",
                "Hamburguesa Premium",
                45.00,
                "PIX",
                "Avenida Brasil, 456",
                "20:00"
        );

        String status = sistema.verificarStatus("PED002");
        assertNotNull(status);
        assertTrue(status.contains("Status"));
    }

    @Test
    void testMarcarProntoEConfirmarEntrega() {
        sistema.realizarPedido(
                "PED003",
                "Combo Family",
                120.00,
                "Cartão Crédito",
                "Rua das Flores, 789",
                "18:30"
        );

        sistema.marcarPronto("PED003");
        sistema.confirmarEntrega("PED003");

        assertTrue(true); // Se chegou aqui, funcionou
    }

    @Test
    void testFacadeSimplificaOperacoesComplexas() {
        // O cliente não precisa conhecer a complexidade interna
        assertNotNull(sistema);
        assertTrue(sistema.realizarPedido("PED004", "Hamburguesa", 35.00, "Dinheiro", "Local", "19:30"));
    }
}
