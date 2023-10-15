package com.temporintech.strategy.imposto;

import java.math.BigDecimal;

import com.temporintech.strategy.orcamento.Orcamento;

public class CalculadorDeImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {

		return imposto.calcular(orcamento);

	}
}