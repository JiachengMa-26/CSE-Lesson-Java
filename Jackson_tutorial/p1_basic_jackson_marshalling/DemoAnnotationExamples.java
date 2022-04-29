package p1_basic_jackson_marshalling;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class DemoAnnotationExamples {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		Car car = new Car("yellow", "renault");
		try {
			objectMapper.writeValue(new File("car.json"), car);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
