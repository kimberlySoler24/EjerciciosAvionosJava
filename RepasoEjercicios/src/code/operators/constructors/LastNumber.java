package code.operators.constructors;

public class LastNumber {

	//atributo
	private int number;
	
	//contructor
	public LastNumber(int number) {
		this.number = number;
	}
	
	//metodo
	public int number () {
		return this.number;
	}
	
	//metodo 
	public int lastDigit () {
		var lastNumber = number() % 10;
		return lastNumber;
	}
	
	public int truncate () {
		var truncate = number() / 10;
		return truncate;
	}



}

