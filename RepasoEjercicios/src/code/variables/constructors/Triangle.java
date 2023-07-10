package code.variables.constructors;

public class Triangle {
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double side1 () {
		return this.side1;
	}
	
	public double side2 () {
		return this.side2;
	}
	
	public double side3 () {
		return this.side3;
	}
	
	public boolean isTriangle () {
		var sides = new double [] {this.side1, this.side2, this.side3};
		var max = 0.0;
		var sum = 0.0;
		for (var index : sides ) {
			if (index >= max) {
				max = index;
			}
			sum += index;
		}
		return (sum - max) > max;
 	}
}
