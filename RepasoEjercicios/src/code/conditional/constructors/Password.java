package code.conditional.constructors;

public class Password {
	
	private String pass;
	
	public Password (String pass) {
		this.pass = pass;
	}
	
	public String pass () {
		return this.pass;
	}
	
	public boolean isStringPassword () {
		var countUpperCase = 0;
		var countDigit = 0;
		var countNonAlpha = 0;
		for (var i = 0; i < pass().length(); i++) {
			if(Character.isUpperCase(pass().charAt(i))){
				countUpperCase ++;
			}
			if(Character.isDigit(pass().charAt(i))){
				countDigit ++;
				}
			if(!Character.isDigit(pass().charAt(i)) && !Character.isAlphabetic(pass().charAt(i))){
				countNonAlpha ++;
			}
		}
		return pass().length() == 8 && countUpperCase > 0 && countDigit >0 && countNonAlpha > 0;
	}

}
