package code.otrosEjercicios.objetos;

public class Format {
	
	private String phone;
	
	public Format (String phone) {
		this.phone = phone;
	}
	
	public String phone () {
		return this.phone;
	}

	
	private String formatted (String format) {
		var builder = new StringBuilder ();
		var phoneIndex = 0;
		for (var i = 0; i < format.length(); ++i) {
			var character = format.charAt(i);
			if (character != 'X') {
				builder.append(character);
			} else {
				var phoneDigit = phone.charAt(phoneIndex);
				builder.append(phoneDigit);
				phoneIndex++;
			}
		}
		return builder.toString();
	}
	
	public String formattedPhone () {		
		var firstFormat = "(XXX) XXX-XXXX";
		var secondFormat = "XXX-XXXX";
		return switch (phone.length()) {
		case 10 -> formatted (firstFormat);
		case 7 -> formatted (secondFormat);
		default -> phone;
		};
	}
	

}
