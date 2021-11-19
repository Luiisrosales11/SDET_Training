package assignment3;

public class E1OccurrenceOfCharacters {
	// 1. Write a program to print the occurrence of each character in the String 
	public static void main(String[] args) {
		
		String myString = "occurrence";
        getOccuringChar(myString);
	}
	
	static void getOccuringChar(String myString)
    {
		final int MAX_CHAR = 256;
 
        int count[] = new int[MAX_CHAR];
 
        int len = myString.length();
 
        for (int i = 0; i < len; i++)
            count[myString.charAt(i)]++;
 
        char ch[] = new char[myString.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = myString.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                if (myString.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println("Number of Occurrence of " + myString.charAt(i) + " is:" + count[myString.charAt(i)]);
        }
    }

}
