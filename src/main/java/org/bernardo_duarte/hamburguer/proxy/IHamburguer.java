package org.bernardo_duarte.hamburguer.proxy;

import java.util.List;

public interface IHamburguer {
    List<String> obterDadosCardapio();
    List<String> obterIngredientesSecretos(Funcionario funcionario);
}
