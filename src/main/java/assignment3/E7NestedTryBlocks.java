package assignment3;

public class E7NestedTryBlocks {

	public static void main(String[] args) {
		// 7. Write a program with nested try blocks. 
		try{
	        try{     
	            try{
	            	int arr[]= {10,20,30,40};
	            	System.out.println(arr[100]);
	            }catch(ArithmeticException e){
	            	System.out.print("Arithmetic Exception");
	            	System.out.println(" handled in try-block3 " + e);
	            }
	        }
	        catch(ArithmeticException e){
	           System.out.print("Arithmetic Exception");
	           System.out.println(" handled in try-block2" + e);
	        }
	    }
	    catch(ArithmeticException e){
	    	System.out.print("Arithmetic Exception");
	     	System.out.println(" handled in main try-block" + e);
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block" + e);
	    }
	    catch(Exception e){
	    	System.out.print("Exception");
	     	System.out.println(" handled in main try-block" + e);
	     }

	}

}
