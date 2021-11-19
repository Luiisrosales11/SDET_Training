package assignment1;

public class E5PrimeNumbers {

	public static void main(String[] args) {
		// 5. Write a program to print the first 10 prime numbers. 
		int counter = 1;
        int startNum = 2;
         
        System.out.println("First 10 Prime Numbers :");
         
        while (counter <= 10) {   
            if (isNumberPrime(startNum)) {
                System.out.println(startNum);
                counter++;
                startNum++;
            }
            else {
            	startNum++;
            }
        }
		

	}

	
	static boolean isNumberPrime(int number) {
        boolean isItPrime = true;
         
        if(number <= 1) {
            isItPrime = false;
            return isItPrime;
        }
        else {
            for (int i = 2; i <= number / 2; i++) {
                if ((number % i) == 0){
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }
}
