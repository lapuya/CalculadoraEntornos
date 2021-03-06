import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaUT1 {
	
	private Resta cut;

	@BeforeEach
	void setUp() {
		cut = new Resta();
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}
	
	@Test
	void diezMenosTresEsSieteReales()	{
		//arrange
		double num1 = 10.0;
		double num2 = 3.0;
		double esperado = 7.0;
		
		//Act
		double obtenido = cut.restaReales(num1, num2);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void quinceMenosDosEsTreceEnteros() {
		//arange
		int num1 = 15;
		int num2 = 2;
		int esperado = 13;
		
		//Act
		int obtenido = cut.restaEnteros(num1, num2);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void nueveMenosTresMenosTresEsTresReales() {
		//arrange
		double num1 = 9.0;
		double num2 = 3.0;
		double num3 = 3.0;
		double esperado = 3.0;
		
		//Act
		double obtenido = cut.restaTresReales(num1, num2, num3);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void primeraRestaNegativaAAcumulado()
	{
		//arange
		double num1 = -42;
		double esperado = -42;
		
		//Act
		cut.restaAcumulada(num1);
		assertEquals(esperado, cut.getAcumulador());
	}
}
