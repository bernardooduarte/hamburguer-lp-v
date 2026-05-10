package org.bernardo_duarte.hamburguer.flyweight;

/**
 * Flyweight - Objeto compartilhado (condimento/tempero)
 */
public class Tempero {
    private String nome;
    private double preco;
    private String descricao;

    public Tempero(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return nome + " (" + descricao + ") - R$ " + String.format("%.2f", preco);
    }
}
