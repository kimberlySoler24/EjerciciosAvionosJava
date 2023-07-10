package code.kimberly.tiposDeDatos;

//import java.time.LocalDate;

import kimberly.code.programacionBasica.Variables;

public class MainTiposDeDatos {

	public static void main(String[] args) {
		
		System.out.println(Variables.distance(0.0, 0.0, 1.0, 1.0));
//		LocalDate d = LocalDate.of(2023, 07, 5); 
		//int n = 1; // es un tipo de dato. Los tipos de datos ayudan a que el código sea más fácil de entender, más organizados y 
		//tengan menos errores
		// Class es el mecanismo por el cual permite crear los tipos de datos
		
		var p1= new punto(0.0, 0.0); //new significa que se va a llamar en este caso el constructor
		var p2= new punto(1.0, 1.0); //new significa que se va a llamar en este caso el constructor
		
		System.out.println(p1.x());		
		p1.x();
		p2.x();
		
		System.out.println(punto.distance(p1,p2));		
		System.out.println(p1.sharedCoordinate(p2));
		System.out.println(p1.distance1(p2));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		var a = new punto(3.0, 4.5);
		var b = new punto(3.0, 4.5);
		var c = a;
		
		System.out.println(a.equals(b)); 
		System.out.println(a == c); // el igual igual en objetos es complejo ya que a pesar de que cada objeto tenga la misma información, al ser un objeto diferente no es lo mismo. 
		System.out.println(c == b);
	}

}
