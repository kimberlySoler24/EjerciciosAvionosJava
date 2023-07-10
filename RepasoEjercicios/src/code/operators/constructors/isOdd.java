package code.operators.constructors;

public class isOdd {
	private int number;
	
	public isOdd (int number) {
		this.number = number;
	}
	
	public int number () {
		return this.number;
	}
	
	public boolean isANumberOdd () {
		if (this.number % 2 != 0) {
			return true;
		}
		return false;
	}
}
