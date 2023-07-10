package kimberly.code.programacionBasica;


//E3-DISTANCE: Write a function that calculates the distance between two points. Each point is represented by 2 doubles; the function takes 4 parameters, 
//the first two are the x and y coordinate of the first point and the last two are the x and y coordinate of the second point.


public class Variables {

	public static double distance (double X1, double Y1, double X2, double Y2 ) {
		var XOperation = Math.pow((X2 - X1), 2); 
		var YOperation = Math.pow((Y2 - Y1), 2); 
		return Math.sqrt(XOperation + YOperation);
	}
	
//E3-FAHRENHEIT: Write a function that, given a temperature measured in Fahrenheit as a double, returns the equivalent value in Celsius. 
//Use the formula: C = (F - 32) * 5/9
	public static double fahrenheitToCelsius (double fahrenheit) {
		var convertFahrenheitToCelsius = (fahrenheit - 32.0)*(5.0/9.0);
		return convertFahrenheitToCelsius;
	}

// E3-TRIANGLE: A Triangle is a closed polygon with 3 sides. Each side has a length, but do you think that given 3 
//random lengths you can always draw a triangle with them? The answer is no, there’s a property of the 3 sides 
//that needs to be true to form a triangle: The longest side must be less than the sum of the other 2 sides.
	public static boolean isTriangle (double []triangle) {
		var max = 0.0;
		var sumOfOtherSides = 0.0;
		for (var i=0; i < triangle.length; i++) {
			if (triangle[i] >= max) {
				max = triangle[i];
			}
			sumOfOtherSides += triangle[i];
		}
		
		return (sumOfOtherSides - max) > max ;
	}
	
	
}
