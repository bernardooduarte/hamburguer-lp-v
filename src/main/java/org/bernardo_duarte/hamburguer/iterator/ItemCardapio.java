package org.bernardo_duarte.hamburguer.iterator;

public class ItemCardapio {
    private final String nome;
    private final boolean vegetariano;

    public ItemCardapio(String nome, boolean vegetariano) {
        this.nome = nome;
        this.vegetariano = vegetariano;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }
}
