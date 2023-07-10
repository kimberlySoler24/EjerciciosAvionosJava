package code.operators.constructors;

public class operatorsConstructors {

	private int number;
	
	public operatorsConstructors (int number){
		this.number = number;
	}

	public int numberEven () {
		return this.number;
	}
	
	public boolean isEven () {
			if (this.number % 2 == 0) {
				return true;
			}else {
				return false;
				}
			}
}