package assignment4;

import java.util.HashMap;
import java.util.Map;

public class E3KeyExistinHashMap {

	public static void main(String[] args) {
		// 3. Check if a particular key exists in HashMap. 
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "Samsung");
		myMap.put(2, "Apple");
		myMap.put(3, "Huawei");
		
		int keyToSearch = 1;
		
		boolean isKeyPresent = myMap.containsKey(keyToSearch);
		
		String message = (isKeyPresent) ? "Key " + keyToSearch + " is present" : "Key " + keyToSearch + " is NOT present";
		System.out.println(message);
	}

}
