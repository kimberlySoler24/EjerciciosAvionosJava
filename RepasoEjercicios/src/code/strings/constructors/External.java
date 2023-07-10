package code.strings.constructors;

public class External {

	private String link;
	
	public External (String link) {
		this.link = link;
	}
	
	public String link () {
		return this.link;
	}
	
	public String isExternal () {
		var firstSlash = this.link.indexOf("/");
		var secondSlash = this.link.indexOf("/", firstSlash + 1);
		var thirdSlash = this.link.indexOf("/", secondSlash + 1);
		return thirdSlash != -1 ? 
				this.link.substring(secondSlash + 1, thirdSlash) 
			   :this.link.substring(secondSlash + 1);
			
	}
}
