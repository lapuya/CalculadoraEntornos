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


		/***
		 * Metodo que calcula dado un numero entero n, entregue el numero primo n
		 * Usara el metodo
		 * @see  #esPrimo()
		 * @param numero  parametro que se correspondera al n-esimo numero primo
		 * @return  devolvera el numero primo n correspondiente
		 */
		public int iEsimoPrimo(int numero) {

			boolean encontrado = false;
			int x = 0, contPrimo = 0, resultado = 0;
			while(!encontrado) {
				if(!esPrimo(x)) {
					x++;
				} else {
					if(contPrimo == numero) {
						resultado = x;
						encontrado = true;
					} else {
						contPrimo++;
						x++;
					}
				}
			}

			return resultado;

		}
