package org.example;

public class TransacaoFinanceira {
    private double valorCompra;
    private double valorImposto;

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double calcularValorTotal() {
        return CalculadoraFinanceira.calcularValorTotal(this.valorCompra, this.valorImposto);
    }
}