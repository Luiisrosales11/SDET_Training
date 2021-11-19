package assignment1;

public class E9EvenNumbers {

	public static void main(String[] args) {
		// 9. Write a program to print only even numbers till 50. 
		int counter = 1, i = 1;
		
		System.out.println("Even numbers");
		while(counter <= 50) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			counter++;
			i++;
		}

	}

}
