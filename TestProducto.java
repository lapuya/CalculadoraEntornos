import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocienteTest {
	Cociente cut = new Cociente();
	@Test
	void testDosEnteros() {
		//Arrange
		
		//Act
		
		//Assert
	}

	@Test
	void testDosReales() {
		//Arrange
		double num1= 6.6;
		double num2= 6.6;
		double esperado = 1.0;
		//Act
		double resultado =cut.dosReales(num1, num2);
		//Assert
		assertEquals(esperado, resultado);
	}

	@Test
	void testInverso() {
		fail("Not yet implemented");
	}

	@Test
	void testRaiz() {
		fail("Not yet implemented");
	}

}
