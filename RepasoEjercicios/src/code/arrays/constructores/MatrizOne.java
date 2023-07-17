package code.arrays.constructores;

public class MatrizOne {
	
	private int rows;
	private int cols;
	
	public MatrizOne (int rows, int cols){
		this.rows = rows;
		this.cols = cols;
	}
	
	public int rows () {
		return this.rows;
	}
	
	public int cols () {
		return this.cols;
	}
	
	public String numericMatrix () {
		var builder = new StringBuilder();
		var array = new int [rows][cols];
		var count = 0;
		for (int r = 0; r < rows; r++) {
			builder.append('[');
			for (int c = 0; c < cols; c++) {
				count++;
				builder.append(array[r][c]= count);
			}
			builder.append(']');
		}
		return builder.toString();
	}

}
