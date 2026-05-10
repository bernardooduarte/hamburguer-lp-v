package org.bernardo_duarte.hamburguer.composite;

/**
 * Leaf - Item simples do cardápio
 */
public class ItemSimples implements ComponenteCardapio {
    protected String nome;
    protected double preco;
    protected String descricao;

    public ItemSimples(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void adicionarComponente(ComponenteCardapio componente) {
        throw new UnsupportedOperationException("Não é possível adicionar componentes a um item simples");
    }

    @Override
    public void removerComponente(ComponenteCardapio componente) {
        throw new UnsupportedOperationException("Não é possível remover componentes de um item simples");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(nome + " - R$ " + String.format("%.2f", preco) + " (" + descricao + ")");
    }
}
