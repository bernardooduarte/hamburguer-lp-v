package org.bernardo_duarte.hamburguer.proxy;

public class Funcionario {
    private final String nome;
    private final boolean gerente;

    public Funcionario(String nome, boolean gerente) {
        this.nome = nome;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public boolean isGerente() {
        return gerente;
    }
}
