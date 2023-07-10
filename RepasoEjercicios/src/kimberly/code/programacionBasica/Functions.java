package kimberly.code.programacionBasica;

public class Functions {
	
	//The method errorCode1() is undefined for the type Functions

	public static String errorCode1() {
		return "Where's my error?";
	}
	
	//Syntax error insert "}" to complete ClassBody, el error está en no definir el tipo de dato del parámetro who que está definido en la función.
	public static String anotherError(String who){ 
		return String.format("%s, what´s the error?", who);
	}
	
	//Syntax error, insert ";" to complete BlockStatements
	public static String commonError() {
		return "This is a subtle error";
		}
	
	//insert "AssignmentOperator Expression" to complete Expression
	//The left-hand side of an assignment must be a variable, 
	//el error está en que hace falta returnar el valor que se desea mostrar en la función evaluada.
	
	public static String somethingMissing() {
		return "This is a little less subtle";
	}
	
	//Presenta error por espacion en el nombre de la función my greeting
	
	public static String myGreeting() {
		return "Hello Error!";
	}
	
	//Hace falta completar bien el método String.format.
	public static String trickyError(String who) {
		return String.format("A little tricky isn't %s?", who);
	}

	//Hace falta el método String.format y definir el parámetro de la función
	public static String amIMissingSomething(String who) {
		return String.format("A little tricky isn't %s?", who);
		}
	
	//Exercise create function
	public static String sentenceMaker(String mood, String color, String animal) {
		return String.format("The %s %s for jumps over the lazy %s",mood, color, animal );
	}
	
	public static String pangram () {
		return sentenceMaker("quick", "brown", "fox");
	}
	
}
