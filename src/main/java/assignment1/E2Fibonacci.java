package assignment1;

public class E2Fibonacci {

	public static void main(String[] args) {
		//2. Write a program to print fibonacci series (10 values)
		int num1 = 0, num2 = 1, num3 = 0, counter = 0, iterator = 10;

		while(counter < iterator) {
			System.out.println(num1);
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter++;
		}
	}

}
