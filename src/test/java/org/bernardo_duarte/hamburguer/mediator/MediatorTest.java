package org.bernardo_duarte.hamburguer.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    private CozinhaMediador mediador;
    private Forno forno;
    private Panela panela;
    private Caixa caixa;

    @BeforeEach
    void setUp() {
        mediador = new CozinhaMediadorConcreto();
        forno = new Forno(mediador);
        panela = new Panela(mediador);
        caixa = new Caixa(mediador);
    }

    @Test
    void testRegistroDosComponentes() {
        assertNotNull(forno);
        assertNotNull(panela);
        assertNotNull(caixa);
    }

    @Test
    void testSolicitacaoPreparoComPao() {
        mediador.solicitarPreparo("pão e carne");
        // Teste verifica que a solicitação foi processada sem erros
        assertTrue(true);
    }

    @Test
    void testSolicitacaoPreparoComCarne() {
        mediador.solicitarPreparo("carne moída");
        // Teste verifica que a solicitação foi processada sem erros
        assertTrue(true);
    }

    @Test
    void testNotificacaoPronto() {
        mediador.notificarPronto("Hambúrguer pronto");
        assertTrue(true);
    }

    @Test
    void testNotificacaoEntrega() {
        mediador.notificarEntrega("Hambúrguer Classico");
        assertTrue(true);
    }
}
