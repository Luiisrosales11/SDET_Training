package assignment4;

import java.util.TreeSet;

public class E6HighestAndLowestInTreeset {

	public static void main(String[] args) {
		// 6. Get highest and lowest value stored in TreeSet
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
	    tSet.add(10);
	    tSet.add(20);
	    tSet.add(4);
	    tSet.add(800);
	    tSet.add(42);
	    
	    System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());
	    
	    System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
	}

}
