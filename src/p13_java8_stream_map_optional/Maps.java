package p13_java8_stream_map_optional;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>(); 
        map.put("A", 1); 
        map.put("B", 2); 
        map.put("C", 3); 
        map.put("D", 4); 
          
        //1. Iterate through a map 
        System.out.println("1. Iterate through a map:"); 
        map.forEach((key,value)->System.out.println("Key = "
              + key + ", Value = " + value)); 
          
        //2. Iterate through a map.entrySet() using simple for-each loop 
        System.out.println("2. Iterate through a map.entrySet() using simple for-each loop:"); 
        for (Map.Entry<String,Integer> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
              
        //3. Iterate through a map.entrySet() using iterator 
        System.out.println("3. Iterate through a map.entrySet() using iterator:"); 
        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator(); 
        while (itr.hasNext()) { 
            Map.Entry<String,Integer> entry = itr.next(); 
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
        } 
          
        //4. Iterate through a map.entrySet() using for-each loop and lambda expression 
        System.out.println("4. Iterate through a map.entrySet() using for-each loop and lambda expression:"); 
        map.forEach((key,value)->System.out.println("Key = "
              + key + ", Value = " + value)); 
              
        //5. Iterate through a map using key 
        System.out.println("5. Iterate through a map using key:"); 
        for(String key: map.keySet()) 
            System.out.println("Key = " + key); 
              
        //6. Iterate through a map using value 
        System.out.println("6. Iterate through a map using value:"); 
        for(int value: map.values()) 
            System.out.println("Value = " + value); 
              
        //7. Iterate through a map using key and value 
        System.out.println("7. Iterate through a map using key and value:"); 
        for(String key: map.keySet()) { 
            System.out.println("Key	= " + key); 
            System.out.println("Value	= " + map.get(key)); 
        } 
		
		
		
		
//		 Scanner in = new Scanner(System.in); 
//	        int n = in.nextInt(); 
//	        in.nextLine(); 
//	        Map<String, Integer> map = new HashMap<>(); 
//	        for (int i = 0; i < n; i++) 
//	        { 
//	            String name = in.nextLine(); 
//	            int score = in.nextInt(); 
//	            map.put(name, score); 
//	            in.nextLine(); 
//	        } 
//	        System.out.println("Enter the name to find score : "); 
//	        String queryName = in.nextLine(); 
//
//	        int queryScore = map.getOrDefault(queryName, -1); 
//	        System.out.println("Score of " + queryName + " : " + queryScore); 
//	        System.out.println("Enter the minimum score : "); 
//	        int min = in.nextInt(); 
//	        System.out.println("Enter the maximum score : "); 
//	        int max = in.nextInt(); 
//
//	        // Stream filter method 
//	        Map<String, Integer> result = map.entrySet().stream().filter(x -> x.getValue() >= min && x.getValue() <= max).collect(toMap(x -> x.getKey(), x -> x.getValue())); 
//
//	        System.out.println("Result : " + result); 
	}

}