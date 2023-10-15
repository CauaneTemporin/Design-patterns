package com.temporintech.strategy;

import java.math.BigDecimal;

import com.temporintech.strategy.imposto.CalculadorDeImpostos;
import com.temporintech.strategy.imposto.ICMS;
import com.temporintech.strategy.orcamento.Orcamento;

public class TesteDeImpostos {

	public static void main(String[] args)
	{
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}
}
