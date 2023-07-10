package RepasoEjercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.Strings;

public class TestStrings {

// IS PALINDROME
	@Test
	void isPalindromeab() {
		assertEquals(false, Strings.isPalindrome("ab"));
	}
	
	@Test
	void isPalindromezz() {
		assertEquals(true, Strings.isPalindrome("zz"));
	}
	
	@Test
	void isPalindromeAa() {
		assertEquals(true, Strings.isPalindrome("Aa"));
	}

// EXTENSION

	@Test
	void firstExtension() {
		assertEquals("sh", Strings.extension("debug.sh"));
	}
	
	@Test
	void secondExtension() {
		assertEquals("sh", Strings.extension("/path/to/debug.sh"));
	}
	
	@Test
	void thirdExtension() {
		assertEquals("java", Strings.extension("/the.dot/file.java"));
	}
	
	@Test
	void fourExtension() {
		assertEquals(" ", Strings.extension("no-extension"));
	}
	
	// EXTERNAL 
	
	@Test
	void secondExternal() {
		assertEquals(false, Strings.isExternal("/definetely-internal"));
	}
	
	@Test
	void firstExternal() {
		assertEquals(true, Strings.isExternal("https://www.java.com"));
	}
	
	@Test
	void thirdExternal() {
		assertEquals(true, Strings.isExternal("http://dont-go.com"));
	}
	
	//DOMAIN
	
	@Test
	void firstDomain() {
		assertEquals("www.java.com", Strings.domain("https://www.java.com/en/"));
	}
	
	@Test
	void secondDomain() {
		assertEquals("jcp.org", Strings.domain("https://jcp.org"));
	}
	
	// VALID EMAIL
	
	@Test
	void isValidFirstEmail() {
		assertEquals(true, Strings.isValidEmail("abc@me.com"));
	}
	
	@Test
	void isValidSecondEmail() {
		assertEquals(false, Strings.isValidEmail("abc@me."));
	}
	
	@Test
	void isValidThirdEmail() {
		assertEquals(false, Strings.isValidEmail("abc@mecom"));
	}
	
	@Test
	void isValidFourEmail() {
		assertEquals(false, Strings.isValidEmail("abc@me@com"));
	}
	
	@Test
	void isValidFiveEmail() {
		assertEquals(false, Strings.isValidEmail("@me.com"));
	}
	@Test
	void isValidSixEmail() {
		assertEquals(true, Strings.isValidEmail("a.bc@me.com")
);
	}
	
	@Test
	void isValidSevenEmail() {
		assertEquals(false, Strings.isValidEmail("abc@me.co.m"));
	}
	
	@Test
	void isValidEigthEmail() {
		assertEquals(false, Strings.isValidEmail("a@c@me.co.m"));
	}
	
	// ELLIPSIFY
	
		@Test
		void firstEllipsify() {
			assertEquals("Java...", Strings.ellipsify("Java is fun", 4));
		}
		
		@Test
		void secondEllipsify() {
			assertEquals("Java is...", Strings.ellipsify("Java is fun", 5));
		}
		
		@Test
		void thirdEllipsify() {
			assertEquals("Java...", Strings.ellipsify("Java is fun", 2));
		}
		
		@Test
		void fourEllipsify() {
			assertEquals("Java is fun", Strings.ellipsify("Java is fun", 20));
		}
		
		// CONVERT TO HEXADECIMAL
		
		@Test
		void firstConvertiontoHex() {
			assertEquals("000000", Strings.hexString(0, 0, 0));
		}
		
		@Test
		void secondConvertiontoHex() {
			assertEquals("FFFFFF", Strings.hexString(255, 255, 255));
		}
		
		@Test
		void thirdConvertiontoHex() {
			assertEquals("0C0F4D", Strings.hexString(12, 15, 77));
		}
		
}




















