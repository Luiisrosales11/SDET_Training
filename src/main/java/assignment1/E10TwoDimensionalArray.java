package assignment1;

public class E10TwoDimensionalArray {

	public static void main(String[] args) {
		// 10. Write a program to print this output using a two-dimensional array.
		int matrix[][] = new int[10][10];
        for(int i = 0; i < 10; i++)
        {
        	for(int j = 0; j < i+1; j++)
        	{
        		matrix [i][j] = 0;
        	}
        }
        
        
        for(int a = 0; a <10; a++) {
			for(int b = 0; b < a+1; b++) {
				System.out.print(matrix[a][b]);
			}
			System.out.println();
		}

	}

}
