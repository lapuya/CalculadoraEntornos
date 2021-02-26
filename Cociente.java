
/**
 * 
 * @author Daniel
 * @version 1.0
 * @since 28/01/2021
 * 
 */

public class Cociente {

	/**
	 * Metodo en el que divide dos numeros enteros.
	 * 
	 * @param dividendo El numero a dividir.
	 * @param divisor El numero entre el que se divide.
	 * @return Devuelve la division.
	 * 
	 * Si el dividendo es 0 el resultado sera 0.
	 * Si el divisor es 0 el resultado sera infinito.
	 * Si ambos son 0 el resultado dara Error.
	 * 
	 * En caso de no dar un número exacto el resultado omite la parte decimal.
	 */
	public static int dosEnteros (int dividendo, int divisor) {
		return dividendo/divisor;
	}
	
	
}

	/**
	 * Metodo que divide dos numeros reales.
 	* 
 	* @param dividendo El numero a dividir.
	 * @param divisor El numero entre el que se divide.
	 * @return Devuelve la division.
	 * 
	 * Si el dividendo es 0 el resultado sera 0.
	 * Si el divisor es 0 el resultado sera infinito.
	 * Si ambos son 0 el resultado dara Error.
	 * 
 	* En caso de no dar un número exacto el resultado se muestra completo con los decimales.
	 */
	public static double dosReales (double dividendo, double divisor) {
		return dividendo/divisor;
	}


	/**
	 * Metodo en el que se invierte el numero introducido.
	 * @param numero El numero que se invierte.
	 * @return Devuelve el inverso del numero.
	 * 
 	* Si el numero introducido es 0 el resultado sera infinito.
 	*/
	public static double inverso (double numero) {
		return 1/numero;
	}


	/**
 	* Metodo que te da la raiz cuadrada del nimero introducido.
 	* @param numero El numero al que se le hace la raiz.
 	* @return La raiz del numero.
 	* 
	 * Si el numero introducido es 0 el resultado sera 0.
	 */
	public static double raiz(double numero) {
		return Math.pow(numero,  0.5);
	}

}