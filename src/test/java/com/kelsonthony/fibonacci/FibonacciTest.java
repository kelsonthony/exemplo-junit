package com.kelsonthony.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	private Fibonacci fibonacci;
	
	@Before
	public void init() {
		fibonacci = new Fibonacci();
	}
	
	/*
	 * @After public void end() {
	 * 
	 * }
	 */

	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		//1. Cen�rio
		long posicao = 1L;
		
		//2. A��o do Teste
		long valor = fibonacci.calcular(posicao);
		
		//System.out.println(valor);
		//3. Valida��o
		assertEquals(1L, valor);
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_2() {
		//1. Cen�rio
		long posicao = 2L;
		
		long valor = fibonacci.calcular(posicao);
		assertEquals(1L, valor);
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_0() {
		//1. Cen�rio
		long posicao = 0L;
		
		long valor = fibonacci.calcular(posicao);
		assertEquals(0L, valor);
	}
}
