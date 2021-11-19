package assignment4;

import java.util.HashSet;
import java.util.Set;

public class E5CopyHashSetToObjectArray {

	public static void main(String[] args) {
		// 5. Copy all elements of a HashSet to an Object array
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(30);
		hs.add(40);
		hs.add(60);
		hs.add(25);
		hs.add(15);
		
		System.out.println("Elements in hashset = " + hs);
	      
	    Object[] obArr = hs.toArray();
	    for (Object ob : obArr)
	    System.out.println(ob);
	}

}
