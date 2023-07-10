package RepasoEjercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.conditionals;

public class TestConditionals {
	
	// PRIME
	
	@Test
	void isPrime1 () {
		assertEquals(true, conditionals.isPrime(1));
	}
	
	@Test
	void isPrime7() {
		assertEquals(true, conditionals.isPrime(7));
	}
	
	@Test
	void isPrime100() {
		assertEquals(false, conditionals.isPrime(100));
	}
	
	// IS CORRECT DIGIT NUMBER SECURITY 
	
	@Test
	void digitNumberIsCorrect1() {
		assertEquals(true, conditionals.digitNumberIsCorrect("116"));
	}
	
	@Test
	void digitNumberIsCorrect2() {
		assertEquals(false, conditionals.digitNumberIsCorrect("111"));
	}
	
	@Test
	void digitNumberIsCorrect3() {
		assertEquals(true, conditionals.digitNumberIsCorrect("019"));
	}
	
	@Test
	void digitNumberIsCorrect4() {
		assertEquals(true, conditionals.digitNumberIsCorrect("107"));
	}
	
	@Test
	void digitNumberIsCorrect5() {
		assertEquals(true, conditionals.digitNumberIsCorrect("240"));
	}
	
	@Test
	void digitNumberIsCorrect6() {
		assertEquals(true, conditionals.digitNumberIsCorrect("036000241457"));
	}
	
	// CORRECT PASSWORD
	
	 @Test
	 void isStringPassword1 () {
		 assertEquals(true, conditionals.isStringPassword("Abc123$_"));
	 }
	 
	 @Test
	 void isStringPassword2 () {
		 assertEquals(false, conditionals.isStringPassword("Abc12345"));
	 }
	 
	 @Test
	 void isStringPassword3 () {
		 assertEquals(false, conditionals.isStringPassword("abc123$_"));
	 }
	 
	 @Test
	 void isStringPassword4 () {
		 assertEquals(false, conditionals.isStringPassword("Abcdef$_"));
	 }
	 
	 @Test
	 void isStringPassword5 () {
		 assertEquals(true, conditionals.isStringPassword("ABC123$_"));
	 }
	
	// CAMEL CASE TO SNAKE CASE
	
	 @Test
	 void camelCaseToSnakeCase1 () {
		 assertEquals("Last_three_digits", conditionals.camelCaseToSnakeCase("lastThreeDigits"));
	 }
	 
	 @Test
	 void camelCaseToSnakeCase2 () {
		 assertEquals("Vowels", conditionals.camelCaseToSnakeCase("vowels"));
	 }
	
	 @Test
	 void snakeToCamelCase () {
		 assertEquals("lastThreeDigits", conditionals.snakeCaseToCamelCase("last_three_digits"));
	 }
}
