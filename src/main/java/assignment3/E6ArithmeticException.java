package assignment3;

import java.util.Scanner;

public class E6ArithmeticException {

	public static void main(String[] args) {
		// 6. Write a program where a method declares that it throws ArithmeticException.
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        sc.close();
        try {
           int result=add(num1,num2);
           System.out.println("Result is : "+result);
        } catch(Exception e) {
            e.printStackTrace();
        }

	}
	
	static int add(int num1, int num2) {
		if (num1 > 100)
		{
			// throw is followed by an instance
			throw new ArithmeticException("Num 1 is greater than 100 and hence Exception is thrown");
		}
	       return num1+num2;
	    }
}
