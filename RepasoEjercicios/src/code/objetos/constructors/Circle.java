package code.objetos.constructors;

import java.util.Objects;

import code.kimberly.tiposDeDatos.Point;

public class Circle {

	private Point center;
	private double radius;
	
	public Circle (Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	

	public Point center () {
		return this.center;
	}
	
	public double radius () {
		return this.radius;
	}

	public double area () {
		return Math.PI * Math.pow(radius(), 2.0);
	}
	
	public double circumference() {
		return 2 * Math.PI * radius();
	}
	
	public boolean intersects (Circle other) {
		var result = other.center.distance1(this.center);
		var sum = other.radius + this.radius;
		return result <= sum;
	}


	@Override
	public int hashCode() {
		return Objects.hash(center, radius);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Objects.equals(center, other.center)
				&& Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}
	
	

}
