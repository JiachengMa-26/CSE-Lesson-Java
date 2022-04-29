package p2_singleton;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <E> implements Serializable {
	private E[] arr;
	private int nElems;

//	public Bag(int maxSize) {
//		arr = (E[]) (new Object[maxSize]);
//		nElems = 0;
//	}
	
	public Bag(Class<E> clazz, int capacity) {
	    arr = (E[]) Array.newInstance(clazz, capacity);
	}
	
	public Bag(int maxSize) {
		arr = (E[]) new Object[maxSize];
	}

	public E[] search(Class<E> clazz, Predicate<E> predicate) {
		E[] temp = (E[]) Array.newInstance(clazz, nElems);
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public E[] remove(Class<E> clazz, Predicate<E> predicate) {
		E[] temp = (E[]) Array.newInstance(clazz, nElems);
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				temp[count++] = arr[i];
				for(int j = i; j < nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				i--;
				nElems--;
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public void insert(E value) {
		arr[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}

}
