package code.otrosEjercicios.objetos;
import code.otrosEjercicios.objetos.CuadraticSquare;

public class Cuadratic {
	
	private double a;
	private double b;
	private double c;
	
	
	public Cuadratic (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double a() {
		return this.a;
	}
	
	public double b() {
		return this.b;
	}
	
	public double c() {
		return this.c;
	}

	public double [] Quadratic () {
		var discrimi = new CuadraticSquare (a(), b(), c());
		double result = discrimi.discriminant();
		if (result < 0) {
			return new double[0];
		} else if (result == 0) {
			var value = new double[] { -b / 2 * a };
			return value;

		}else {
			var sqrt = Math.sqrt(result);
			var value1 = (-b() + sqrt) / (2 * a());
			var value2 = (-b() - sqrt) / (2 * a());
			var values = new double[] { value1, value2 };
			return values;
		}
		
	}
}
