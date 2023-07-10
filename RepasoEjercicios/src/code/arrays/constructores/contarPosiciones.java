package code.arrays.constructores;

public class contarPosiciones {
	
	private int array [];
	
	public contarPosiciones (int array []){
		this.array = array ;
	}
	
	public int [] array (){
		return this.array;
	}
	
	public int [] stats () {
		var result = new int [6] ;
		for (var i =0; i < result.length; i++) {
			var count = 0;
			for (var j =0; j < array().length; j++) {
				if (i == array()[j]) {
					count++;
				}
			}
			result[i] = count; 
		}
		return result;
	}
}
