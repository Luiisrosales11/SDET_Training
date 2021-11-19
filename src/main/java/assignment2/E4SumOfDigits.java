package assignment2;

public class E4SumOfDigits {

	public static void main(String[] args) {
		// 4. Find the sum of digits 
		int num = 1234;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits is: " + sum);

	}

}
