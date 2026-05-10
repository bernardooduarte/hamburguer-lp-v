package org.bernardo_duarte.hamburguer.templatemethod;

/**
 * Concrete Template - Hambúrguer Gourmet
 */
public class HamburguerGourmet extends ProcessoPreparacaoHamburguer {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingredientes premium: Pão artesanal, carne wagyu, bacon, queijo cheddar, maionese especial");
    }

    @Override
    protected void montar() {
        System.out.println("Montando hambúrguer gourmet com camadas especiais");
    }

    @Override
    protected void cozinhar() {
        System.out.println("Cozinhando em forno de alta temperatura: 2 minutos cada lado");
    }

    @Override
    protected void temperar() {
        System.out.println("Temperando com sal grosso, pimenta e alho");
    }

    @Override
    protected void embalar() {
        System.out.println("Embalando hambúrguer gourmet em caixa premium");
        super.embalar();
    }
}
