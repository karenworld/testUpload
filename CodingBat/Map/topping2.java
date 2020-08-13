package CodingBat.Map;

import java.util.HashMap;
import java.util.Map;

public class topping2 {
	//Given a map of food keys and their topping values, 
	//modify and return the map as follows: if the key "ice cream" has a value, 
	//set that as the value for the key "yogurt" also. If the key "spinach" has a value, 
	//change that value to "nuts".

		//	topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
		//	topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
		//	topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
		public Map<String, String> topping2(Map<String, String> map) {
		if((map.get("ice cream") != null)) {
			map.put("yogurt", map.get("ice cream"));
		if((map.get("spinach") != null)){
			map.put("spinach", "nuts");
		}
		}
		
		return map;
		  
	}
	
	public static void main(String[] args) {
		topping2 t = new topping2();
		Map<String, String> testMap = new HashMap<>();
	    testMap.put("ice cream", "cherry");
	    Map<String, String> testMap1 = new HashMap<>();
	    testMap1.put("spinach" , "dirt");
	    testMap1.put("ice cream", "cherry");
	    Map<String, String> testMap2 = new HashMap<>();
	    testMap2.put("yogurt", "salt");
	    //System.out.println(testMap);
	    System.out.println(t.topping2(testMap));
	    System.out.println(t.topping2(testMap1));
	    System.out.println(t.topping2(testMap2));
	}
		}



