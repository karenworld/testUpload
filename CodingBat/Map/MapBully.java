package CodingBat.Map;

import java.util.HashMap;
import java.util.Map;

import CodingBat.Array2.fizzArray3;

public class MapBully {
	//Modify and return the given map as follows: 
	//if the key "a" has a value, set the key "b" to have that value, 
	//and set the key "a" to have the value "". 
	//Basically "b" is a bully, taking the value and replacing it with the empty string.

	//mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	//mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
	//mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

	public Map<String, String> mapBully(Map<String, String> map) {
	
		if(map.containsKey("a")) { 
		String tmp = map.get("a");
		map.put("a", " ");
		map.put("b", tmp);
		}
			return map;		  
	}
	
		
		public static void main(String[] args) {
			MapBully t = new MapBully();
			Map<String, String> testMap = new HashMap<>();
	        testMap.put("a", "candy");
	        testMap.put("b" , "dirt");
	        System.out.println(testMap);
	        System.out.println(t.mapBully(testMap));
			}
			}
