//: Controller.java
// Along with Event, the generic
// framework for all control systems

package chapter7.controller;

class EventSet{
	private Event[] events = new Event[100];
	private int index = 0;
	private int next = 0;
	
	public void addEvent(Event e){
		if(index >= events.length)
			return;
		events[index++] = e;
	}
	
	public Event getNext(){
		boolean loop = false;
		int start = next;
		
		do{
			next = (next+1) % events.length;
			
			if (start == next)
				loop = true;
			
			if (next == (start+1) % events.length && loop)
				return null;
		}while(events[next] == null);
		return events[next];
	}
	
	public void removeEvent(){
		events[next] = null;
	}
}


public class Controller {

	/**
	 * @param args
	 */
	private EventSet es = new EventSet();
	
	public void addEvent(Event c){
		es.addEvent(c);
	}
	
	public void run(){
		Event e;
		
		while((e = es.getNext()) != null){
			if(e.Ready()){
				e.action();
				System.out.println(e.description());
				es.removeEvent();
			}
		}
	}
}
