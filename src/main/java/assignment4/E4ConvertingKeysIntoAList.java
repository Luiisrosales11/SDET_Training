package assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E4ConvertingKeysIntoAList {

	public static void main(String[] args) {
		// 4. Convert keys of a map to a list. 
		Map<Integer, String> langMap = new HashMap<Integer, String>();
		
		langMap.put(1, "Selenium");
		langMap.put(2, "Selenide");
		langMap.put(3, "Cypress");
		
		ArrayList<Integer> keysList = new ArrayList<Integer>(langMap.keySet());
		System.out.println("List of keys: " + keysList);

	}

}
