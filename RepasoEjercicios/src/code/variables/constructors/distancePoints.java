package code.variables.constructors;

public class distancePoints {

	private double x;
	private double y;
	
	public distancePoints (double x, double y) {
		this.x = x;
		this.y = x;
	}
	
	public double x () {
		return this.x;
	}
	
	public double y () {
		return this.y;
	}
	
	public double distance (distancePoints point) {
		var differenceX = point.x() - this.x;
		var differenceY = point.y() - this.y;
		var result = Math.sqrt(Math.pow(differenceX, 2) + Math.pow(differenceY, 2)); 
		return result;
	}
}
