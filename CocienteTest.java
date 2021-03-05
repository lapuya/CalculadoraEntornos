import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CocienteTest {
	
	Cociente cut = new Cociente();

	@Before
	public void setUp() {
		cut = new Cociente();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testDosEnteros() {
		int n1 = 5;
		int n2 = 5;
		int esperado=1;
		int obtenido = cut.dosEnteros(n1, n2);
		assertEquals(esperado, obtenido);
		
	}

	@Test
    public void testDosReales() {
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
	public void testInverso() {
		double n1 = 5;
		double esperado=0.2;
		double obtenido = cut.inverso(n1);
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testRaiz() {
		double n1 = 13;
		double esperado=3.605551275463989;
		double obtenido = cut.raiz(n1);
		assertEquals(esperado, obtenido);
	}

}