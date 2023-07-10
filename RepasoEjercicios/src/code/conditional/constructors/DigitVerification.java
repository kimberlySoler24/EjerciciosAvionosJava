package code.conditional.constructors;

public class DigitVerification {
	private String number;
	
	public DigitVerification (String number) {
		this.number = number;
	}
	
	public String number () {
		return this.number;
	}
	
	public boolean digitNumberIsCorrect () {
		var length= this.number.length();
		var numberOutLast = this.number.substring(0, length -1 );
		var sumPar = 0;
		var sumImpar = 0;
		var value = 0; 
		for (var n = 0; n < length -1 ; n++) {
			if (n % 2 == 0) {
				sumPar += Character.getNumericValue(numberOutLast.charAt(n)); 
			} else {
				sumImpar += Character.getNumericValue(numberOutLast.charAt(n)); 
			}
		}
		var result = (sumPar*3) + sumImpar;
		var modulo =  result% 10;
		if (modulo == 0) {
			 value = 0;
		}else {
			value = 10 - modulo;
		}
		return value == Character.getNumericValue(this.number.charAt(length -1));
	}
	

}
