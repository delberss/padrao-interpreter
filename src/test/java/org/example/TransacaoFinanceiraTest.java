package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoFinanceiraTest {
    @Test
    void deveCalcularValorTotalComFormula() {
        TransacaoFinanceira transacao = new TransacaoFinanceira();
        transacao.setValorCompra(100.0);
        transacao.setValorImposto(20.0);

        assertEquals(140.0, transacao.calcularValorTotal());
    }
}