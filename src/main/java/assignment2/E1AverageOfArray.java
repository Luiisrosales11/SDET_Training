package assignment2;

public class E1AverageOfArray {

	public static void main(String[] args) {
		// 1. Java Program to Calculate average of numbers using Array
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		int average = 0;

		for(int number : numbers) {
			sum = sum + number;
		}
		average = sum / numbers.length;
		System.out.println("Average of numbers on the array is: " + average);

	}

}
