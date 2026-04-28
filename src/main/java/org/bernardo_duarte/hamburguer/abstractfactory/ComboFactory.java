package org.bernardo_duarte.hamburguer.abstractfactory;

import org.bernardo_duarte.hamburguer.factorymethod.Hamburguer;

public interface ComboFactory {
    Hamburguer criarHamburguer();
    Acompanhamento criarAcompanhamento();
    Sobremesa criarSobremesa();
}
