package code.strings.constructors;

public class IsEllipsify {

	private String word;
	private int number;
	
	public IsEllipsify (String word, int number) {
		this.word = word;
		this.number = number;
	}
	
	public String word () {
		return this.word;
	}
	
	public int number () {
		return this.number;
	}
	
	public String ellipsify () {
		var words = this.word;
		var firstSpace = words.indexOf(' ');
		var secondSpace = words.indexOf(' ', firstSpace + 1);
		return this.number <= 4 ? String.format("%s...", words.substring(0, firstSpace))
			   : this.number > 4 && this.number <= 7 
			   ? String.format("%s...", words.substring(0, secondSpace))
			   : words;
	}
}
