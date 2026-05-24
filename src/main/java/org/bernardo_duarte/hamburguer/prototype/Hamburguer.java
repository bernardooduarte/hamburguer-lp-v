package org.bernardo_duarte.hamburguer.prototype;

public class Hamburguer implements Cloneable {
    private int codigo;
    private String nome;
    private Ingrediente ingrediente;
    private String tipoPao;

    public Hamburguer(int codigo, String nome, Ingrediente ingrediente, String tipoPao) {
        this.codigo = codigo;
        this.nome = nome;
        this.ingrediente = ingrediente;
        this.tipoPao = tipoPao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    @Override
    public Hamburguer clone() throws CloneNotSupportedException {
        Hamburguer hamburguerClone = (Hamburguer) super.clone();
        hamburguerClone.ingrediente = hamburguerClone.ingrediente.clone();
        return hamburguerClone;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", ingrediente=" + ingrediente +
                ", tipoPao='" + tipoPao + '\'' +
                '}';
    }
}
