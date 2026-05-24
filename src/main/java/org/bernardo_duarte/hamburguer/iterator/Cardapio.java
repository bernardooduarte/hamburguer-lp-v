package org.bernardo_duarte.hamburguer.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cardapio implements Iterable<ItemCardapio> {
    private final List<ItemCardapio> itens = new ArrayList<>();

    public Cardapio(ItemCardapio... itens) {
        this.itens.addAll(Arrays.asList(itens));
    }

    @Override
    public Iterator<ItemCardapio> iterator() {
        return itens.iterator();
    }
}
