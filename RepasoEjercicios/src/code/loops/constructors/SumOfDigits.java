package code.loops.constructors;

public class SumOfDigits {
	
	private int number;
	
	public SumOfDigits (int number) {
		this.number = number;
	}
	
	public int  number () {
		return this.number;
	}
	
	public int digitSum () {
		var sum = 0;
		while (number > 0) {
			var modulo = number % 10 ;
			sum += modulo;
			number = number / 10;
		}
		 if (sum > 9) {
			return  (sum%10) + (sum/10);
		 } else {
			 return sum;
		 }
	}
	
	
}
