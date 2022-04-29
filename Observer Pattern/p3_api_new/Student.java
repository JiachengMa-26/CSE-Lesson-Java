package p3_api_new;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Student {
	private String name;
	private double gpa;
	
	private PropertyChangeSupport propertyChangeSupport;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		propertyChangeSupport.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		propertyChangeSupport.removePropertyChangeListener(pcl);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		propertyChangeSupport.firePropertyChange("GPA", this.gpa, gpa);
		this.gpa = gpa;
		
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + name + ", GPA=" + gpa + "]";
	}
	
}
