package clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	void sumarTestNumerosPositivos() {
		int n = 1;
		int m = 5;
		assertEquals(Calculadora.sumar(n, m), 6);
	}
	
	@Test
	void multiplicarPorCero() {
		assertTrue(Calculadora.multiplicar(0, 5) == 0);
	}
	
	@Test
	void dividirPorCero() {
		assertFalse(Calculadora.dividir(2, 0) == 1);
	}
	
	
	
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
}
