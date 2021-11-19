package assignment1;

import java.util.Scanner;

public class E1FactorialOfNumber {

	public static void main(String[] args) {
		// 1. Write a program to calculate the factorial of a number using a while loop
		int number = 0, i = 1, result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		while (i <= number) {
			result *= i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + result);
	}

}
