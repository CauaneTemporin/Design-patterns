package com.temporintech.strategy.imposto;

import java.math.BigDecimal;

import com.temporintech.strategy.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
	
}