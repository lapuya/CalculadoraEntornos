import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClaseSumaTest1 {

	private ClaseSuma cut;
		
	public void setUp() {
			
		cut = new ClaseSuma();
			
	}
	public void tearDown() {
			
	}
//Test método sumaReales
	@Test
	public void laSumade10yMenos5DebeSer5() {	
		//Arrange
		cut = new ClaseSuma();
		double num1 = 10;
		double num2 = -5;
		double esperado = 5;
		//Act
		double obtenido = cut.sumaReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "la suma de 10 y 5 debe ser 5");
			
			
	}

//Test método sumaEnteros
	@Test
	public void laSumade0y05DebeSer0() {	
		//Arrange
		cut = new ClaseSuma();
		int num1 = 0;
		int num2 = 0;
		int esperado = 0;
		//Act
		int obtenido = cut.sumaEnteros(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "la suma de 0 y 0 debe ser 0");
	}
		
//Test método sumaTresNumeros
	@Test
	public void laSumaDeEstosTresNumerosRealesDebeSer6() {	
		//Arrange
		cut = new ClaseSuma();
		double num1 = 1.5;
		double num2 = 1.5;
		double num3 = 3;
		double esperado = 6;
		//Act
		double obtenido = cut.sumaTresNumeros(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "la suma de 1.5 + 1.5 + 3 debe ser 6");
	}
//Test método acumulado
	@Test
	public void PrimeraSumaNumNegativoAAcumulado() {	
		//Arrange
		cut = new ClaseSuma();
		int num1 = -10;
		
		int esperado = -10;
		//Act
		int obtenido = cut.acumulado(num1);
		//Assert
		assertEquals(esperado, obtenido);
	}

		
		

}
