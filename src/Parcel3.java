abstract class Contents{
	abstract public int value();
}

interface Destination{
	String readLabel();
}

public class Parcel3 {
	private class pContents extends Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	
	protected class pDestination implements Destination{
		private String label;
		private pDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel(){
			return label;
		}
	}
	
	public Destination dest(String s){
		return new pDestination(s);
	}
	
	public Contents cont(){
		return new pContents();
	}

}

class Test{
	public static void main(String[] args){
		Parcel3 p = new Parcel3();
		Contents c = p.cont();
		Destination d = p.dest("Washington_DCA");
	}
}
