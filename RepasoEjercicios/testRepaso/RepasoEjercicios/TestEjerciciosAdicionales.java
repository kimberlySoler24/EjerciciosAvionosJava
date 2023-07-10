package RepasoEjercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.EjerciciosAdicionales;

public class TestEjerciciosAdicionales {

// VISUALIZAR HOLA MUNDO EN JAPONES
	@Test
	void japaneseGreeting () {
		assertEquals("こんにちは世界", EjerciciosAdicionales.japaneseGreeting());
	}
	
// ADIVINAR PELICULA 
	@Test
	void guessTheMovie () {
		assertEquals("\uD83E\uDD7E \r\n \uD83C\uDF44 \r\n \uD83D\uDC51", EjerciciosAdicionales.guessTheMovie("\uD83E\uDD7E", "\uD83C\uDF44", "\uD83D\uDC51"));
}

//	AUMENTO Y DESCUENTO
	@Test
	void progressBar1 () {
		assertEquals("*+++++++++", EjerciciosAdicionales.progressBar(10));
	}
	
	@Test
	void progressBar2 () {
		assertEquals("*+++++++++", EjerciciosAdicionales.progressBar(17));
	}
	
	@Test
	void progressBar3 () {
		assertEquals("*****+++++", EjerciciosAdicionales.progressBar(53));
	}
	
// NUMERO REVERSADO
	
	@Test
	void inverse1 () {
		assertEquals(31, EjerciciosAdicionales.inverse(13));
	}
	
	@Test
	void inverse2 () {
		assertEquals(56, EjerciciosAdicionales.inverse(65));
	}
	
//  NOTAS UNIVERSITARIAS
	
	@Test
	void finalGrade1 () {
		assertEquals(4.1, EjerciciosAdicionales.finalGrade(3.0, 4.0, 5.0), 0.1);
	}
	
	@Test
	void finalGrade2 () {
		assertEquals(3.37, EjerciciosAdicionales.finalGrade(3.7, 4.2, 2.5), 0.1);
	}
	
	@Test
	void maxGrade1 () {
		assertEquals(3.8, EjerciciosAdicionales.maxGrade(3.0, 3.0), 0.1);
	}
	
	@Test
	void maxGrade2 () {
		assertEquals(3.35, EjerciciosAdicionales.maxGrade(2.0, 2.5), 0.1);
	}
	
	@Test
	void minimumGradeNeeded1 () {
		assertEquals(0.0, EjerciciosAdicionales.minimumGradeNeeded(5.0, 5.0), 0.1);
	}
	
	@Test
	void minimumGradeNeeded2 () {
		assertEquals(1.65, EjerciciosAdicionales.minimumGradeNeeded(3.7, 4.1), 0.01);
	}
	
	@Test
	void minimumGradeNeeded3 () {
		assertEquals(-1.0, EjerciciosAdicionales.minimumGradeNeeded(1.0, 1.5), 0.1);
	}
	
// CAMBIAR DE IDIOMA A UNA PÁGINA WEB
	
	@Test
	void changeLanguage1 () {
		assertEquals("https://www.acme.co/es/about-us", EjerciciosAdicionales.changeLanguage(
				"https://www.acme.co/en/about-us", "es"));	
	}
	
	@Test
	void changeLanguage2 () {
		assertEquals("https://www.java.com/fr", EjerciciosAdicionales.changeLanguage(
				"https://www.java.com/es", "fr"));	
	}
	
	
// TERMINA EN VOCAL
	
	
	@Test
	void endsInVocal1 () {
		assertEquals(true, EjerciciosAdicionales.endsInVocal("JAVA"));	
	}
	
	@Test
	void endsInVocal2 () {
		assertEquals(true, EjerciciosAdicionales.endsInVocal("java"));	
	}
	
	@Test
	void endsInVocal3 () {
		assertEquals(false, EjerciciosAdicionales.endsInVocal("java is fun"));	
	}
	
	
	
	
	
}
