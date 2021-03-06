/**
 * @author Daniel
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class OperacionUT {

	private Operacion cut = new Operacion();

	public void setUp() {
		cut = new Operacion();
	}

	public void tearDown() {
	}

// Test método esPrimo
	@Test
	void el30noDeberiaSerPrimo() {
		// Arrange (Preparar IN/OUT)
		int num = 30;

		// Act (Ejecutar)
		boolean obtenido = cut.esPrimo(num);

		// Assert (Comprobar)
		assertFalse(obtenido, "El método debería de devolver false");
	}
	
	@Test
	void NaNnoDeberiaSerPrimo() {
		// Arrange (Preparar IN/OUT)
		int num = (int)Double.NaN;

		// Act (Ejecutar)
		boolean obtenido = cut.esPrimo(num);

		// Assert (Comprobar)
		assertFalse(obtenido, "El método debería de devolver false");
	}
	
	
	

	
	
	
// Test método iEsimoPrimo
	@Test
	void elPrimo7deberiaSer17() {
		// Arrange (Preparar IN/OUT)
		int num = 7;
		int esperado = 17;

		// Act (Ejecutar)
		int obtenido = cut.iEsimoPrimo(num);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El 7º primo debería ser el 17");
	}

	
	@Test
	void NaNDarPrimerPrimo() {
		// Arrange (Preparar IN/OUT)
		int num = (int) Double.NaN;
		int esperado = 2; //Debería dar el primer número primo (2).

		// Act (Ejecutar)
		int obtenido = cut.iEsimoPrimo(num);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El 1er (posición NaN) primo debería ser el 2");
	}

	
	
	
	
	
// Test método porcentaje
	@Test
	void el30PorCientoDe950deberiaSer285() {
		// Arrange (Preparar IN/OUT)
		double num = 950;
		double porcentaje = 30;
		double esperado = 285;

		// Act (Ejecutar)
		double obtenido = cut.porcentaje(num, porcentaje);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El 30% de 950 debe de ser 285");
	}

	@Test
	void NaNComoNumeroDebeDarNaN() {
		// Arrange (Preparar IN/OUT)
		double num = Double.NaN;
		double porcentaje = 30;
		double esperado = Double.NaN;

		// Act (Ejecutar)
		double obtenido = cut.porcentaje(num, porcentaje);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El 30% (o cualquier otro) de NaN debe de ser NaN");
	}
		
	@Test
	void NaNComoPorcentajeDebeDarNaN() {
		// Arrange (Preparar IN/OUT)
		double num = 1200;
		double porcentaje = Double.NaN;
		double esperado = Double.NaN;

		// Act (Ejecutar)
		double obtenido = cut.porcentaje(num, porcentaje);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El tanto por ciento NaN de cualquier número debe de ser NaN");
	}
	
	
	
	
// Test método factorial
	@Test
	void factorialDe52DeberiaSer68() {
		// Arrange (Preparar IN/OUT)
		int num = 52;
		int esperado = 68;

		// Act (Ejecutar)
		int obtenido = cut.factorial(num);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El factorial de 52 debe de ser 68.");
	}

	@Test
	void NaNDeberiaDar1() {
		// Arrange (Preparar IN/OUT)
		int num = (int) Double.NaN;
		int esperado = 1;

		// Act (Ejecutar)
		int obtenido = cut.factorial(num);

		// Assert (Comprobar)
		assertEquals(esperado, obtenido, "El factorial de NaN debe de ser 1.");
	}