package code.strings.constructors;

public class Email {
	
	private String correo;
	
	public Email (String correo) {
		this.correo = correo;
	}
	
	public String correo () {
		return this.correo;
	}
	
	public boolean isValidEmail () {
		var email = correo;
		var countAt = 0;
		var countDot = 0;
		for (var i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				countAt += 1;
			}
		}
		
		for (var j= email.indexOf('@'); j < email.length(); j++) {
			if (email.charAt(j) == '.') {
				countDot += 1;
			}
		}
		
		var positionAt = email.indexOf('@');
		
		return email.charAt(0) != '@' && countAt == 1 
				   && countDot == 1 && email.charAt(email.length() - 1) != '.'
				   && positionAt + 1 != email.indexOf('.', positionAt + 1); 
	}

}
