package org.bernardo_duarte.hamburguer.visitor;

public class Bebida implements ItemPedido {

    private int codigo;
    private String nome;
    private String tamanho;

    public Bebida(int codigo, String nome, String tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirBebida(this);
    }

}
