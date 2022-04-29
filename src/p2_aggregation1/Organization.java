package p2_aggregation1;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	private List<Person> employees;
	
	public Organization() {
		employees = new ArrayList<>();
	}
	
	public void add(Person person) {
		employees.add(person);
	}
}
