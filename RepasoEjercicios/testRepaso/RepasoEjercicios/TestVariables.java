package RepasoEjercicios;

import kimberly.code.programacionBasica.Variables;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestVariables {
	
// DISTANCE
	@Test
	void distance1() {
		assertEquals(1.4142,Variables.distance(0.0, 0.0, 1.0, 1.0),0.0001);
	}

// Convert temperature from Fahrenheit to celsius	
	@Test
	void convert60() {
		assertEquals(15.5555,Variables.fahrenheitToCelsius(60.0),0.0001);
	}
	
	@Test
	void convert32() {
		assertEquals(0,Variables.fahrenheitToCelsius(32.0),0.0001);
	}	
	
// isTriangle
	@Test
	void isTriangle1() {
		assertEquals(true,Variables.isTriangle(new double[] {3.0, 4.0, 5.0}));
	}	
	
	@Test
	void isTriangle2() {
		assertEquals(false,Variables.isTriangle(new double[] {17.0, 10.0, 7.0}));
	}	
	
}

