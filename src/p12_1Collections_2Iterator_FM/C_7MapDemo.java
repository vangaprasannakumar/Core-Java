package p12_1Collections_2Iterator_FM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class C_7MapDemo {

	public static void main(String[] args) {
		
		System.out.println("HashMap :-");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Kavya");
		hm.put(109, "Sri");
		hm.put(124, "Lucku");
		hm.put(104, "Usha");
		hm.put(106, "Harsha");
		hm.put(124, "Kanna");
		System.out.println(hm+"\n");
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		System.out.println("»»»»» Iterator «««««");
		while(i.hasNext()) {
			Entry<Integer, String> e = (Entry<Integer, String>) i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		System.out.println("\n"+"LinkedHashMap :-");
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(101, "Kavya");
		lhm.put(109, "Sri");
		lhm.put(124, "Lucku");
		lhm.put(104, "Usha");
		lhm.put(106, "Harsha");
		lhm.put(124, "Kanna");
		System.out.println(lhm+"\n");
		System.out.println("»»»»» ForEach Loop «««««");
		for(Map.Entry<Integer, String> mp : lhm.entrySet()) {
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
		
		System.out.println("\n"+"TreeMap :-");
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(101, "Kavya");
		tm.put(109, "Sri");
		tm.put(124, "Lucku");
		tm.put(104, "Usha");
		tm.put(106, "Harsha");
		tm.put(124, "Kanna");
		System.out.println(tm+"\n");
		System.out.println("»»»»» ForEach Method «««««");
		tm.forEach((key, value) ->System.out.println(key+"   "+value));
	}
}