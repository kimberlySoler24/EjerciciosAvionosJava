package kimberly.code.programacionBasica;

public class Loops {

//LOOPS-DIGIT-SUM The digitSum of a number is the resulting number after applying this operation: sum the digits 
//of a number. If the result has more than one digit, repeat the operation. Write a function to calculate the digitSum 
//of an integer number. Remember to use the function sumOfDigits() from the start of the chapter.
	public static int numberlessten (int num) {
//		if (num > 9) {
//			var divide = num /10;
//			var modulo = num % 10;
//			var result = divide + modulo;
//			return result;
//		}else {
//			return num;
//		}
		while (num > 9) {
			num = digitSum (num);
		}
		return num;
	}
	
	
	public static int digitSum (int number) {
		var sum = 0;
		
		while (number > 0) {
			var lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;
		} 	
		return numberlessten(sum);
	}	
	
	
//LOOPS-RANGE-SUM Write an overloaded version of sumRangeNumbers that takes two parameters, 
//defines a range of numbers and returns some of the numbers between them inclusive. 
//Then reimplement the sumRangeNumbers(int) function to use this new function.
	
	public static int sumRangeNumbers(int initialNum, int lastNum) {
		var sum = 0;
		while (initialNum <= lastNum) {
			sum += initialNum;
			initialNum++;
		}	
		return sum;
	}

//LOOPS-HARMONIC Write a harmonicSeries that given a number n, calculates 
//the sum of the terms of the series 1 + ½ + ⅓ + … 1/n	
	
	public static double harmonicSeries(int number) {
		var count = 1;
		var sum = 0.0;
		var divide = 0.0;
		while (count <= number) {
			divide = 1.0 / count;
			count++;
			sum += divide;
		}
		return sum;
	}

//LOOPS-REVERSE: Write a function that takes a string and reverse it:
	
	public static String reverse(String word) {
		StringBuilder builder = new StringBuilder();
			for (var i = word.length() - 1; i >= 0; i--) {
			builder.append(word.charAt(i));
		}
		return builder.toString();
	}
	
//LOOPS-COUNT: Using String’s methods, write a function that counts how many times a substring appears in a 
//given String.

	public static int count(String word, String wordToFound) {
		var count = 0;
		var index =word.indexOf(wordToFound);
		while (index != -1) {
		++count;
		index = word.indexOf(wordToFound, index + wordToFound.length());
		}
		return count;
	}

// LOOPS-WORDS: Write a function that takes a String representing a sentence 
//and counts how many words are in it. You can assume that the sentence will 
//only consist of alphanumeric characters and 1 space will separate words 
//in it.

	public static int countWords(String word) {
		return count (word, " ") + 1;
	}
	
	
}
