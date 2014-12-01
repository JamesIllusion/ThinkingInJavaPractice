
abstract public class Event {
	private long evTime;
	
	public Event(long eventTime){
		evTime = eventTime;
	}
	
	public boolean isReady(){
		return System.currentTimeMillis() >= evTime;
	}
	
	abstract public void action();
	abstract public String description();

}
