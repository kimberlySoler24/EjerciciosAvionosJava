package kimberly.code.programacionBasica;

import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;


public class MainEjerciciosRepaso {

	public static void main(String[] args) {
		
		
		// FUNCTIONS	
//		System.out.println(Functions.errorCode1());
//		System.out.println(Functions.sentenceMaker("good", "blue", "While"));
//		System.out.println(Functions.pangram());
		
		//OPERATORS
		
//		System.out.println(Operators.differenceOfSquare(3, 2));
		
//		System.out.println(Operators.truncate(123));
		
		//LOOPS
		
//		System.out.println(Loops.count("abracadabra", "ab"));
//		System.out.println(RepasoEjerciciosDificiles.count("abracadabra", "ab"));
//		System.out.println(RepasoEjerciciosDificiles.count("110101110101100", "01"));
//		System.out.println(RepasoEjerciciosDificiles.count("ssa", "ss"));
		
		
		//CONDICIONALES 
//		System.out.println(conditionals.camelCaseToSnakeCase("lastThreeDigits"));
//		System.out.println(conditionals.snakeCaseToCamelCase("last_three_digits"));
//		System.out.println(RepasoEjerciciosDificiles.snakeCaseToCamelCase("lastThreeDigits"));
//		System.out.println(RepasoEjerciciosDificiles.camelCaseToSnakeCase("last_three_digits"));
//		System.out.println(RepasoEjerciciosDificiles.camelCaseToSnakeCase("vowels"));
		
		
		//ARREGLOS
//	System.out.println(Arrays.toString(Arreglos.s(new int [] {5})));
//  System.out.println(Arreglos.histogram(new int [] {5, 1, 3}));
//	System.out.println(Arreglos.max(new int[] {-3, -2, -1}));
//	System.out.println(Arreglos.max(new int[] {5, -2, -1}));
//	System.out.println(Arreglos.max(new int[] {-3, 0, -21}));
//	System.out.println(Arreglos.max(new int[] {100, -50, 21}));
//	System.out.println(Arrays.toString(Arreglos.s(new int [] {3})));
//	System.out.println(Arreglos.numericMatrix(2,3));
//	System.out.println(Arreglos.numericMatrix(3, 1));
//	System.out.println(Arreglos.identify(3));
//	System.out.println(Arreglos.identify(4));

//	System.out.println(Arrays.toString(Arreglos.FoundChar(new char[][] {{' ', ' ', ' '}, {' ', '*', ' '}, {' ', ' ', ' '}})));
//	System.out.println(Arrays.toString(Arreglos.FoundChar(new char[][] {{' ', ' ', ' '}, {'*', ' ', '*'}, {' ', ' ', ' '}})));
//	System.out.println(Arreglos.expandingMatrix(new char[][] {{' ', ' ', ' '}, {' ', '*', ' '}, {' ', ' ', ' '}}));
//	System.out.println(Arreglos.expandingMatrix(new char[][] {{' ', ' ', ' '}, {'*', ' ', '*'}, {' ', ' ', ' '}}));
//	System.out.println(Arreglos.expandingMatrix(new char[][] {{' ', ' ', ' '}, {'*', ' ', '*'}, {' ', ' ', ' '}}));
		
		
		//EJERCICIOS ADICIONALES
		
		// Konnichiwa Sekai!
//		System.out.println(EjerciciosAdicionales.japaneseGreeting());
//		
		//Adivina la Película
//		System.out.println(EjerciciosAdicionales.guessTheMovie("😊😁😂",
//				"\uD83C\uDF44", "\uD83D\uDC51"));
//		System.out.println(EjerciciosAdicionales.guessTheMovie("\uD83D\uDEA2",
//				"\uD83E\uDDCA", "\uD83D\uDC94"));
//		System.out.println(EjerciciosAdicionales.guessTheMovie("\uD83D\uDC7D",
//				"\uD83D\uDCDE", "\uD83C\uDFE0"));
////		
//		//Aumento y Descuento
//		System.out.println(EjerciciosAdicionales.IncrementProduct(1000, 16));
//		
//		//Barra de Progreso con caractereswg
//		System.out.println(EjerciciosAdicionales.progressBar(10));
//		System.out.println(EjerciciosAdicionales.progressBar(17));
//		System.out.println(EjerciciosAdicionales.progressBar(53));
//		
//		//Número reversado
//		System.out.println(EjerciciosAdicionales.inverse(13));
//		System.out.println(EjerciciosAdicionales.inverse(56));
//		
//		//Notas Universitarias
//		System.out.println(EjerciciosAdicionales.finalGrade(3.0, 4.0, 5.0));
//		System.out.println(EjerciciosAdicionales.finalGrade(3.7, 4.2, 2.5));
//		
//		System.out.println(EjerciciosAdicionales.maxGrade(3.0, 3.0));
//		System.out.println(EjerciciosAdicionales.maxGrade(2.0, 2.5));
//		
//		System.out.println(EjerciciosAdicionales.minimumGradeNeeded(5.0, 5.0));
//		System.out.println(EjerciciosAdicionales.minimumGradeNeeded(3.7, 4.1));
//		System.out.println(EjerciciosAdicionales.minimumGradeNeeded(1.0, 1.5));
//		
//		//Puedo tener eso, pero en español?
//		System.out.println(EjerciciosAdicionales.changeLanguage("https://www.java.com/es","fr"));
//		System.out.println(EjerciciosAdicionales.changeLanguage("https://www.acme.co/en/about-us", "es"));
//		System.out.println(RepasoEjerciciosDificiles.changeLanguage("https://www.acme.co/en/about-us", "es"));
		System.out.println(RepasoEjerciciosDificiles.changeLanguage("https://www.java.com/es","fr"));
//		//Termina en vocal?
//		System.out.println(EjerciciosAdicionales.endsInVocal("JAVA"));
//		System.out.println(EjerciciosAdicionales.endsInVocal("JAVA"));
//		System.out.println(EjerciciosAdicionales.endsInVocal("Java is fun"));
		
//		System.out.println(ejerciciosBucles.trianguloNumeros(4));
		
//		int day = 4;
//		switch (day) {
//		case 1 -> System.out.println("Lunes");
//		case 2 -> System.out.println("Martes");
//		case 3 -> System.out.println("Miercoles");
//		case 4 -> System.out.println("Jueves");
//		case 5 -> System.out.println("Viernes");
//		case 6 -> System.out.println("Sabado");
//		case 7 -> System.out.println("Domingo");
//		}
		
//
//		System.out.println(Arrays.toString(Arreglos.quadratic(4, 8, 0)));
		

		
/**		
		HashSet<String> nombres = new HashSet<>();
		nombres.add("camila");
		nombres.add("andrea");
		nombres.add("wilson");
		nombres.add("jairo");
		nombres.add("andrea");
		
		System.out.println("HashSet de nombres: " + nombres);
		
		var encontrar = "andrea";
		if(nombres.contains(encontrar)) {
			System.out.println("Está en el conjunto");
		} else {
			System.out.println("No está en el conjunto");
		}
		
		nombres.remove("andrea");
		
		System.out.println(nombres.size());
		
		for (var nombre : nombres) {
			System.out.println(nombre);				
		}
		
		nombres.clear();
		
		nombres.isEmpty();
		
		System.out.println(nombres.isEmpty());

**/		
		
	}


}
