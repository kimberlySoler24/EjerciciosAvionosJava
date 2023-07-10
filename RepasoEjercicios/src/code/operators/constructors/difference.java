package code.operators.constructors;

public class difference {
	
	private int a;
	private int b;
	
	public difference (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int a () {
		return this.a;
	}
	
	public int b () {
		return this.b;
	}
	
	public int differenceOfSquare() {
		var powA = this.a * this.a;
		var powB = this.b * this.b;
		var rest = powA - powB;
		return rest;
	}
	
}
