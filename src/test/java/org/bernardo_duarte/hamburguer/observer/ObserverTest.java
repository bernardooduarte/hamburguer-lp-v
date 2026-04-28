package org.bernardo_duarte.hamburguer.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverTest {

    @Test
    void deveNotificarObservadoresQuandoOStatusMudar() {
        Pedido pedido = new Pedido();
        ClienteObserver clienteObserver = new ClienteObserver();
        CozinhaObserver cozinhaObserver = new CozinhaObserver();

        pedido.adicionarObservador(clienteObserver);
        pedido.adicionarObservador(cozinhaObserver);

        pedido.alterarStatus("Pedido de hamburguer em preparo");

        assertEquals("Pedido de hamburguer em preparo", pedido.getStatus());
        assertEquals(1, clienteObserver.getNotificacoes().size());
        assertEquals(1, cozinhaObserver.getNotificacoes().size());
        assertEquals("Cliente avisado: Pedido de hamburguer em preparo", clienteObserver.getNotificacoes().get(0));
        assertEquals("Cozinha recebeu: Pedido de hamburguer em preparo", cozinhaObserver.getNotificacoes().get(0));
    }

    @Test
    void devePermitirRemoverObservador() {
        Pedido pedido = new Pedido();
        ClienteObserver clienteObserver = new ClienteObserver();
        CozinhaObserver cozinhaObserver = new CozinhaObserver();

        pedido.adicionarObservador(clienteObserver);
        pedido.adicionarObservador(cozinhaObserver);
        pedido.removerObservador(clienteObserver);

        pedido.alterarStatus("Pedido pronto para retirada");

        assertEquals(0, clienteObserver.getNotificacoes().size());
        assertEquals(1, cozinhaObserver.getNotificacoes().size());
    }
}