package org.example;

public class CalculadoraFinanceira {

    public static String formula = "valorCompra * 1.2 + valorImposto";

    public static double calcularValorTotal(double valorCompra, double valorImposto) {
        String expressao;
        expressao = formula.replace("valorCompra", Double.toString(valorCompra));
        expressao = expressao.replace("valorImposto", Double.toString(valorImposto));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}