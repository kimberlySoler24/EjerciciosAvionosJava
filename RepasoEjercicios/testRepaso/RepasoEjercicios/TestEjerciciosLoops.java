package RepasoEjercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.ejerciciosBucles;

public class TestEjerciciosLoops {
	@Test
	void pasitos () {
		assertEquals(".....*", ejerciciosBucles.pasitos(5));
	}
	
	@Test
	void relajate () {
		assertEquals("(\\_/)\r\n( *_* )\r\n/ >torta\r\n", ejerciciosBucles.relajate("torta"));
	}
	
	@Test
	void sumaParesIncluido () {
		assertEquals(12, ejerciciosBucles.sumaParesIncluido(6));
	}
	
	
	@Test
	void strignDeDigitos () {
		assertEquals("0123456789", ejerciciosBucles.strignDeDigitos());
	}
	
	@Test
	void trianguloNumeros () {
		assertEquals("1\r\n12\r\n123\r\n1234\r\n ", ejerciciosBucles.strignDeDigitos());
	}
	
}
