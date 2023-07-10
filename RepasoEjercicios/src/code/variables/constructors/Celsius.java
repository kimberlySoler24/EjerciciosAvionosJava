package code.variables.constructors;

public class Celsius {
	
	private double fahrenheit;
	
	public Celsius (double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public double fahrenheit () {
		return this.fahrenheit;
	}
	
	public double fahrenheitToCelsius () {
		return (this.fahrenheit - 32.0) * (5.0/9.0);  
	}
}
