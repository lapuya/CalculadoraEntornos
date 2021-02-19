/***
 *
 * @author Laurence
 *
 */
public class Operacion {


	/***
	 * Metodo para saber si un numero es o no primo
	 *
	 * @param numero  parametro a analizar
	 * @return  devolvera un booleano true o false, true si es primo y false si no lo es
	 *
	 */
	public boolean esPrimo(int numero) {
		boolean esPrimo = true;

		if (numero < 2) {
			esPrimo = false;
		} else {
			if (numero == 2 || numero == 3) {
				esPrimo = true;
			} else if (numero%2 != 0 || numero%3 != 0) {
				esPrimo = false;;
			}
		}
		return esPrimo;
	}
