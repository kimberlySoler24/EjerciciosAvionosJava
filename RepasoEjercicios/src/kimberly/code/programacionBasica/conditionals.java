package kimberly.code.programacionBasica;

public class conditionals {

//CONDITIONS-PRIME: In Mathematics every integer number has at least 2 divisors: 1 and the 
//number itself. These are called obvious divisors. Prime numbers are numbers greater than 
//1 that, beside obvious divisors, don’t have any other divisor. Remember that if <a> is 
//multiple of <b>, then <b> is a divider of <a>. Write a function isPrime to check if a number 
//is prime.

	public static boolean isPrime(int number) {
		var sum = 1;
		var count = 0;
		while (sum <= number) {
			if (number % sum == 0) {
				count++;
			}
			sum++;
		}
		return count < 3;
	}

//CONDITIONS-UPC: Verification digits are a simple mechanism to catch errors when a number is inputted. 
//The verification digit is usually added at the end of a number, so that a computer can calculate the 
//verification digit and check if it's the same as inputted, if it’s not then there was an error when 
//it was inputted. For UPC the algorithm is:

	public static boolean digitNumberIsCorrect(String number) {
		var removeFinalNumber = number.substring(0, number.length() - 1);
		var lastDigit = Character.getNumericValue(number.charAt(number.length() - 1));
		var sumEven = 0;
		var sumOdd = 0;
		for (var i = 0; i < removeFinalNumber.length(); i++) {
			if (i % 2 == 0) {
				sumEven += Character.getNumericValue(removeFinalNumber.charAt(i));
			} else {
				sumOdd += Character.getNumericValue(removeFinalNumber.charAt(i));
			}
		}
		var allSum = (sumEven * 3 + sumOdd);
		;

		return compareNumber(allSum, lastDigit);
	}

	public static boolean compareNumber(int number, int LastDigit) {
		var result = number % 10;
		if (result == 0) {
			return result == LastDigit;
		} else {
			return (10 - result) == LastDigit;
		}
	}

//CONDITIONS-PASSWORD: Write a function isStrongPassword that takes a String and returns true 
//only if a password meets the following criteria:

	public static boolean isStringPassword (String password) {
		var countNumbers = 0;
		var countUppercaseLetter = 0;
		var countNonAlphanumerics = 0;
		for (var i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				       countNumbers++;
			} else if (Character.isUpperCase(password.charAt(i))) {
				         countUppercaseLetter++;
			  }else if (!Character.isDigit(password.charAt(i)) 
					       && !Character.isAlphabetic(password.charAt(i))) {
				  countNonAlphanumerics++;
			  	} 
		}
		return countNumbers > 0 && countUppercaseLetter > 0 
				&& countNonAlphanumerics > 0 && password.length() > 7;
	}

//CONDITIONS-CASES: CamelCase is a way to write identifiers with more than one word 
//“separating” them using uppercase letters. Snake case on the other hand uses lowercase 
//letters but uses underscores to separate words. Write a function camelCaseToSnakeCase 
//which takes a String which is a valid identifier written in CamelCase and returns it 
//in Snake Case. Also write a function snakeCaseToCamelCase for the inverse operation.
	
	public static String camelCaseToSnakeCase (String word) {
		var builder = new StringBuilder();
		for (var i = 0; i < word.length(); i++) {
			var current = word.charAt(i);
			var upperCase = Character.isUpperCase(current);
			if (i == 0) {
				builder.append(Character.toUpperCase(current));
			}else {
				if (upperCase) {
					builder.append('_');
				}
				var convertToLowerCase = upperCase ? Character.toLowerCase(current)
						: current;
				builder.append(convertToLowerCase);
			}
			
		}
		return builder.toString();
	}
	
	
	public static String snakeCaseToCamelCase (String word) {
		var builder = new StringBuilder ();
		var uppercase = false;
		for (var i = 0; i < word.length(); i++) {
			var current = word.charAt(i);
			if (current == '_') {
				uppercase = true;
			} else {
				if (uppercase) {
					builder.append(Character.toUpperCase(current));
					uppercase = false;
				} else {
					builder.append(current);
				}
			}
		}
		return builder.toString();
	}
}










