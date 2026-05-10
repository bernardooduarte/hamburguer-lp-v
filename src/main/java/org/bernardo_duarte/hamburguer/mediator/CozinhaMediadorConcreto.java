package org.bernardo_duarte.hamburguer.mediator;

/**
 * Concrete Mediator - Implementação do mediador para a cozinha
 */
public class CozinhaMediadorConcreto implements CozinhaMediador {
    private Forno forno;
    private Panela panela;
    private Caixa caixa;

    @Override
    public void registrarForno(Forno forno) {
        this.forno = forno;
    }

    @Override
    public void registrarPanela(Panela panela) {
        this.panela = panela;
    }

    @Override
    public void registrarCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    @Override
    public void solicitarPreparo(String itens) {
        System.out.println("Mediador: Solicitando preparo de " + itens);
        
        if (itens.contains("pão")) {
            if (forno != null) {
                forno.assar();
            }
        }
        
        if (itens.contains("carne")) {
            if (panela != null) {
                panela.fritar();
            }
        }
    }

    @Override
    public void notificarPronto(String mensagem) {
        System.out.println("Mediador: " + mensagem);
        if (caixa != null) {
            caixa.empacotar(mensagem);
        }
    }

    @Override
    public void notificarEntrega(String mensagem) {
        System.out.println("Mediador: Preparado para entrega - " + mensagem);
    }
}
