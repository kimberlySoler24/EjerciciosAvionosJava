package code.operators.constructors;

public class foundAngle {
	
	private double firstAngle;

	public foundAngle (double firstAngle) {
		this.firstAngle = firstAngle;
	}
	
	public double firstAngle () {
		return this.firstAngle;
	}
	
	
	public double thirdAngle (foundAngle third) {
		var addTwoAngles = third.firstAngle() + this.firstAngle;
		var thirdAngle = 180.0 - addTwoAngles;
		return thirdAngle;
	}
}

