package org.bernardo_duarte.hamburguer.iterator;

public class RelatorioCardapio {
    public static int contarItensVegetarianos(Cardapio cardapio) {
        int quantidade = 0;
        for (ItemCardapio item : cardapio) {
            if (item.isVegetariano()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int contarTotalItens(Cardapio cardapio) {
        int quantidade = 0;
        for (ItemCardapio item : cardapio) {
            quantidade++;
        }
        return quantidade;
    }
}
