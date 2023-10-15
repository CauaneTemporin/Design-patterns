package com.temporintech.strategy.imposto;

import java.math.BigDecimal;

import com.temporintech.strategy.orcamento.Orcamento;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
