/**
 * @author Fran
 * @since 30/1/2021
 */

public class ClaseSuma {
	private int param1;
	/**
	 * @param  double num1
	 * @param  double num2
	 * @return resultado de la suma de dos numeros reales
	 */
	// métodos encargados de la clase
	public double sumaReales(double num1, double num2) {
		double resultadoDouble;
		resultadoDouble = num1 + num2;
		return resultadoDouble;
	}
/** 
 * Método para sumar dos números enteros
 * @param int num1
 * @param int num2
 * @return resultado de la suma de dos numeros enteros
 */
	public int sumaEnteros(int num1, int num2) {
		int resultadoInt;
		resultadoInt = num1 + num2;
		return resultadoInt;
	}
	/**
	 * @param  double num1
	 * @param  double num2
	 * @param doueble num3
	 * @return resultado de la suma de tres nuemros reales
	 */

	public double sumaTresNumeros(double num1, double num2, double num3) {
		double resultadoTres;
		resultadoTres = num1 + num2 + num3;
		return resultadoTres;
	}
	/**
	 * Método para acumular numeros pasandole 1 numero entero
	 * @param param1
	 * tiene un método GET para ver como va el acomulador
	 */
	public void acumulado(int param1) {
		
		this.param1 += param1;
	}
	public int getParam1() {
		return param1;
	}
