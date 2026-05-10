package org.bernardo_duarte.hamburguer.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite - Item composto que pode conter outros componentes
 */
public class ComboHamburguer implements ComponenteCardapio {
    private String nome;
    private List<ComponenteCardapio> componentes = new ArrayList<>();

    public ComboHamburguer(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarComponente(ComponenteCardapio componente) {
        componentes.add(componente);
    }

    @Override
    public void removerComponente(ComponenteCardapio componente) {
        componentes.remove(componente);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double totalPreco = 0;
        for (ComponenteCardapio componente : componentes) {
            totalPreco += componente.getPreco();
        }
        return totalPreco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n=== COMBO: " + nome + " ===");
        System.out.println("Componentes:");
        for (ComponenteCardapio componente : componentes) {
            System.out.print("  ");
            componente.exibirDetalhes();
        }
        System.out.println("Preço Total: R$ " + String.format("%.2f", getPreco()));
        System.out.println("============================\n");
    }
}
