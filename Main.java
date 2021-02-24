public class Main {

	public static void main(String[] args) {

		//Metodo operacion
		Operacion c1 = new Operacion();

		//el 1 no se considera primo
		System.out.println(c1.esPrimo(1));

		//probamos 3 numeros primos
		System.out.println(c1.esPrimo(2));
		System.out.println(c1.esPrimo(17));
		System.out.println(c1.esPrimo(7));

		//probamos 3 numeros compuestos
		System.out.println(c1.esPrimo(6));
		System.out.println(c1.esPrimo(8));
		System.out.println(c1.esPrimo(24));






	}

}
