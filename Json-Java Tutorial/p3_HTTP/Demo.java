package p3_HTTP;

import org.json.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

public class Demo {
	//The HTTP class contains static methods that are used to convert HTTP headers 
	// to JSONObject and vice versa.

	// This class also has two main methods:
		// toJsonObject(String sourceHttpHeader) – converts a HttpHeader String 
		// to JSONObject
		// toString(JSONObject jo) – converts the supplied JSONObject to String

	public static void main(String[] args) throws JSONException {
		// Converting JSONObject to HTTP Header
		// Note that while converting an HTTP request header, the JSONObject must 
		// contain “Method”, “Request-URI” and “HTTP-Version” keys. And for response 
		// header, the object must contain “HTTP-Version”, “Status-Code” 
		// and “Reason-Phrase” parameters.
		JSONObject jo = new JSONObject();
		jo.put("Method", "POST");
		jo.put("Request-URI", "http://www.example.com/");
		jo.put("HTTP-Version", "HTTP/1.1");
		String httpStr = HTTP.toString(jo);
		System.out.println(httpStr);
		
		
		// Converting HTTP Header String Back to JSONObject
		JSONObject obj = HTTP.toJSONObject("POST \"http://www.example.com/\" HTTP/1.1");
		System.out.println(obj);
	}

}
