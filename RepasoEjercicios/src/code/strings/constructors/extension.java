package code.strings.constructors;

public class extension {
	private String link;
	
	public extension (String link) {
		this.link = link;
	}
	
	public String link () {
		return this.link;
	}
	
	public String Extension () {
		var lastDot = this.link.lastIndexOf('.');
		return lastDot != -1 ? this.link.substring(lastDot + 1) : " ";
	}
}
