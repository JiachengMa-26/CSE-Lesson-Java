package jackson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {
	public static void main(String[] args) {
		// inline will store the JSON data streamed in string format
		String inline = "";

		try {
			// URL url = new
			// URL("http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221&key=your_own_key");
			// URL url = new
			// URL("https://maps.googleapis.com/maps/api/geocode/json?key=your_own_key&address=chicago&sensor=false&#8221");
			URL url = new URL(
					"https://api.data.gov/ed/collegescorecard/v1/schools.json?school.degrees_awarded.predominant=2&_fields=id,school.name&_zip=11790&_distance=30mi&api_key=I1fvJ8xYBCFkAwcWuVBkgT9Bzjj6UFqrMmZ1foDP");

			// https://api.data.gov/ed/collegescorecard/v1/schools.json?school.degrees_awarded.predominant=2,3,4&_fields=id,school.name,latest.admissions.sat_scores.25th_percentile.critical_reading,latest.admissions.sat_scores.75th_percentile.critical_reading&_zip=11790&_distance=20mi&api_key=your_own_key

			// Parse URL into HttpURLConnection in order to open the connection to
			// get the JSON data
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// Set the request to GET or POST as per the requirements
			conn.setRequestMethod("GET");
			// Use the connect method to create the connection bridge
			conn.connect();
			// Get the response status of the Rest API
			int responsecode = conn.getResponseCode();
			 System.out.println("Response code is: " +responsecode);

			// Iterating condition to if response code is not 200 then throw a runtime
			// exception
			// else continue the actual process of getting the JSON data
			if (responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " + responsecode);
			else {
				// Scanner functionality will read the JSON data from the stream
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				// System.out.println("\nJSON Response in String format");
//				System.out.println(inline);
				// Close the stream when reading the data has been finished
				sc.close();
			}
			ObjectMapper objectMapper = new ObjectMapper();

			JsonNode node = objectMapper.readValue(inline, JsonNode.class);
//			//
			JsonNode array = node.get("results");
			for (int i = 0; i < array.size(); i++) {
				JsonNode jsonNameNode = array.get(i);
				System.out.println("-----");
				JsonNode nameNode = jsonNameNode.get("school.name");
				System.out.println(nameNode.asText());
				JsonNode schoolIDNode = jsonNameNode.get("id");
				System.out.println(schoolIDNode.asText());
			}

			JsonNode child = node.get("metadata");
			JsonNode totalField = child.get("total");
			String total = totalField.asText();
			System.out.println("total = " + total);
			JsonNode pageField = child.get("page");
			String page = pageField.asText();
			System.out.println("page = " + page);
			JsonNode per_pageField = child.get("per_page");
			String per_page = per_pageField.asText();
			System.out.println("per_page=" + per_page);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
}
