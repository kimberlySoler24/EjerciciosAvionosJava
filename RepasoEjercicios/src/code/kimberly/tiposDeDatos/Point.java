package code.kimberly.tiposDeDatos;


import java.util.Objects;

 public class Point { //objeto

	//ATRIBUTOS
	private double x; //private es para hacer cambios internos y que nadie los vea.
	private double y;
	
	//CONSTRUCTORES, también reciben parámetros
	public Point(double x, double y) { //public es el modificador de acceso
		this.x = x; //para hacer referencia a los atributos de private se usa el método this. ...
		this.y = y; // quiere decir que el atributo y tenga el mismo valor del parámetro y y así.. con esto se puede dart a conocer los atributos que son privados. 
	}
	
	//MÉTODO
	public double x() { //metodos accesores del objeto tipo punto
		return this.x;  //llamar a los métodos de una manera que sea entendible
	}
	
	public double y() { //metodo accesor
		return this.y;
	}
	
	/**
	 * Este método cálcula la distancia entre dos puntos
	 * @param p1 un punto válido compuesto por x1 y y1
	 * @param p2 un punto válido compuesto por x2 y y2
	 * @return la distancia cálculada sobre (p1.x, p1.y) y (p2.x, p2.y)
	 */
	
public static double distance(Point p1, Point p2) {
		
		var substractX = p2.x() - p1.x(); //al punto1 saque la x y al punto 2 saque la x
		var substractY = p2.y() - p1.y();
		var squareX = Math.pow(substractX, 2);
		var squareY = Math.pow(substractY, 2);
		var plus = squareX + squareY;
		var squareRoot = Math.sqrt(plus);
		return squareRoot;
	}	
	
	//devolver una propiedad de ese punto 
/**
 * Verifica si este punto comparte al menos una coordenada con el parámetro dado
 * @param p un punto válido 
 * @return true si este punto comparte una coordenada x o y o false si no comparte alguna coorenada 
 */
	
	public boolean sharedCoordinate(Point p) { //revisar si tiene una coordenada compartida con otro punto
		return this.x == p.x || this.y == p.y;
	}
	
public double distance1(Point p) {
		
		var substractX = p.x - this.x;
		var substractY = p.y - this.y;
		var squareX = Math.pow(substractX, 2);
		var squareY = Math.pow(substractY, 2);
		var plus = squareX + squareY;
		var squareRoot = Math.sqrt(plus);
		return squareRoot;
	}
	
public String toString() { 
	return String.format("(%f, %f)", this.x, this.y);
}

@Override
public int hashCode() {
	return Objects.hash(x, y);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Point other = (Point) obj;
	return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
			&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
}
	
	
	
	
	
	
}
