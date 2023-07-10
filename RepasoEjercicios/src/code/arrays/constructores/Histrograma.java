package code.arrays.constructores;

public class Histrograma {

	private int histo1;
	private int histo2;
	private int histo3;
	
	public Histrograma (int histo1, int histo2, int histo3) {
		this.histo1 = histo1;
		this.histo2 = histo2;
		this.histo3 = histo3;
	}
	
	public int histo1 () {
		return this.histo1;
	}
	
	public int histo2 () {
		return this.histo2;
	}
	
	public int histo3 () {
		return this.histo3;
	}
	
	public String histogram () {
		var array =new  int [] {histo1(), histo2(), histo3(),};
		var builder = new StringBuilder ();
		for (var i = 0; i < array.length; i++) {
			builder.append("*".repeat(array[i])).append(System.lineSeparator());
		}
		return builder.toString();
	}
}
