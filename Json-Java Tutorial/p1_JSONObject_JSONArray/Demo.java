package p1_JSONObject_JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class Demo {

	public static void main(String[] args) {
		// creating JSON directly from JSONObject
//		JSONObject jo = new JSONObject();
//		jo.put("name", "jon doe");
//		jo.put("age", "22");
//		jo.put("city", "chicago");
//		jo.put("isRed", true);
//		jo.put("student", new Student("A"));
//		System.out.println(jo);
//		
//		
		// creating JSON from map
//		Map<String, String> map = new HashMap<>();
//		map.put("A", "AA");
//		map.put("B", "BB");
//		
//		JSONObject jo1 = new JSONObject(map);
//		System.out.println(jo1);
		
		// creating JSONObject from JSON string
//		JSONObject jo2 = new JSONObject(
//				  "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}"
//				);
//		
//		System.out.println(jo2);
//		System.out.println(jo2.getString("age"));
		
		// Serialize Java object to JSON
//		JSONObject jo3 = new JSONObject(new Student("A B"));
//		System.out.println(jo3);
		
		
		// creating JSON arrays: values can be anything from a Number, 
		// String, Boolean, JSONArray, or JSONObject to even a JSONObject.NULL object
//		JSONArray ja = new JSONArray();
//		ja.put(Boolean.TRUE);
//		ja.put("lorem ipsum");
//		ja.put(100);
//		ja.put(10.99);
////
//		JSONObject jo4 = new JSONObject();
//		jo4.put("name", "jon doe");
//		jo4.put("age", "22");
//		jo4.put("city", "chicago");
////
//		ja.put(jo4);
//		System.out.println(ja);
//		
//		// creating JSON Array directly from JSON String
//		JSONArray ja2 = new JSONArray("[true, \"lorem ipsum\", 215]");
//		System.out.println(ja2);
//		
//		// creating JSONArray directly from a collection or an array
		List<String> list = new ArrayList<>();
		list.add("NY");
		list.add("NJ");
		list.add("CT");
		JSONArray ja3 = new JSONArray(list);
		System.out.println(ja3);
//		
		
	}

}
