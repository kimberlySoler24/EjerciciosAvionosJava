package kimberly.code.programacionBasica;

import java.util.Arrays;

public class Arreglos {

	//Write a function histogram(int[]), that takes an array of positive numbers, stats, 
	//and create a vertical histogram, a String which row i-th has a number of * equals to 
	//stats[i].

		public static String histogram (int [] array) {
			var builder = new StringBuilder ();
			for (var i= 0; i < array.length; i++) {
				builder.append("*".repeat(array[i])).append(System.lineSeparator());
			}
			return builder.toString();
		}
		
	//Write a function that given an int of arrays returns the max number in it.

		public static int max (int [] maxNumber) {
		    var order =Arrays.copyOf(maxNumber,  maxNumber.length);
		    Arrays.sort(order);
			return order[order.length - 1];
		}

	//Given an array of numbers ranging from 0 to 5, return an array of numbers with the 
	//info of how many of each digit were in the array. For example, say that you start 
	//from the array {0, 1, 2, 3, 2, 0, 5, 1, 2}, so there’s two 0’s, two 1’s, three 2’s, 
	//one 3, zero 4’s and one 5. Now treat the index of the array as a number in the array 
	//and put in that position how the count for that number, so the resulting array should 
	//be { 2, 2, 3, 1, 0, 1 }: there’s a 2 in position 0 because there were two 0’s in the 
	//original array, etc	
		
		public static int [] stats (int [] arrays) {
			var arraysResult =  new int [6];
			for (var i = 0; i < arraysResult.length; i++) {
				var count = 0;
				for(var j= 0; j < arrays.length; j++) {
					if (arrays[j] == i) {
						count += 1; 
					}
					arraysResult[i] = count;
				}
			}
			return arraysResult;
		}
		
		// Create a function that, given the dimensions of a matrix returns a matrix with each cell being a positive number in ascending order form
		//top to bottom, left to right starting with 1.
		
		public static String numericMatrix (int row, int col) {
			var builder = new StringBuilder ();
			var sum = 0;
			var result = new int [row] [col]; 
			for (var r=0; r < row; ++r) {
				for (var c = 0; c < col; ++c) {
					sum += 1;
					builder.append(Integer.toString(result [r][c] = sum));
				}
				builder.append(System.lineSeparator());
			}
			return builder.toString();
		}
		
		
		
		
		
}
