package code.loops.constructors;

public class CountWords {
	
	private String word; 
	private String find;
	
	public CountWords (String word, String find) {
		this.word = word;
		this.find = find;
	}
	
	public String word () {
		return this.word;
	}
	
	public String find () {
		return this.find;
	}
	
	public int count () {		
		var count = 0;
		var thisFound = find();
		var last= word().indexOf(thisFound);
		while (last != -1) {
			count ++;
			last =this.word.indexOf(thisFound,  last + find().length() );
		}
		return count ;
	}
	
	public int countWords () {		
	
		return count () + 1 ;
	}
	
	
	
	
}
