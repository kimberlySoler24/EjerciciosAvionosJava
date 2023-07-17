package kimberly.code.programacionBasica;

import java.util.Iterator;

public class EjerciciosAdicionales {

// Escribe una función que retorne la cadena Hola Mundo en japonés.
	public static String japaneseGreeting() {
		return "こんにちは世界";
	}

// Escribe una función que reciba 3 Emojis y los retorne en el formato "[$1, $2, $3]" 
//donde $1, $2 y $3 son 3 emojis. Puedes adivinar las películas que representan los ejemplos?

	public static String guessTheMovie(String firstEmoji, String secondEmoji, String thirdEmoji) {
		return String.format("%s, %s, %s", firstEmoji, secondEmoji, thirdEmoji);
	}

//Haz una función que te ayude a comprobar tu hipótesis. La
//función debe recibir un monto y un porcentaje, escrito como un número 0.0 >= porcentaje && porcentaje 
//<= 100.0, y retorne el valor resultante de primero incrementar ese monto en ese porcentaje, y al 
//resultado descontarlo en ese mismo porcentaje

	public static String IncrementProduct(double price, double percentage) {
		var builder = new StringBuilder();
		var percentIncrement = (price * percentage) / 100;
		var increment = percentIncrement + price;
		var percentDecrement = (increment * percentage) / 100;
		var decrement = Math.abs(percentDecrement - increment);
		builder.append("El precio con el porcentaje incrementado es: ").append(increment)
				.append(System.lineSeparator());
		builder.append("El resultado del incremento con el mismo porcentaje de descuento es: ").append(decrement)
				.append(System.lineSeparator());
		return builder.toString();
	}

//Haz una función que acepte un número entero, 0 >= progreso && progreso <= 100 y retorne una barra de
//progreso correspondiente. Si un número no es múltiplo de 10, debe ser tratado como el mayor múltiplo 
//de 10 que sea menor que el número dado: 53 debe ser tratado como 50, 67 como
//60, etc.

	public static String progressBar(int number) {
		var builder = new StringBuilder();
		var divide = number / 10;
		var rest = 10 - divide;
		builder.append("*".repeat(divide)).append("+".repeat(rest));
		return builder.toString();
	}

//El inverso de un número, es el número resultante de invertir todos sus dígitos. Por ejemplo el inverso 
//de 13 es 31. Haz una función que invierta un número menor de 100.

	public static int inverse(int number) {
		var modulo = number % 10;
		var divide = number / 10;
		return (modulo * 10) + divide;
	}

//Un función que indique la nota final de un estudiante, dadas las 3 notas de los periodos

	public static double finalGrade(double note1, double note2, double note3) {
		var calculateFirstNote = note1 * 0.3;
		var calculateSecondNote = note2 * 0.3;
		var calculateThirdNote = note3 * 0.4;

		return calculateFirstNote + calculateSecondNote + calculateThirdNote;
	}
//Una función que dadas las notas de los 2 primeros periodos, indique cuál es la nota más alta posible 
//para un estudiante

	public static double maxGrade(double note1, double note2) {
		return finalGrade(note1, note2, 5.0);
	}

//Una función que dadas las notas de los 2 primeros periodos, devuelve la mínima nota necesaria para 
//pasar la materia. Si la nota mínima es mayor que 5.0 debe retornar -1.0

	public static double minimumGradeNeeded(double note1, double note2) {
		var formula = (3.0 - (note1 * 0.3) - (note2 * 0.3)) / 0.4;
		return formula >= 5.0 ? -1 : formula;
	}

//Haz una función que reciba una URL, que siempre incluye el dominio y al menos un parte del path 
//que siempre serán 2 letras representando un idioma, y el código de 2 letras de un idioma, y retorne 
//la función ajustada a ese idioma.

	public static String changeLanguage(String link, String language) {
		var builder = new StringBuilder();
		var slash = link.indexOf('/');
		var count = 0;
		while (slash != -1) {
			count++;
			slash = link.indexOf('/', slash + 1);
			if (count == 2) {
				builder.append(link.substring(0, slash + 1)).append(language)
				.append(link.substring(slash + 3));
			}
		}
		return builder.toString();

	}
//Haz una función que indique si un String termina en una vocal. El String puede estar en mayúsculas, 
//minúsculas o una combinación.

	public static boolean endsInVocal(String word) {
		var convertToLowerCase = word.toLowerCase();
		var length = convertToLowerCase.length();
		var lastChar = convertToLowerCase.charAt(length - 1);
		return switch (lastChar) {
		case 'a', 'e', 'i', 'o', 'u' -> true;
		default -> false;
		};

	}

}