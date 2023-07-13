package TestObjetos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import code.kimberly.tiposDeDatos.Point;
import code.objetos.constructors.Circle;

public class TestCircle {
	
	@Test
	void area() {
		assertEquals(Math.PI, new Circle(new Point(0.0, 0.0), 1.0).area(), 1e-6);
	}
	
	@Test
	void circumference() {
		assertEquals(Math.PI * 2.0, new Circle(new Point(0.0, 0.0), 1.0).circumference(), 1e-15);
	}
	
	@Test
	void equality (){
	assertTrue(new Circle(new Point(1.0, 2.0), 3.0).equals(new Circle(new Point(1.0, 2.0), 3.0)));
	}
	
	@Test
	void equality1 (){
	assertEquals(new Circle(new Point(1.0, 2.0), 3.0), new Circle(new Point(1.0, 2.0), 3.0));
	}
	
	@Test
	public void negativeEqualityRadius() {
	  assertFalse(new Circle(new Point(0.0, 0.0), 1.0).equals(new Circle(new Point(0.0, 0.0), 0.0)));
	}
	
	@Test
	public void negativeEqualityRadius1() {
	  assertNotEquals(new Circle(new Point(0.0, 0.0), 1.0), new Circle(new Point(0.0, 0.0), 0.0));
	}


	@Test
	void negativeEqualityCenter (){
	assertFalse(new Circle(new Point(1.0, 1.0), 1.0).equals(new Circle(new Point(0.0, 0.0), 1.0)));
	}
	
	@Test
	public void negativeEqualityCenter1() {
	  assertNotEquals(new Circle(new Point(1.0, 1.0), 1.0), new Circle(new Point(0.0, 0.0), 1.0));
	}
	
	@Test 
	void isCirclesIntersects3 () {
		var zeroZero = new Circle(new Point(0.0, 0.0), 1.0);
		var oneZero = new Circle(new Point(1.0, 0.0), 1.0);
		assertTrue(zeroZero.intersects(oneZero));
	}
	
	@Test 
	void isCirclesIntersects4 () {
		var zeroZero = new Circle(new Point(0.0, 0.0), 1.0);
		var twoTwo = new Circle(new Point(2.0, 2.0), 1.0);
		assertFalse(zeroZero.intersects(twoTwo));
	}
	
	
	
}

