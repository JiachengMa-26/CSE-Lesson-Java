package p3_api_new;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StudentObserver implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println(evt.getOldValue());
		System.out.println(evt.getNewValue());
		System.out.println(evt.getPropertyName());
		System.out.println(evt.getSource());
		System.out.println(evt.toString());
	}

}
