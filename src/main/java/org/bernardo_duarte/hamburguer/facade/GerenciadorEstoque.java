package org.bernardo_duarte.hamburguer.facade;

/**
 * Subsistema - Gerenciador de Estoque
 */
public class GerenciadorEstoque {
    public boolean verificarDisponibilidade(String ingrediente, int quantidade) {
        System.out.println("Verificando disponibilidade de " + ingrediente);
        return true; // Simplificado para exemplo
    }

    public void registrarSaida(String ingrediente, int quantidade) {
        System.out.println("Registrando saída de " + quantidade + " unidades de " + ingrediente);
    }
}
