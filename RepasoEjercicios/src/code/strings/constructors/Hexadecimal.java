package code.strings.constructors;

public class Hexadecimal {
	private int num1;
	private int num2;
	private int num3;
	
	public Hexadecimal (int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public int num1 () {
		return this.num1;
	}
	
	public int num2 () {
		return this.num2;
	}
	
	public int num3 () {
		return this.num3;
	}
	
	public String hexString () {
		var firstHex = Integer.toHexString(num1);
		var secondHex = Integer.toHexString(num2);
		var thirdHex = Integer.toHexString(num3);
		
		var complement1 = firstHex.length() < 2 ? '0' + firstHex : firstHex;
		var complement2 = secondHex.length() < 2 ? '0' + secondHex : secondHex;
		var complement3 = thirdHex.length() < 2 ? '0' + thirdHex : thirdHex;
		var result = complement1 + complement2 + complement3;
		return result.toUpperCase();
	}
}
