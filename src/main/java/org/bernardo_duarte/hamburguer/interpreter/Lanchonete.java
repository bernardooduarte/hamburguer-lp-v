package org.bernardo_duarte.hamburguer.interpreter;

public class Lanchonete {
    public static String formula = "precoHamburguer * 2 + precoBebida";

    public static double calcularTotal(double precoHamburguer, double precoBebida) {
        String expressao = formula.replace("precoHamburguer", Double.toString(precoHamburguer));
        expressao = expressao.replace("precoBebida", Double.toString(precoBebida));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
