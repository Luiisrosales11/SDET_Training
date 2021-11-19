package assignment2;

public class E6DuplicatesInAArray {

	public static void main(String[] args) {
		// 6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
		Integer[] numbers = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		for (int i = 0; i < numbers.length; i++) { 
			for (int j = i + 1 ; j < numbers.length; j++) { 
				if (numbers[i].equals(numbers[j])) {
				
					System.out.println("This number is duplicated: " + numbers[j]); 
				} 
			} 
		}
	}

}
