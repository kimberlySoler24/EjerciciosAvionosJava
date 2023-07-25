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
	
}
