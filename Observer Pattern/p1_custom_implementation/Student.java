package p1_custom_implementation;

import java.util.ArrayList;

public class Student implements Observable {
	private String name;
	private double gpa;

	private ArrayList<Observer> observerList;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		observerList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
//		notifyObservers();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observerList.indexOf(o);
		observerList.remove(index);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observerList) {
			o.update(name, gpa);
		}
	}

	
}
