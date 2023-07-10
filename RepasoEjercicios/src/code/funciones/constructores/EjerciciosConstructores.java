package code.funciones.constructores;

public class EjerciciosConstructores {
	
	//atributos
	private String mood;
	private String color;
	private String animal;
	
	//constructores
	
	public EjerciciosConstructores (String mood, String color, String animal){
		this.mood = mood;
		this.color = color;
		this.animal = animal;
	}
	
	//métodos accesores
	
	public String mood () {
		return this.mood;
	}
	
	public String color () {
		return this.color;
	}
	
	public String animal () {
		return this.animal;
	}
	
	/**
	 * Este método permite mostrar una oración requerida de acuerdo al estado de ánimo, color 
	 * y animal requerido
	 * @param word es el parámetro que va a tener en cuenta los constructores donde contienen 
	 * la información de las tres variables requeridas
	 * @return retorna la oración
	 */
	
	public String sentenceMaker () {
		return String.format("The %s %s fox jumps over the lazy %s ",this.mood(), this.color(), this.animal());
	}
	
	
	
	
	
	
	
	
	
	
}
