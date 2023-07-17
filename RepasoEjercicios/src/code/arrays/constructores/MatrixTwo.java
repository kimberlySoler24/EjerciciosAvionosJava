package code.arrays.constructores;


public class MatrixTwo {
	
	private int number;
	
	public  MatrixTwo (int number) {
		this.number = number;
	}
	
	public int number () {
		return number;
	}
	
	public String identify() {
		var builder = new StringBuilder ();
		var array = new int [number][number];
		for (int i = 0; i < number; i++) {
			builder.append("[");
			for (int j = 0; j < number; j++) {
				if (i == j) {
					builder.append(array[i][j] = 1);
				}else {
					builder.append(array[i][j] = 0);
				}
			}
			builder.append("]").append(System.lineSeparator());
		}
		return builder.toString();
	}
}
