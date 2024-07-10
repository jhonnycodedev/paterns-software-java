package Solid_AULA08_Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private int State;
	private List<ABSObserver> observers = new ArrayList<>();
	
	public int getState() {
		return State;
	}
	
	public void setState(int state) {
		State = state;
		this.notifyAllobservers();
	}
	
	
	public void notifyAllobservers() {
		for(ABSObserver observer : observers) {
			observer.Update();
		}
	}
	
	public void attach(ABSObserver observer) {
		this.observers.add(observer);
	}
}
