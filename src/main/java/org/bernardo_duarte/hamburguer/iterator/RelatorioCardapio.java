package org.bernardo_duarte.hamburguer.iterator;

import java.util.Iterator;

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
        Iterator<ItemCardapio> iterator = cardapio.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            quantidade++;
        }
        return quantidade;
    }
}
