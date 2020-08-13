package CodingBat.Map;

import java.util.HashMap;
import java.util.Map;

public class topping1 {
	//Given a map of food keys and topping values, modify and return the map as follows: 
	//if the key "ice cream" is present, set its value to "cherry". 
	//In all cases, set the key "bread" to have the value "butter".

	//	topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
	//	topping1({}) → {"bread": "butter"}
	//	topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
	public Map<String, String> topping1(Map<String, String> map) {
		if(map.containsKey("ice cream"))
				map.put("ice cream", "cheery");	
		while(map.put("bread", "butter") != null);
		return map;
		  
	}
	
	public static void main(String[] args) {
		topping1 t = new topping1();
		Map<String, String> testMap = new HashMap<>();
	    testMap.put("ice cream", "peanuts");
	    Map<String, String> testMap1 = new HashMap<>();
	    testMap1.put(" ", " ");	  
	    Map<String, String> testMap2 = new HashMap<>();
	    testMap2.put("pancake", "syrup");
	    
	    //System.out.println(testMap);
	    System.out.println(t.topping1(testMap));
	    System.out.println(t.topping1(testMap1));
	    System.out.println(t.topping1(testMap2));
	}
		}



