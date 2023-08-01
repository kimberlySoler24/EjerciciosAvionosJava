package kimberly.code.programacionBasica;

public class RepasoEjerciciosDificiles {
	
	public static int count(String word, String found) {
		var length = found.length();
		var foundWord = word.indexOf(found);
		var count = 0;
		while (foundWord != -1) {
			count++;
			foundWord = word.indexOf(found, foundWord + length);
		}
		return count;
	}
	
	public static String snakeCaseToCamelCase(String word) {
		var builder = new StringBuilder();
		for (int index = 0; index < word.length(); index++) {
			var camelCase = word.charAt(index);
			if (Character.isUpperCase(camelCase)) {
				builder.append('_').append(Character.toLowerCase(camelCase));
			}else {
				builder.append(camelCase);
			}					
		}
		return builder.toString();
	}

	public static String camelCaseToSnakeCase(String word) {
		var builder = new StringBuilder();
		var upperCase = false;
		for (int i = 0; i < word.length(); i++) {
			var snakeCase = word.charAt(i);
			if(snakeCase == '_') {
				upperCase = true;
			}else {
				if(upperCase) {
					builder.append(Character.toUpperCase(snakeCase));
					upperCase = false;
				}else {
					builder.append(snakeCase);
				}
			}
		}
		return builder.toString();
	}
	
	public static String changeLanguage(String link, String language) {
		var builder = new StringBuilder();
		var firstSlash = link.indexOf('/');
		var count = 0;
		while (firstSlash != -1) {
			count++;
			firstSlash = link.indexOf('/', firstSlash + 1);
			if (count == 2) {
				builder.append(link.substring(0, firstSlash + 1)).append(language).
				append(link.substring(firstSlash + 3));
			} 
		}		
		return builder.toString();
	}
	
	private static final int SECONDS_IN_A_MINUTE = 60;
	private static final int MINUTES_IN_A_HOUR = 60;
	private static final int SECONDS_IN_A_HOUR = SECONDS_IN_A_MINUTE * MINUTES_IN_A_HOUR;
	
	public static int timeToSeconds (String date) {
		var foundT = date.indexOf("T");
			var time = foundT != -1 ? date.substring(foundT + 1) : date;
			var firstPoint = time.indexOf(":");
			var secondPoint = time.indexOf(":", firstPoint + 1);
			var hour = Integer.parseInt(time.substring(0, firstPoint));
			var minutes = Integer.parseInt(time.substring(firstPoint + 1, secondPoint));
			var seconds = Integer.parseInt(time.substring(secondPoint + 1));
		return  hour*SECONDS_IN_A_HOUR + minutes*MINUTES_IN_A_HOUR + seconds;
	}
	
	
	public static String format(String format, String phone) {
		var builder = new StringBuilder();
		var indexPhone = 0;
		for (var i= 0; i < format.length(); i++) {
			var charFormat = format.charAt(i);
			if(charFormat != 'X') {
				builder.append(charFormat);
			}else {
				var charPhone = phone.charAt(indexPhone);
				builder.append(charPhone);
				indexPhone++;
			}
		}
		return builder.toString();	
	}
	
	
	public static String formattedPhone(String phone) {
		return switch (phone.length()){
		case 7 -> format("XXX-XXXX", phone);
		case 10 -> format("(XXX) XXX-XXXX", phone);
		default -> phone;
		};
	}
	
}
