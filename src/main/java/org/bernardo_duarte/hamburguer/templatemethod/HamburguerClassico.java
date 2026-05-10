package org.bernardo_duarte.hamburguer.templatemethod;

/**
 * Concrete Template - Hambúrguer Clássico
 */
public class HamburguerClassico extends ProcessoPreparacaoHamburguer {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingredientes: Pão, carne, alface, tomate, cebola");
    }

    @Override
    protected void montar() {
        System.out.println("Montando hambúrguer: Pão de baixo + carne + vegetais + pão de cima");
    }

    @Override
    protected void cozinhar() {
        System.out.println("Cozinhando: Tostando o pão e fritando a carne");
    }

    @Override
    protected void temperar() {
        System.out.println("Temperando: Adicionando sal e pimenta na carne");
    }

    @Override
    protected void embalar() {
        System.out.println("Embalando hambúrguer clássico");
        super.embalar();
    }
}
