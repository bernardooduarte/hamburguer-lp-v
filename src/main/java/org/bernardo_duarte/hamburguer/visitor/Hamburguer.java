package org.bernardo_duarte.hamburguer.visitor;

public class Hamburguer implements ItemPedido {

    private int codigo;
    private String nome;
    private CategoriaHamburguer categoria;

    public Hamburguer(int codigo, String nome, CategoriaHamburguer categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirHamburguer(this);
    }

}
