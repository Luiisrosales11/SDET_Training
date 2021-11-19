package assignment3;

import java.util.Scanner;

public class E5NumberFormatException {

	public static void main(String[] args) {
		// 5. Write a program to throw NumberFormatException and handle it appropriately with a proper message.
		try {
			int Number = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number: ");
			Number = Integer.parseInt(sc.next());
			
		} catch (NumberFormatException nfe) {
			System.out.println("This is not a number " + nfe);
		}

	}

}
