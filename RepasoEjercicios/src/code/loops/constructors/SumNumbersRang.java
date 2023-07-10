package code.loops.constructors;

public class SumNumbersRang {

	private int number;
	
	public SumNumbersRang (int number) {
		this.number = number;
	}
	
	public int number () {
		return this.number;
	}
	
	public int sumRangeNumbers (SumNumbersRang num) {
		var sum = 0;
		while ( this.number <=  num.number() ) {
			sum += this.number;
			this.number ++;				
		}
		return sum;
	}
}
