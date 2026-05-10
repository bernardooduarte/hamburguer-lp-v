package org.bernardo_duarte.hamburguer.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Contexto Flyweight - Uso de Flyweights compartilhados
 * Cada receita mantém referências aos temperos (não cópias)
 */
public class ReceitaHamburguer {
    private String nome;
    private List<Tempero> temperos = new ArrayList<>();

    public ReceitaHamburguer(String nome) {
        this.nome = nome;
    }

    public void adicionarTempero(Tempero tempero) {
        temperos.add(tempero);
    }

    public void adicionarTempero(String chaveTempero) {
        Tempero tempero = FabricaTempero.getInstance().obterTempero(chaveTempero);
        if (tempero != null) {
            temperos.add(tempero);
        }
    }

    public String getNome() {
        return nome;
    }

    public double calcularCustoTemperos() {
        double custo = 0;
        for (Tempero tempero : temperos) {
            custo += tempero.getPreco();
        }
        return custo;
    }

    public void exibirReceita() {
        System.out.println("\n=== RECEITA: " + nome + " ===");
        System.out.println("Temperos utilizados:");
        for (Tempero tempero : temperos) {
            System.out.println("  - " + tempero);
        }
        System.out.println("Custo total de temperos: R$ " + String.format("%.2f", calcularCustoTemperos()));
        System.out.println("====================================\n");
    }
}
