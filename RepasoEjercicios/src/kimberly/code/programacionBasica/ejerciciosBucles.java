package kimberly.code.programacionBasica;

public class ejerciciosBucles {

	public static String pasitos(int velocidad) {
		var builder = new StringBuilder();
		while (velocidad > 0) {
			builder.append(".");
			--velocidad;
		}
		builder.append("*");
		return builder.toString();
	}
	
	public static String relajate (String objeto) {
		var builder = new StringBuilder ();
		builder.append("(\\_/)").append(System.lineSeparator());
		builder.append("( *_* )").append(System.lineSeparator());
		builder.append("/ >" + objeto).append(System.lineSeparator());
		return builder.toString();
	}
	
	public static int sumaParesIncluido(int limite) {
		var suma = 0;
		for (var n = 2; n <= limite; n += 2) {
			suma += n;
		}
		return suma;
	}
	
	public static String strignDeDigitos () {
		var builder = new StringBuilder();
		for (var digito = 0; digito < 10; ++digito) {
			builder.append(digito);
		}
		return builder.toString();
	}
	
	
	public static String trianguloNumeros (int limite) {
		var builder = new StringBuilder();
		for (var i = 1; i<= limite ; ++i) {
			for (var j = 1; j <= i ; ++j) {
				builder.append(j);
			}
			builder.append(System.lineSeparator());
		}
		return builder.toString();
	}
	
	
	
	
	
}
