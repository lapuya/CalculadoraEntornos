import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto {
	 Producto cut = new Producto();
	 
	public void setUp() {
				cut = new Producto();
	}
	public void tearDown() {
	}
	@Test
	void testNumerosDosReales() {
		// Arrange - Preparar
		double num1= 5.5;
		double num2=5.5;
		double esperado =30.25;
		// Act - ejecutar
		double obtenido=cut.productoDosReales(num1, num2);
		// Assert - comprobar
		assertEquals(esperado, obtenido,"el producto de 5.5 por 5.5 debe ser 30.25");
	
	}

	@Test
	void testProductoDosEnteros() {
		// Arrange - Preparar
		int num1= 5;
		int num2=5;
		int esperado =25;
		// Act - ejecutar
		int obtenido = cut.productoDosEnteros(num1, num2);
		// Assert - comprobar
		assertEquals(esperado, obtenido,"el producto de 5 por 5 debe ser 25");
	
	}

	@Test
	void testProductoTresReales() {
		//Arrange - Preparar
		double num1=5.5;
		double num2=2.5;
		double num3=2.5;
		double esperado= 34.375;
		
		// Act - Ejecutar
		double resultado = cut.productoTresReales(num1, num2, num3);
		
		// Assert - Comprobar
		assertEquals(esperado, resultado,"resultado esperado de los tres reales es 34.375");
	}

	@Test
	void testPotencia() {
	// Arrange - Preparar
		double num1 = 5.5;
		double num2 = 4.5;
		double esperado = 2146.0117856117135;
	// Act- Ejecutar
		double resultado = cut.potencia(num1, num2);
	// Assert- comprobar
		assertEquals(esperado, resultado);
		
	}

}

}