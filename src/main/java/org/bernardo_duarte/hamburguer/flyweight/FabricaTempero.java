package org.bernardo_duarte.hamburguer.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory - Gerencia e compartilha instâncias de temperos
 * Este padrão garante que objetos iguais sejam reutilizados em vez de criar novos
 */
public class FabricaTempero {
    private static FabricaTempero instancia;
    private Map<String, Tempero> temperos = new HashMap<>();

    private FabricaTempero() {
        // Inicializa com alguns temperos padrão
        inicializarTemperos();
    }

    public static synchronized FabricaTempero getInstance() {
        if (instancia == null) {
            instancia = new FabricaTempero();
        }
        return instancia;
    }

    private void inicializarTemperos() {
        temperos.put("SAL", new Tempero("Sal", 0.50, "Sal fino"));
        temperos.put("PIMENTA", new Tempero("Pimenta", 0.75, "Pimenta do reino"));
        temperos.put("ALHO", new Tempero("Alho", 1.00, "Alho em pó"));
        temperos.put("CEBOLA", new Tempero("Cebola", 1.50, "Cebola em pó"));
        temperos.put("OREGANO", new Tempero("Orégano", 2.00, "Orégano desidratado"));
        temperos.put("COMINHO", new Tempero("Cominho", 2.50, "Cominho em pó"));
        temperos.put("PAPRICA", new Tempero("Páprica", 3.00, "Páprica defumada"));
        temperos.put("MOSTARDA", new Tempero("Mostarda", 1.75, "Mostarda amarela"));
    }

    /**
     * Obtém um tempero compartilhado da fábrica
     * Se não existir, cria um novo e o armazena
     */
    public Tempero obterTempero(String chave, String nome, double preco, String descricao) {
        if (!temperos.containsKey(chave)) {
            Tempero novoTempero = new Tempero(nome, preco, descricao);
            temperos.put(chave, novoTempero);
            System.out.println("Criando novo tempero: " + chave);
        } else {
            System.out.println("Reutilizando tempero do pool: " + chave);
        }
        return temperos.get(chave);
    }

    /**
     * Obtém um tempero pelo nome (usando o padrão pré-configurado)
     */
    public Tempero obterTempero(String chave) {
        return temperos.get(chave);
    }

    /**
     * Lista todos os temperos em memória
     */
    public void exibirTemperos() {
        System.out.println("\n=== TEMPEROS EM POOL ===");
        temperos.forEach((chave, tempero) -> {
            System.out.println(chave + ": " + tempero);
        });
        System.out.println("Total de temperos: " + temperos.size() + "\n");
    }

    /**
     * Retorna o número de temperos em memória (para demonstrar o compartilhamento)
     */
    public int getTotalTemperos() {
        return temperos.size();
    }
}
