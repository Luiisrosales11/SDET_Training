package assignment1;

import java.util.Scanner;

public class E6TriangleArea {

	public static void main(String[] args) {
		// 6. Write a program to calculate the area of a triangle. Users will enter the values for base and height of the triangle. 
		
		double base = 0.0, height = 0.0, area = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traingle base: ");
		base = sc.nextDouble();
		System.out.println("Enter traingle height: ");
		height = sc.nextDouble();
		area = calculateTriangleArea(base, height);
		System.out.println("Area of the triangle is: " + area);

	}
	static double calculateTriangleArea(double base, double height) {
		return (base * height) / 2;
	}

}
