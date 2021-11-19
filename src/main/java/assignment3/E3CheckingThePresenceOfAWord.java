package assignment3;

public class E3CheckingThePresenceOfAWord {

	public static void main(String[] args) {
		// 3. Write a program to check “brown” is present in the string: A brown fox ran away fast
		String myString = "A brown fox ran away fast";
		
		String convertedString = myString.toLowerCase();
		
		if(checkTextIsPresent(convertedString)) {
			System.out.println("String: '" + myString +"' contains the word 'brown'");
		} else {
			System.out.println("String: '" + myString + "' does NOT contain the word 'brown'");
		}
	}
	
	static boolean checkTextIsPresent(String myString) {
		if(myString.contains("brown")) {
			return true;
		} else {
			return false;
		}
	}
}
