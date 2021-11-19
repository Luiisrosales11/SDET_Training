package assignment3;

import java.util.Scanner;
//4. Write a program to convert String to a character array and character array to String.
public class E4ConversionStringCharArrays {

	public static void main(String[] args) {
		 
		String myString = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		myString = sc.next();
		
		//Converting string to char array
		char[] myCharArray = myString.toCharArray();
		
		System.out.println("String '" + myString + "' converted to char array: ");
		for(char c : myCharArray) {
			System.out.println(c);
		}
		
		//Re-converting char array to string
		String stringAgain = new String(myCharArray);
		System.out.println("Char array re-converted to string: " + stringAgain);
	}

}
