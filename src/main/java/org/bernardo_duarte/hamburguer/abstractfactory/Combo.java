package org.bernardo_duarte.hamburguer.abstractfactory;

import org.bernardo_duarte.hamburguer.factorymethod.Hamburguer;

public class Combo {
    private final Hamburguer hamburguer;
    private final Acompanhamento acompanhamento;
    private final Sobremesa sobremesa;

    public Combo(Hamburguer hamburguer, Acompanhamento acompanhamento, Sobremesa sobremesa) {
        this.hamburguer = hamburguer;
        this.acompanhamento = acompanhamento;
        this.sobremesa = sobremesa;
    }

    public static Combo criar(ComboFactory factory) {
        return new Combo(factory.criarHamburguer(), factory.criarAcompanhamento(), factory.criarSobremesa());
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }

    public double getPrecoTotal() {
        return hamburguer.getPreco() + acompanhamento.getPreco() + sobremesa.getPreco();
    }

    public String descricao() {
        return hamburguer.getNome() + " + " + acompanhamento.getNome() + " + " + sobremesa.getNome();
    }
}
