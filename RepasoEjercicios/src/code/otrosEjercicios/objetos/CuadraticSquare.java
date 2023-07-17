package code.otrosEjercicios.objetos;

public class CuadraticSquare {
	
	private double a;
	private double b;
	private double c;
	
	public CuadraticSquare (double a, double b, double c) {
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
	
	/**
	 * halla el discriminante de una ecuación cuadrática
	 * @return Corresponde al valor de b2 - 4ac
	 */
	
	public double discriminant () {
		return Math.pow(b, 2) - (4 * a * c);
	}
}
