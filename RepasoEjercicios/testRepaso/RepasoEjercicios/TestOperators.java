package RepasoEjercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kimberly.code.programacionBasica.Operators;

public class TestOperators {
	
//EVEN NUMBER

 @Test
 
 void isEvenNumber2() {
	 assertEquals(true,Operators.isEven(2));
 }
 
 @Test
 void isEvenNumber13() {
	 assertEquals(true,Operators.isEven(13));
 }
 
//ODD NUMBER
 
 @Test
 
 void isOddNumber2() {
	 assertEquals(true,Operators.isOdd(2));
 }
 
 @Test
 void isOddNumber13() {
	 assertEquals(true,Operators.isOdd(13));
 }
 
//DIFFERENCE OF SQUARE
 
 @Test
 void differenceOfSquare3__2() {
	 assertEquals(5,Operators.differenceOfSquare(3,2));
 }
 
 @Test
 void differenceOfSquare1__1() {
	 assertEquals(0,Operators.differenceOfSquare(1,1));
 }
 
// THIRD ANGLE
 @Test
 void thirdAngeOf60_60() {
	 
	 assertEquals(60.0,(Operators.thirdAngle(60.0, 60.0)),0.1);
 }

 @Test
 void thirdAngeOf45_90() {
	 
	 assertEquals(45.0,(Operators.thirdAngle(45.0, 90.0)),0.1);
 }
 
 
 @Test
 void thirdAngeOf35_50() {
	 
	 assertEquals(95.0,(Operators.thirdAngle(35.0, 50.0)),0.1);
 }
 
 
//LAST DIGIT
@Test
void lastDigitOf9() {
	 
	 assertEquals(9, Operators.lastDigit(9));
}

@Test
void lastDigitOf123() {
	 
	 assertEquals(3, Operators.lastDigit(123));
}

@Test
void lastDigitOf456() {
	 
	 assertEquals(6, Operators.lastDigit(456));
}

//TRUNCATE
@Test
void truncateOf123() {
	 
	 assertEquals(12, Operators.truncate(123));
}

@Test
void truncateOf456() {
	 
	 assertEquals(45, Operators.truncate(456));
}


@Test
void truncateOf9() {
	 
	 assertEquals(0, Operators.truncate(0));
}


@Test
void truncateOf0() {
	 
	 assertEquals(0, Operators.truncate(0));
}

//TRUNCATE
@Test
void lawOfSines() {
	 
	 assertEquals(5.0, Operators.lawOfSines(5.0, 60.0, 60.0), 0.1);
}



















 
}
