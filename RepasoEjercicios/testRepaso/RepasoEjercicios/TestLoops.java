package RepasoEjercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.Loops;

public class TestLoops {

// SUM OF DIGITS 
	@Test
	void sumOfDigits1(){
		assertEquals(1, Loops.digitSum(1234));
	}
	
	@Test
	void sumOfDigits2(){
		assertEquals(6, Loops.digitSum(555));
	}

// SUM RANGE NUMBERS

	@Test
	void sumRangeNumbers1(){
		assertEquals(75, Loops.sumRangeNumbers(10, 15));
	}
	
	@Test
	void sumRangeNumbers2(){
		assertEquals(15, Loops.sumRangeNumbers(1, 5));
	}	
	
// HARMONIC SERIES 
	
	@Test
	void harmonicSeries1(){
		assertEquals(1.0, Loops.harmonicSeries(1), 0.1);
	}
	
	@Test
	void harmonicSeries2(){
		assertEquals(1.5, Loops.harmonicSeries(2), 0.1);
	}

// REVERSE
	
	@Test
	void reverse1(){
		assertEquals("avaJ", Loops.reverse("Java"));
	}
	
	@Test
	void reverse2(){
		assertEquals("nuf si avaJ", Loops.reverse("Java is fun"));
	}

// COUNT
	@Test
	void count1(){
		assertEquals(2, Loops.count("abracadabra", "ab"));
	}
	
	@Test
	void count2(){
		assertEquals(4, Loops.count("110101110101100", "01"));
	}
	
	@Test
	void count3(){
		assertEquals(1, Loops.count("sssa", "ss"));
	}

// COUNT WORDS
	@Test
	void countWords1(){
		assertEquals(1, Loops.countWords("one"));
	}
	
	@Test
	void countWords2(){
		assertEquals(3, Loops.countWords("two words three"));
	}
	
	
}