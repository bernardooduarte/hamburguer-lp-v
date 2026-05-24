package org.bernardo_duarte.hamburguer.proxy;

import java.util.Arrays;
import java.util.List;

public class Hamburguer implements IHamburguer {
    private Integer codigo;
    private String nome;
    private String categoria;
    private List<String> ingredientesSecretos;

    public Hamburguer(int codigo) {
        this.codigo = codigo;
        Hamburguer objeto = BD.getHamburguer(codigo);
        this.nome = objeto.nome;
        this.categoria = objeto.categoria;
        this.ingredientesSecretos = objeto.ingredientesSecretos;
    }

    public Hamburguer(Integer codigo, String nome, String categoria, String... ingredientesSecretos) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.ingredientesSecretos = Arrays.asList(ingredientesSecretos);
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterDadosCardapio() {
        return Arrays.asList(this.nome, this.categoria);
    }

    @Override
    public List<String> obterIngredientesSecretos(Funcionario funcionario) {
        return this.ingredientesSecretos;
    }
}
