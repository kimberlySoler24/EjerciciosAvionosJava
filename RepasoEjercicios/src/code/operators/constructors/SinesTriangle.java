package code.operators.constructors;

public class SinesTriangle {

	private double a;
	private double A;
	private double B;
	
	public SinesTriangle (double a, double A, double B) {
		this.a = a;
		this.A = A;
		this.B = B;
	}
	
	public double a () {
		return this.a;
	}
	
	public double A () {
		return this.A;
	}
	
	public double B () {
		return this.B;
	}

	public double lawOfSines () {
		var sineOfA = Math.sin(this.A);
		var sineOfB = Math.sin(this.B);
		var result = (this.a * sineOfB)/ sineOfA;
		return result;
	}
}
