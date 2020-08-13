package CodingBat.Map;

import java.util.HashMap;
import java.util.Map;

public class mapAB {
	//Modify and return the given map as follows: 
	//for this problem the map may or may not contain the "a" and "b" keys.  
	//If both keys are present, append their 2 string values together and store the result under the key "ab". [THIS PART IS THE KEY !!!]

		//	mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
		//	mapAB({"a": "Hi"}) → {"a": "Hi"}
		//	mapAB({"b": "There"}) → {"b": "There"}

public Map<String, String> mapAB(Map<String, String> map) {

	//	if(map.containsKey("a") || map.containsKey("b") || !(map.containsKey("a") || !(map.containsKey("b"))))  { 
	if (map.containsKey("a") && map.containsKey("b")) {
	//String tmp = map.get("a");
	//String tmp2 = map.get("b");
		//map.put("a" ,  "ab" + map.get("a")  +  map.get("a")+ map.get("b"));	
	//store the result under the key "ab" hence putting "ab" in the first position
	map.put("ab", map.get("a")  + map.get("b"));
	}
	return map;
	}

//	if (map.containsKey("a") && map.containsKey("b"))
//        map.put("ab",map.get("a")+map.get("b"));
//	return map;
//}
	
public static void main(String[] args) {
	mapAB t = new mapAB();
	Map<String, String> testMap = new HashMap<>();
    testMap.put("a", "Hi");
    testMap.put("b" , "There");
    Map<String, String> testMap1 = new HashMap<>();
    testMap1.put("a", "Hi");
    Map<String, String> testMap2 = new HashMap<>();
    testMap2.put("b", "There");
    System.out.println(testMap);
    System.out.println(t.mapAB(testMap));
    System.out.println(t.mapAB(testMap2));
}
	}

