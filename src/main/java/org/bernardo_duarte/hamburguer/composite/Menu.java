package org.bernardo_duarte.hamburguer.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite - Menu que pode conter itens simples e compostos
 */
public class Menu implements ComponenteCardapio {
    private String nome;
    private List<ComponenteCardapio> itens = new ArrayList<>();

    public Menu(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarComponente(ComponenteCardapio componente) {
        itens.add(componente);
    }

    @Override
    public void removerComponente(ComponenteCardapio componente) {
        itens.remove(componente);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double totalPreco = 0;
        for (ComponenteCardapio item : itens) {
            totalPreco += item.getPreco();
        }
        return totalPreco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║       MENU: " + nome);
        System.out.println("╚════════════════════════════════════╝");
        for (ComponenteCardapio item : itens) {
            item.exibirDetalhes();
        }
        System.out.println("Preço Total do Menu: R$ " + String.format("%.2f", getPreco()));
        System.out.println("═════════════════════════════════════\n");
    }
}
