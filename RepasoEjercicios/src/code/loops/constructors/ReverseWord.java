package code.loops.constructors;

public class ReverseWord {

	private String word;
	
	public ReverseWord (String word) {
		this.word = word;
	}
	
	public String word () {
		return this.word;
	}
	
	public String reverse () {
		var wordIs = this.word;
		var builder = new StringBuilder();
		 for (var index = wordIs.length() -1 ; index >= 0 ; index--) {
			 builder.append(wordIs.charAt(index));
		 }
		 return builder.toString();
	}
	
	
	
	
	
	
}
