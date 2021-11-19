package assignment2;

public class E3Is13APrimeNumber {
	public static void main(String[] args) {
		//3. Is 13 a prime number? 
		int number = 13;
		if (isItPrime(number)) {
	        System.out.println("Number " + number + " is a prime number.");
	    } else {
	    	System.out.println("Number " + number + " is NOT a prime number.");
	    }
		
	}
	
	public static boolean isItPrime(int n) {
        
	    // Base cases
	    for (int i = 2; i <= n; i++) {
	    	if (n % i == 0) {
		        return false;
		    } else {
		    	return true;
		    }
	    }
	    return isItPrime(n);
	}
}
