package code.conditional.constructors;

public class PrimeNumber {
	
		private int number;
		
		public PrimeNumber (int number) {
			this.number = number;
		}
		
		public int number () {
			return this.number;
		}
		
		public boolean isPrime () {
			var digit = this.number;
			var count = 0;
			for (var n =1; n < digit; n++) {
				if (digit % n == 0) {
					count++;
				}
			}
			return count < 3 && digit > 1;
		}
}
