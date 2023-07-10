package code.conditional.constructors;

public class CamelCase {
	
	private String sentence;
	
	public CamelCase (String sentence) {
		this.sentence = sentence;
	}
	
	public String sentence () {
		return this.sentence;
	}
	
	public String SnakeCaseToCamelCase () {
		var length = sentence().length();
		var builder = new StringBuilder ();
		for (var i=0; i < length ; i++) {
			if (sentence().charAt(i) == '_') {
				builder.append(Character.toUpperCase(sentence().charAt(i +=1)));
			}else {
				builder.append(sentence().charAt(i));
			}
		}
		return builder.toString();
	}
	
	public String camelCaseToSnakeCase () {
		var builder = new StringBuilder ();
		var length = sentence().length();
		for (var i= 0; i < length; i++) {
			if (i == 0) {
					builder.append(Character.toUpperCase(sentence().charAt(i)));
			}else {
				if (Character.isUpperCase(sentence().charAt(i))) {
					builder.append('_').append(Character.toLowerCase(sentence().charAt(i)));
				}else {
					builder.append(sentence().charAt(i));
				}
			}
		}
		return builder.toString();
	}

}
