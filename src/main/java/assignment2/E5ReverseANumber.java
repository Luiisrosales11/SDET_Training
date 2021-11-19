package assignment2;

public class E5ReverseANumber {

	public static void main(String[] args) {
		// 5. Reverse a number 123 
		int num = 123;
        int reversed = 0;
        
        System.out.println("Number: " + num);

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed Number: " + reversed);
	}

}
