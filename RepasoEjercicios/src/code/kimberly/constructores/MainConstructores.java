package code.kimberly.constructores;

import code.funciones.constructores.EjerciciosConstructores;
import code.operators.constructors.*;
import code.variables.constructors.*;
import code.strings.constructors.*;
import code.loops.constructors.*;
import code.conditional.constructors.*;
import code.otrosEjercicios.objetos.*;
import java.util.Arrays;

import code.arrays.constructores.*;
public class MainConstructores {

	public static void main(String[] args) {
//		/**
//		 * Mostrar una cadena de caracteres
//		 * llamar cada constructor para definir lo que va a tener
//		 */
//		var sentence = new EjerciciosConstructores ("good", "blue", "Whale"); 
//		var pangram = new EjerciciosConstructores ("quick", "brown", "fox"); 
//		System.out.println(sentence.sentenceMaker());
//		System.out.println(pangram.sentenceMaker());
//		
//		/**
//		 * Validar si el número es par o no
//		 */
//		
//		var num1 = new operatorsConstructors(2);
//		var num2 = new operatorsConstructors(13);
//		System.out.println("El 2 es numero par?: " + num1.isEven());
//		System.out.println("El 13 es numero par?: " + num2.isEven());
//		
//		/**
//		 * Validar si es o no numero impar
//		 */
//		var odd1 = new isOdd(2);
//		var odd2 = new isOdd(13);
//		System.out.println("El 2 es numero impar?: " + odd1.isANumberOdd());
//		System.out.println("El 13 es numero impar?: " + odd2.isANumberOdd());
//		/**
//		 * Validar la diferencia entre dos numeros elevados al cuadrado
//		 */
//		var firstNumber = new difference (3, 2);
//		var secondNumber = new difference (1, 1);
//		System.out.println("primer diferencia al cuadrado:" + firstNumber.differenceOfSquare());
//		System.out.println("segunda diferencia al cuadrado:" + secondNumber.differenceOfSquare());
//		/** 
//		 * Encontrar el tercer angulo de una triángulo
//		 */
//		var Angle1 = new foundAngle (60.0);
//		var Angle2 = new foundAngle (60.0);
//		System.out.println("1. El tercer angulo es:" + Angle1.thirdAngle(Angle2));
//		
//		var Angle21 = new foundAngle (45.0);
//		var Angle22 = new foundAngle (90.0);
//		System.out.println("2. El tercer angulo es:" + Angle21.thirdAngle(Angle22));
//		
//		var Angle31 = new foundAngle (35.0);
//		var Angle32 = new foundAngle (50.0);
//		System.out.println("3. El tercer angulo es:" + Angle31.thirdAngle(Angle32));
//		
//		/** 
//		 * Mostrar el ultimmo digito
//		 */
//		var FirstNumber = new LastNumber (123);
//		var SecondNumber = new LastNumber (456);
//		var ThirdNumber = new LastNumber (9);
//		System.out.println("1. El ultimo numero de 123 es:" + FirstNumber.lastDigit());
//		System.out.println("2. El ultimo numero de 456 es:" + SecondNumber.lastDigit());
//		System.out.println("3. El ultimo numero de 9 es:" + ThirdNumber.lastDigit());
//		
//		/** 
//		 * troncar un número
//		 */
//		var FourNumber = new LastNumber (0);
//		System.out.println("6. El numero truncado de 123 es:" + FirstNumber.truncate());
//		System.out.println("7. El numero truncado de 456 es:" + SecondNumber.truncate());
//		System.out.println("8. El numero truncado de 9 es:" + ThirdNumber.truncate());
//		System.out.println("9. El numero truncado de 0 es:" + FourNumber.truncate());
//		
//		/**
//		 * encontrar el lado de un triangulo calculando el seno de los angulos
//		 */
//		var FirstSide = new SinesTriangle(5.0, 60.0, 60.0);
//		System.out.println("10. El lado del triangulo es:" + 
//	    FirstSide.lawOfSines());
//		
//		// VARIABLES
//		/**
//		 * Encontrar la distancia entre dos puntos x y y
//		 */
//		
//		var point1 = new distancePoints (0.0, 0.0);
//		var point2 = new distancePoints (1.0, 1.0);
//		System.out.println("11. La distancia entre los dos puntos es:" + 
//			    point1.distance(point2));
//		// FAHRENHEIT
//		/**
//		 * Convertir de fahrenheit a celsius
//		 */
//		
//		var degreesF1= new Celsius (60.0);
//		var degreesF2 = new Celsius (32.0);
//		System.out.println("12. la temperatura de 60F a Celsius es:" + (degreesF1.fahrenheitToCelsius()));
//		System.out.println("13. La temperatura de 32F a Celsius es:" + (degreesF2.fahrenheitToCelsius()));
//	
//		/**
//		 * Es un triangulo?
//		 */
//		var triangle1 = new Triangle (3.0, 4.0, 5.0);
//		System.out.println("14. si es triangulo con lados 3, 4 y 5?: " + triangle1.isTriangle()); 
//		
//		var triangle2 = new Triangle (17.0, 10.0, 7.0);
//		System.out.println("14. si es triangulo con lados 3, 4 y 5?: " + triangle2.isTriangle()); 
//		
//		
//		/**
//		 * Es palindrome?
//		 */
//		
//		var words1 = new Palindrome ("ab");
//		System.out.println("15. ab es palindrome?: " + words1.isPalindrome());
//		
//		var words2 = new Palindrome ("zz");
//		System.out.println("16. zz es palindrome?: " + words2.isPalindrome());
//		
//		var words3 = new Palindrome ("Aa");
//		System.out.println("17. Aa es palindrome?: " + words3.isPalindrome());
//			
//	
//		/**
//		 * Cual es la extensión del archivo
//		 */
//		var link1 = new extension ("debug.sh");
//		System.out.println("19. las extension es: " + link1.Extension());
//	
//		var link2 = new extension ("/path/to/debug.sh");
//		System.out.println("20. las extension es: " + link2.Extension());
//
//		var link3 = new extension ("/the.dot/file.java");
//		System.out.println("21. las extension es: " + link3.Extension());
//		
//		var link4 = new extension ("no-extension");
//		System.out.println("22. las extension es: " + link4.Extension());
//	
//		
//		/**
//		 * extraer el dominio de la pagina web
//		 */
//		
//		var link5 = new External ("https://www.java.com/en/");
//		System.out.println("23. el dominio de la primera extension es: " + link5.isExternal());
//		var link6 = new External ("https://jcp.org");
//		System.out.println("24. el dominio de la primera extension es: " +  link6.isExternal());
//		
//		/**
//		 * validar si es un correo electrónico correcto o no
//		 */
//		var email1 = new Email ("abc@me.com");
//		System.out.println("25. la respuesta es: " + email1.isValidEmail());
//		
//		var email2 = new Email ("abc@me.");
//		System.out.println("26. la respuesta es: " + email2.isValidEmail());
//		
//		var email3 = new Email ("abc@mecom");
//		System.out.println("27. la respuesta es: " + email3.isValidEmail());
//		
//		var email4 = new Email ("abc@me@com");
//		System.out.println("28. la respuesta es: " + email4.isValidEmail());
//		
//		var email5 = new Email ("@me.com");
//		System.out.println("29. la respuesta es: " + email5.isValidEmail());
//		
//		var email6 = new Email ("a.bc@me.com");
//		System.out.println("30. la respuesta es: " + email6.isValidEmail());
//		
//		var email7 = new Email ("abc@me.co.m");
//		System.out.println("31. la respuesta es: " + email7.isValidEmail());
//		
//		var email8 = new Email ("a@c@me.co.m");
//		System.out.println("32. la respuesta es: " + email8.isValidEmail());
//		
//		/**
//		 * ELLIPSIFY
//		 */
//		var wordIs1 = new IsEllipsify ("Java is fun", 4);
//		System.out.println("33. la respuesta es:" + wordIs1.ellipsify());
//		
//		var wordIs2 = new IsEllipsify ("Java is fun", 5);
//		System.out.println("34. la respuesta es:" + wordIs2.ellipsify());
//		
//		var wordIs3 = new IsEllipsify ("Java is fun", 2);
//		System.out.println("35. la respuesta es:" + wordIs3.ellipsify());
//		
//		var wordIs4 = new IsEllipsify ("Java is fun", 20);
//		System.out.println("36. la respuesta es:" + wordIs4.ellipsify());
//		
//		/**
//		 * convertir numeros a hexadecimales.
//		 */
//		var numbers1 = new Hexadecimal (0, 0, 0);
//		System.out.println("37. la respuesta es:" + numbers1.hexString());
//		
//		var numbers2 = new Hexadecimal (255, 255, 255);
//		System.out.println("38. la respuesta es:" + numbers2.hexString());
//		
//		var numbers3 = new Hexadecimal (12, 15, 77);
//		System.out.println("39. la respuesta es:" + numbers3.hexString());
//		
//		//BUCLES
//		
//		/**
//		 * Sumar todos los digitos de un número
//		 */
//		var numb1 = new SumOfDigits (1234);
//		System.out.println("40. la suma de los digitos es:" + numb1.digitSum());
//		
//		var numb2 = new SumOfDigits (555);
//		System.out.println("41. la suma de los digitos es:" + numb2.digitSum());
//		
//		/**
//		 * Sumar tod el rango de numeros
//		 */
//		var numb3 = new SumNumbersRang(10);
//		var numb4 = new SumNumbersRang(15);
//		System.out.println("42. la suma del rando de numeros es :" + numb3.sumRangeNumbers(numb4));
//		
//		var numb5 = new SumNumbersRang(1);
//		var numb6 = new SumNumbersRang(5);
//		System.out.println("43. la suma del rando de numeros es :" + numb5.sumRangeNumbers(numb6));
//		
//		/**
//		 * Invertir una cadena de caracteres
//		 */
//		
//		var word1 = new ReverseWord ("Java");
//		System.out.println("44. la palabra invertida es :" + word1.reverse());
//		var word2 = new ReverseWord ("Java is fun");
//		System.out.println("45. la palabra invertida es :" + word2.reverse());		
//		
//		
//		/**
//		 * contar cuantas veces se repite una sentencia de caracteres en una oración
//		 */
//		var word3 = new CountWords ("abracadabra", "ab");
//		System.out.println("46. Esa palabra se repite :" + word3.count());
//		
//		var word4 = new CountWords ("110101110101100", "01");
//		System.out.println("47. Esa palabra se repite :" + word4.count());
//		
//		var word5 = new CountWords ("sssa", "ss");
//		System.out.println("48. Esa palabra se repite :" + word5.count());
//		
//		/**
//		 * contar cuantas palabras hay en una oración
//		 */	
//		
//		var word6 = new CountWords ("one", " ");
//		System.out.println("49. Esa oracion tiene :" + word6.countWords());
//		
//		var word7 = new CountWords ("two words three", " ");
//		System.out.println("49. Esa oracion tiene :" + word7.countWords());
//		
//		var numb7 = new PrimeNumber (1);
//		System.out.println("50. Es primo ?: " + numb7.isPrime());
//		
//		var numb8 = new PrimeNumber (7);
//		System.out.println("50. Es primo ?: " + numb8.isPrime());
//		
//		var numb9 = new PrimeNumber (100);
//		System.out.println("50. Es primo ?: " + numb9.isPrime());
		
//  Digito de verificación correcto 
		
//		var numb10 = new DigitVerification ("116");
//		System.out.println("51. Es correcto el numero de verificación?: " + numb10.digitNumberIsCorrect() );
//		
//		var numb11 = new DigitVerification ("111");
//		System.out.println("52. Es correcto el numero de verificación?: " + numb11.digitNumberIsCorrect() );
//		
//		var numb12 = new DigitVerification ("019");
//		System.out.println("53. Es correcto el numero de verificación?: " + numb12.digitNumberIsCorrect() );
//		
//		var numb13 = new DigitVerification ("107");
//		System.out.println("54. Es correcto el numero de verificación?: " + numb13.digitNumberIsCorrect() );
//		
//		var numb14 = new DigitVerification ("240");
//		System.out.println("55. Es correcto el numero de verificación?: " + numb14.digitNumberIsCorrect() );
//		
//		var numb15 = new DigitVerification ("036000241457");
//		System.out.println("56. Es correcto el numero de verificación?: " + numb15.digitNumberIsCorrect() );
		
//		var word8 = new Password ("Abc123$_");
//		System.out.println("57. Es correcta la contraseña?: " + word8.isStringPassword() );
//		
//		var word9 = new Password ("Abc12345");
//		System.out.println("58. Es correcta la contraseña?: " + word9.isStringPassword() );
//		
//		var word10 = new Password ("abc123$_");
//		System.out.println("59. Es correcta la contraseña?: " + word10.isStringPassword() );
//		
//		var word11 = new Password ("Abcdef$_");
//		System.out.println("60. Es correcta la contraseña?: " + word11.isStringPassword() );
//		
//		var word12 = new Password ("ABC123$_");
//		System.out.println("57. Es correcta la contraseña?: " + word12.isStringPassword() );
		
		/**
		 * CONVERTIR DE SNAKE CASE A CAMEL CASE
		 */
		
//		var word13 = new CamelCase ("last_three_digits");
//		System.out.println("61. pasar de snake case a camel case: " + word13.SnakeCaseToCamelCase());
		
//		var word14 = new CamelCase ("lastThreeDigits");
//		System.out.println("62. pasar de camel case a snake case: " + word14.camelCaseToSnakeCase());
//		
//		var word15 = new CamelCase ("vowels");
//		System.out.println("63. pasar de camel case a snake case: " + word15.camelCaseToSnakeCase());
		
		/**
		 * CUAL ES NUMERO MAXIMO
		 */
//		var num = new MaxNumber (-1, 10,  3 );
//		System.out.println("64. el número máximo es: " + num.max());
//		
//		var num1 = new MaxNumber (5, 4,  3 );
//		System.out.println("65. el número máximo es: " + num1.max());

	
	/**
	 * SACAR HISTROGRAMA
	 */	
//	var word16 = new Histrograma (5, 1, 3);
//	System.out.println( word16.histogram());
	/**
	 * CONTAR REPETICIONES 
	 */
//	 var array = new contarPosiciones (new int [] {2} );
//	 System.out.println( Arrays.toString(array.stats()));
//	 
//	 var array1 = new contarPosiciones (new int [] {5, 5} );
//	 System.out.println( Arrays.toString(array1.stats()));
//	 
//	 var array2 = new contarPosiciones (new int [] {0, 1, 2, 3, 2, 0, 5, 1, 2} );
//	 System.out.println( Arrays.toString(array2.stats()));
//	 
	 
	 /**
	  * MATRICES 
	  */	 
//	 var matrix1 = new MatrizOne (2, 3);
//	 System.out.println(matrix1.numericMatrix());
//	 
//	 var matrix2 = new MatrixTwo (3);
//	 System.out.println(matrix2.identify());
//	 
//	 var matrix3 = new MatrixTwo (4);
//	 System.out.println(matrix3.identify());
	 
	 /**
	  * CALCULAR LA FUNCIÓN CUADRÁTICA
	  */
	 
	 var discrimi1 = new Cuadratic (1.0, -1.0, -12);
	 System.out.println("El valor es:" + Arrays.toString(discrimi1.Quadratic()));
	 
	 
	 
	}
}
