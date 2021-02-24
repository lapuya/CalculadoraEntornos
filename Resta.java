/**
 * Clase Resta para la actividad grupal 1 de Entornos de Desarrollo
 * @author Jaime
 * @version 1.0
 * @since 02/02/2021
 *
 */
public class Resta {	
	
	/**
	 * Acumulador utilizado en el método cuatro()
	 */
	private double acumulador;
	
	/**
	 * Get del parámetro acumulador utilizado en el méotodo cuatro() 
	 * @return
	 */
	public double getAcumulador() {
		return acumulador;
	}
	
	/**
	 * Set del parámetro acumulador utilizado en el méotodo cuatro()
	 * @param acumulador
	 */
	public void setAcumulador(double acumulador) {
		this.acumulador = acumulador;
	}

	
	/**
	 * Resta de dos números reales
	 * @param x
	 * 		Primer parámetro de entrada
	 * @param y
	 * 		Segundo parámetro de entrada
	 * @return Solución	 
	 */
	public double uno(double x, double y) {
		return x-y;
	}
	
	/**
	 * Resta de dos números enteros
	 * @param x 
	 * 		Primer parámetro de entrada
	 * @param y
	 * 		Segundo parámetro de entrada
	 * @return Valor Solución
	 */
	public int dos(int x, int y) {
		return x-y;
	}
	
	/**
	 * Resta de dos números reales
	 * @param x 
	 * 		Primer parámetro de entrada
	 * @param y
	 * 		Segundo parámetro de entrada
	 * @param z
	 * 		Tercer parámetro de entrada
	 * @return Solución
	 */
	public double tres(double x, double y, double z) {
		return x-y-z;
	}
	
	/**
	 * Resta con valor acumulado
	 * @param x
	 * 		Parámetro de entrada que se resta al acumulador
	 * @return
	 */
	public double cuatro(double x) {
		
		return acumulador -= x ;
	}
}
