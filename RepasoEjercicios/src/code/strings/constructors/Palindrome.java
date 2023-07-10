package code.strings.constructors;

public class Palindrome {
	
	private String word;
	
	public Palindrome (String word) {
		this.word = word;
	}
	
	public String word () {
		return this.word;
	}
	
	public boolean isPalindrome () {
		var lowerCase = this.word.toLowerCase();
		for (var index = lowerCase.length() - 1; index >= 0; index--) {
			if (lowerCase.charAt(index) == lowerCase.charAt(index -= 1) ) {
				return true;
			}
		}
		return false;
	}

}
