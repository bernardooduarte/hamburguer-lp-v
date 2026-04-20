package org.bernardo.duarte.hamburguer.abstractfactory;

import org.bernardo.duarte.hamburguer.factorymethod.Hamburguer;

public interface ComboFactory {
    Hamburguer criarHamburguer();
    Acompanhamento criarAcompanhamento();
    Sobremesa criarSobremesa();
}
