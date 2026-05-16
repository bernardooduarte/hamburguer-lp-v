package org.bernardo_duarte.hamburguer.visitor;

public class ItemPedidoVisitor implements Visitor {

    public String exibir(ItemPedido itemPedido) {
        return itemPedido.aceitar(this);
    }

    @Override
    public String exibirHamburguer(Hamburguer hamburguer) {
        return "Hamburguer{" +
                "codigo=" + hamburguer.getCodigo() +
                ", nome='" + hamburguer.getNome() + '\'' +
                ", categoria=" + hamburguer.getNomeCategoria() +
                '}';
    }

    @Override
    public String exibirBebida(Bebida bebida) {
        return "Bebida{" +
                "codigo=" + bebida.getCodigo() +
                ", nome='" + bebida.getNome() + '\'' +
                ", tamanho='" + bebida.getTamanho() + '\'' +
                '}';
    }

    @Override
    public String exibirSobremesa(Sobremesa sobremesa) {
        return "Sobremesa{" +
                "codigo=" + sobremesa.getCodigo() +
                ", nome='" + sobremesa.getNome() + '\'' +
                ", preco=" + sobremesa.getPreco() +
                '}';
    }
}
