package assignment3;

import java.util.Scanner;

public class E2IsItPalindrome {

	public static void main(String[] args) {
		// 2. Write a program to check if a given string is a palindrome or not.
		Scanner sc = new Scanner(System.in);
		String word = "";
		System.out.println("Enter a word to validate if is Palindrome");
		word = sc.nextLine();
		isItPalindrome(word);

	}
	
	static void isItPalindrome(String word) {
		char[] charac = word.toCharArray();
		String reverseWord = "";
		
		for(int i= charac.length - 1;i>=0 ; i-- ) {
			reverseWord += word.charAt(i);
		}
		
		if (reverseWord.equals(word)) {
			System.out.println(word + " is Palindrome");
		}
		else
			System.out.println(word + " is not Palindrome");
	}
}
