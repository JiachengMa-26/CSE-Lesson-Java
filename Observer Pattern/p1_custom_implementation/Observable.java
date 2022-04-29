package p1_custom_implementation;

public interface Observable {
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();

}
