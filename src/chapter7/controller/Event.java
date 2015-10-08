//: Event.java
// The common methods for any control event



package chapter7.controller;

abstract public class Event {
	private long evTime;
	
	public Event(long eventTime){
		evTime = eventTime;
	}
	
	public boolean Ready(){
		return System.currentTimeMillis() >= evTime;
	}
	
	abstract public void action();
	abstract public String description();

}
