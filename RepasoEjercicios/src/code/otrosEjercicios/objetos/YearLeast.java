package code.otrosEjercicios.objetos;

public class YearLeast {
	
	private int number;
	
	public YearLeast (int number) {
		this.number = number;
	}
	
	public int number () {
		return this.number;
	}
	
	public boolean isLeapYear () {
		var divideFour = number % 4;
		var divideFourHundred = number % 400;
		var divideOneHundred = number % 100;
		var result1 =  divideFour == 0 ? true : false;
		var result2 =  divideFourHundred == 0 ? true : false;
		var result3 =  divideOneHundred != 0 ? true : false;
		return  result1 && result2
				|| result3; 
	}

}
