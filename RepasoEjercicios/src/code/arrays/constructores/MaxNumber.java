package code.arrays.constructores;

public class MaxNumber {
		private int  number1;
		private int  number2;
		private int  number3;
		
		public MaxNumber (int number1, int number2, int number3) {
			this.number1 =   number1 ;
			this.number2 =   number2;
			this.number3 =   number3 ;
		}
		
		public int  number1 () {
			return this.number1;
		}
		
		public int  number2 () {
			return this.number2;
		}
		
		public int  number3 () {
			return this.number3;
		}
		
		public int max () {
			var array = new int[] {number1(), number2(), number3() };
			var max = 0; 
			for (var n = 0 ;  n < array.length; n++) {
				if (array[n] > max) {
					max = array[n];
				}
			}
			return max;
		}
}
