package org.bernardo_duarte.hamburguer.visitor;

public interface Visitor {

    String exibirHamburguer(Hamburguer hamburguer);
    String exibirBebida(Bebida bebida);
    String exibirSobremesa(Sobremesa sobremesa);

}
