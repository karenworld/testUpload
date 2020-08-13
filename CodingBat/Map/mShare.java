package CodingBat.Map;

import java.util.HashMap;
import java.util.Map;

public class mShare {
	//Modify and return the given map as follows: if the key "a" has a value, 
	//set the key "b" to have that same value. In all cases remove the key "c", 
	//leaving the rest of the map unchanged.

		//mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
		//mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
		//mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	
	
	public Map<String, String> mapShare(Map<String, String> map) {
		if(map.get("a") != null) {
		String tmp = map.get("a");
		String tmp1 = map.get("c");
		map.put("b", map.get("a"));
		} while(map.remove("c") != null);
		return map;
	}
	
	public static void main(String[] args) {
		mShare t = new mShare();
		Map<String, String> testMap = new HashMap<>();
	    testMap.put("a", "aaa");
	    testMap.put("b" , "bbb");
	    Map<String, String> testMap1 = new HashMap<>();
	    testMap1.put("b", "xyz");
	    testMap1.put("c", "ccc");
	    Map<String, String> testMap2 = new HashMap<>();
	    testMap2.put("a", "aaa");
	    testMap2.put("c", "meh");
	    testMap2.put("d", "hi");
	    //System.out.println(testMap);
	    System.out.println(t.mapShare(testMap));
	    System.out.println(t.mapShare(testMap1));
	    System.out.println(t.mapShare(testMap2));
	}
		}


