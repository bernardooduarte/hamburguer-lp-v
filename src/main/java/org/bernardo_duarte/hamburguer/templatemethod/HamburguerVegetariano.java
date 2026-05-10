package org.bernardo_duarte.hamburguer.templatemethod;

/**
 * Concrete Template - Hambúrguer Vegetariano
 */
public class HamburguerVegetariano extends ProcessoPreparacaoHamburguer {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingredientes vegetarianos: Pão integral, hambúrguer de soja, abacate, rúcula");
    }

    @Override
    protected void montar() {
        System.out.println("Montando hambúrguer com camadas de vegetais frescos");
    }

    @Override
    protected void cozinhar() {
        System.out.println("Aquecendo brevemente: Hambúrguer de soja já vem pronto");
    }

    @Override
    protected void temperar() {
        System.out.println("Temperando com ervas finas e azeite");
    }

    @Override
    protected void embalar() {
        System.out.println("Embalando hambúrguer vegetariano em embalagem eco-friendly");
        super.embalar();
    }
}
