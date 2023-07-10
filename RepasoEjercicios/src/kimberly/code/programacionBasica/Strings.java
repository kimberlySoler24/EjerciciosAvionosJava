package kimberly.code.programacionBasica;

public class Strings {

//	STRINGS-PALINDROME: It’s useful when trying to write a function, to first code a simpler version of it and 
//	extend it from there. Write a function that checks if a two-letter String is a palindrome. A palindrome is 
//	a sentence that reads the same regardless of where you read it, e.g. “Live on time, emit no evil”
	
public static boolean isPalindrome(String palindrome){
	var ConvertLowerCase = palindrome.toLowerCase();
	return  ConvertLowerCase.charAt(0) == ConvertLowerCase.charAt(palindrome.length() - 1);
}

//STRINGS-EXTENSION: Write a function extension() that takes a String which represents a path to a file and returns 
//the extension of the file, that's it, everything that comes after the last period of the file that it's part of 
//the filename. Paths can be relative or absolute. Remember that a file might not have extensions.

public static String extension(String link) {
	var LastDot = link.lastIndexOf('.');
	return LastDot != -1 ? link.substring(LastDot + 1) : " ";
}

//STRINGS-EXTERNAL: Write a function isExternal() that takes a String which represents a link and returns true if the 
//link is external. For this exercise keep in mind that internal links start with an “/” and external links use the 
//protocols “http” or “https”.

public static boolean isExternal(String link) {
	var foundHttp = link.indexOf("http");
	var foundDotCom = link.indexOf(".com");
	return foundHttp != -1 && foundDotCom != -1;
}

//STRINGS-DOMAIN: String parsing is very common in programming and there’s usually some types or libraries that help 
//with that. But sometimes you need just a very specific operation, so writing a basic function instead of adding an 
//extra dependency might make sense. Write a function that takes a URL and returns the domain, the part that comes
//after the protocol and ends on the next slash or the end of the String if there’s none. You might assume that all 
//parameters will begin with “https://” which is the protocol.

public static String domain(String domain) {
	var FoundSecondSlash = domain.indexOf('/') + 1;
	var FoundFirstSlashAfterDotCome = domain.indexOf("/", FoundSecondSlash + 1 );
	return FoundFirstSlashAfterDotCome != -1 
			? 
			domain.substring(FoundSecondSlash + 1, FoundFirstSlashAfterDotCome) 
			: 
			domain.substring(FoundSecondSlash + 1) ;
}

//STRINGS-EMAILS: Write a function isValidEmail() that given an email returns true if it's a valid email. 
//For the purpose of the exercise a valid email has this
//characteristics:
//● Has only one @
//● Has only one "." after the @
//● There is at least one character before the @
//● There is at least one character between the @ and the last "."
//● There is at least one character after the last "."


public static boolean isValidEmail(String email) {
	
	var emailCountAt = 0;
	var countDotAfterAt = 0;
	for (var i=0; i < email.length(); i++) {
		if (email.charAt(i) == '@') {
			emailCountAt += 1;
		}
	}
	
	for (var i=email.indexOf('@'); i < email.length(); i++) {
		if (email.charAt(i) == '.') {
			countDotAfterAt += 1;
		}
	}
	
	var foundAt= email.indexOf('@');
	var foundDot= email.indexOf('.', foundAt + 1);

	return emailCountAt <2 && !email.startsWith("@") 
		   && countDotAfterAt < 2 && !email.endsWith(".")
		   && email.indexOf('.') != -1 && (foundAt + 1) != foundDot
		   && email.substring(foundAt +1, foundDot) != ""
		   && email.substring(foundAt +1, foundDot) != " ";
}

//STRINGS-ELLIPSIFY: Write a function, to ellipsify a String. In printed media 
//it is common that if a String is too long, it gets cut and an ellipsis “…” is 
//added to the end.Notice that an ellipsis is not 3 dots, it is actually just 
//one character. The function should take 2 parameters: an String and an int 
//representing a length. This is how it should work:

public static String ellipsify (String word, int num) {
	
	var firstSpace = word.indexOf(' ');
	var NextSpace = word.indexOf(' ', firstSpace + 1);
	var firstWord = word.substring(0, firstSpace);
	var NextWord = word.substring(0, NextSpace);
	return num <= firstSpace ? 
			String.format("%s...", firstWord) 
			: num > firstSpace && num <= NextSpace ? 
			String.format("%s...", NextWord)
			: num > NextSpace ? 
			word 
			: "";
}

//TRINGS-HEX: Write a function that takes 3 integers that represent valid RGB 
//values and returns an uppercase hex String of length 6 representing it. For 
//this find the
//hex String of each of the parameters and then concatenate them. There are 
//methods in the Java API that can help you, but they might be outside of the 
//String class.

public static String hexString (int num1, int num2, int num3) {
	var firstConvertionToHex = Integer.toHexString(num1).length() < 2 ?
							   "0" + Integer.toHexString(num1)
							   :Integer.toHexString(num1);
	var secondConvertionToHex = Integer.toHexString(num2).length() < 2 ?
			   					"0" + Integer.toHexString(num2)
			   					:Integer.toHexString(num2);
	var thirdConvertionToHex = Integer.toHexString(num3).length() < 2 ?
			   				   "0" + Integer.toHexString(num3)
			   				   :Integer.toHexString(num3);
	return firstConvertionToHex.toUpperCase()
			+ secondConvertionToHex.toUpperCase()
			+ thirdConvertionToHex.toUpperCase();
}












}
