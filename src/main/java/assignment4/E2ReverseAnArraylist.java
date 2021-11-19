package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class E2ReverseAnArraylist {
	
	public static void main(String[] args) {
		//2. Reverse an Arraylist.
		ArrayList<String> list = new ArrayList<String>(); 
		
		list.add("Samsung");
		list.add("Huawei");
		list.add("Apple");
		list.add("Xiaomi");
		list.add("Oppo");
		
		System.out.println("Array: " + list);
		
		Collections.reverse(list);
		
		System.out.println("Reversed Array: " + list);
	}

}
