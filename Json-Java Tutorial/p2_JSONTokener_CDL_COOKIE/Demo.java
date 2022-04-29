package p2_JSONTokener_CDL_COOKIE;

import org.json.CDL;
import org.json.Cookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Demo {

	public static void main(String[] args) throws JSONException {
		
		// similar to String.toCharArray(), so not used often
//		JSONTokener jt = new JSONTokener("Hello");
//
//		while (jt.more()) {
//			System.out.println(jt.next());
//		}
		
		
		//producing JSONArray from comma delimited text
//		JSONArray ja = CDL.rowToJSONArray(new JSONTokener("England, USA, Canada"));
//		System.out.println(ja);
//		
//		//Producing Comma Delimited Text From JSONArray
//		JSONArray ja1 = new JSONArray("[\"England\",\"USA\",\"Canada\"]");
//		String cdt = CDL.rowToString(ja1);
//		System.out.println(cdt);
//		
//		//Producing JSONArray of JSONObjects Using Comma Delimited Text
		String string = "name, city, age \n" +
				  "john, chicago, 22 \n" +
				  "gary, florida, 35 \n" +
				  "sal, vegas, 18";
//
//		JSONArray result = CDL.toJSONArray(string);
//		System.out.println(result);
//		
//		// Alternative method: Producing JSONArray of JSONObjects Using Comma Delimited Text
//		
		JSONArray ja = new JSONArray();
		ja.put("name");
		ja.put("city");
		ja.put("age");

		String string2 = "john, chicago, 22 \n"
		  + "gary, florida, 35 \n"
		  + "sal, vegas, 18";

		JSONArray result2 = CDL.toJSONArray(ja, string2);
		System.out.println(result2);
//		
//		//Converting a Cookie String into a JSONObject
		String cookie = "username=John Doe; expires=Thu, 18 Dec 2013 12:00:00 UTC; path=/";
		JSONObject cookieJO = Cookie.toJSONObject(cookie);
		System.out.println(cookieJO);
//		
//		//Converting a JSONObject into Cookie String
		String cookie2 = Cookie.toString(cookieJO);
		System.out.println(cookie2);
		
		
	}

}
