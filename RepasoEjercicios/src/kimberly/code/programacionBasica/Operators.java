package kimberly.code.programacionBasica;

public class Operators {

//	OPERATORS-EVEN: Write a function isEven() that checks if a number is even. A number is even if it's multiple of 2.
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
// OPERATORS-ODD: Write a function isOdd() that checks if a number is odd. A number is odd if it’s not even
	public static boolean isOdd(int oddNumber) {
		return !(isEven(oddNumber));
	}
	
// OPERATORS-DIFF: Write a function, differenceOfSquare() that takes two integers and returns the result of a2 - b2
	public static int differenceOfSquare(int num1, int num2) {
		var pow1 = num1*num1;
		var pow2 = num2*num2;
		var difference = Math.abs(pow1 - pow2);
		return difference;
	}

	// OPERATORS-ANGLE: Write a function, thirdAngle() that takes two doubles that represents the measure of two angles of a triangle and returns the measure of the third. The
	// 3 angles of a triangle sum 180, so if you subtract the sum of two angles to 180 you should get the third angle.

	public static double thirdAngle (double angle1, double angle2) {
		var addTwoAngles = angle1 + angle2;
		var angle3 = 180.0 - addTwoAngles;
		return angle3;
	}
	
	//OPERATORS-LAST: Write a function lastDigit() that, given an int returns its last digit
	
	public static int lastDigit (int number) {
		return number % 10;
	}
	
	//OPERATORS-TRUNCATE: Write a function truncate() that, given an int returns the resulting int if we remove the last digit.
	
	public static int truncate (int number) {
		return number / 10;
	}
	
	
	//OPERATORS-SINES: This is the Law of Sines
	//It says that if you know the length of a triangle “a”, the angle opposite of it “A” and the length of another angle “B”, you can find the measure of “b” by evaluating:
	//(a * (sin B)) / (sin A
	
	public static double lawOfSines (double a, double A, double B) {
		var sinOfA= Math.sin(A);
		var sinOfB= Math.sin(B);
		return (a * sinOfB) / sinOfA; 
	}
	
}
