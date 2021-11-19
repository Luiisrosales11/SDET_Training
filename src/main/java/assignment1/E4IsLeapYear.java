package assignment1;

import java.util.Scanner;

public class E4IsLeapYear {

	public static void main(String[] args) {
		// 4. Write a program to check whether the current year is leap year or not. Users will enter a year value. 
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		year = sc.nextInt();
		sc.close();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year");
				} else {
					System.out.println(year + " is not a leap year");
				}
			} else {
				System.out.println(year + " is not a leap year");
			}
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
