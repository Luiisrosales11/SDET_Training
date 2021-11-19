package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class E7SortArraylistAlphabetically {

	public static void main(String[] args) {
		// 7. Sort ArrayList of Strings alphabetically. 
		ArrayList<String> myArrList = new ArrayList<>();
		
		myArrList.add("Television");
		myArrList.add("Radio");
		myArrList.add("Phone");
		myArrList.add("Tablet");
		myArrList.add("Printer");
		
		System.out.println("ArrayList: " + myArrList);
		
		Collections.sort(myArrList);
		System.out.println("Sorted arrayList: " + myArrList);

	}

}
