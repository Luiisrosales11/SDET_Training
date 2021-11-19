package assignment1;

import java.util.Arrays;

public class E3ArrayAscendingOrder {

	public static void main(String[] args) {
		// 3. Write a program to sort the elements of an array in ascending order. 
		int[] numArray = {5,1,40,31,20,0};
		System.out.println("without order : " + Arrays.toString(numArray));
		
		Arrays.sort(numArray);
		System.out.println("Ordered array: " + Arrays.toString(numArray));

	}

}
