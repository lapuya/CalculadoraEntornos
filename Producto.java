/***
 * 
 * @author Ivan
 * @version 1.0
 *
 */
public class Producto {
 
	/**
	 * 
	 * @param n1 primer número real 
	 * @param n2 segundo número real 
	 * @return Producto de ambos números
	 */
		public double productoDosReales(double n1, double n2) {
			return n1*n2;
		}
		/**
		 * 
		 * @param n1 primer número entero
		 * @param n2 segundo número entero
		 * @return Producto de ambos números
		 */
 
		public int productoDosEnteros(int n1, int n2) {
			return n1*n2;
		}
 
		/**
		 * 
		 * @param n1 primer número real
		 * @param n2 segundo número real
		 * @param n3 tercer número real
		 * @return Producto de los tres números
		 */
 
		public int productoTresReales(int n1, int n2, int n3) {
			return n1*n2*n3;
		}
 
		/**
		 * 
		 * @param n1 Base de la potencia
		 * @param n2 Exponente de la potencia
		 * @return Valor de la potencia
		 */
		public double potencia(double n1, double n2) {
			return Math.pow(n1, n2);
		}
 
 
	}
 
 