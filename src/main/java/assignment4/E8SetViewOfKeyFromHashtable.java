package assignment4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class E8SetViewOfKeyFromHashtable {

	public static void main(String[] args) {
		// 8. Get Set view of keys from HashTable.
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("1", "Samsung");
		ht.put("2", "Huawei");
		ht.put("3", "Apple");
		
		Set st = ht.keySet();
		
		Iterator it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
