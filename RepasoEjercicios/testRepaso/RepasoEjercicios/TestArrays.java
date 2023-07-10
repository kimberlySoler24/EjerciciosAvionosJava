package RepasoEjercicios;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.Arreglos;

public class TestArrays {
	
	// HISTOGRAM
		@Test
		void histogram() {
			assertEquals(String.format("*****%n*%n***%n"),Arreglos.histogram(new int[] {5, 1, 3}));
		}
// MAX NUMBER
		@Test
		void max1() {
			assertEquals(10,Arreglos.max(new int[] {-1, 10, 5}));
		}
		
		@Test
		void max2() {
			assertEquals(5,Arreglos.max(new int[] {5, 4, 3}));
		}
// STATS 
		@Test
		void stats1() {
			assertArrayEquals(new int[] {0, 0, 1, 0, 0, 0}, Arreglos.stats(new int[] {2}));
		}
		
		@Test
		void stats2() {
			assertArrayEquals(new int[] {0, 0, 0, 0, 0, 2}, Arreglos.stats(new int[] {5, 5}));
		}
		
		@Test
		void stats3() {
			assertArrayEquals(new int[] {2, 2, 3, 1, 0, 1}, Arreglos.stats(new int[] {0, 1, 2, 3, 2, 0, 5, 1, 2}));
		}
}
