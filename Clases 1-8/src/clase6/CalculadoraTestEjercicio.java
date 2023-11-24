package clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestEjercicio {

	@Test
	void testMultiplicar() {
		assertEquals(Calculadora.multiplicar(80,3), 240);
	}
	
	@Test
	void testSumaYDivision() {
		int suma = Calculadora.sumar(150, 180);
		assertTrue(Calculadora.dividir(suma,3) == 110);
	}
	
	@Test
	void testRestaYMultiplicacion() {
		int resta = Calculadora.restar(90, 50);
		assertFalse(Calculadora.multiplicar(resta, 15) == 605);
	}
	
	@Test
	void testSumaYMultiplicacion() {
		int suma = Calculadora.sumar(70, 40);
		assertFalse(Calculadora.multiplicar(suma, 25) == 2700);
	}
	
}
