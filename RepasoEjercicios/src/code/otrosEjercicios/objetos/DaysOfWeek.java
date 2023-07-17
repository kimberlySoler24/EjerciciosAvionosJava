package code.otrosEjercicios.objetos;

public class DaysOfWeek {
	private int number; 
	
	public DaysOfWeek (int number) {
		this.number = number;
	}
	
	public int number() {
		return this.number;
	}
	
	public String dayOfWeek () {
		return switch (number) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thurday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "El número seleccionado está fuera del rango";
		};
	}
}
