package org.bernardo_duarte.hamburguer.templatemethod;

/**
 * Template Method - Define o esqueleto do algoritmo de preparação do hambúrguer
 */
public abstract class ProcessoPreparacaoHamburguer {
    
    /**
     * Template method - Define a estrutura do processo
     */
    public final void preparar() {
        prepararIngredientes();
        montar();
        cozinhar();
        temperar();
        embalar();
    }

    protected abstract void prepararIngredientes();

    protected abstract void montar();

    protected abstract void cozinhar();

    protected abstract void temperar();

    protected void embalar() {
        System.out.println("Embalando hambúrguer em caixa de papelão");
    }
}
