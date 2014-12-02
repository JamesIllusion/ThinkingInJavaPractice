abstract class Contents{
	abstract public int value();
}

interface Destination{
	String readLabel();
}

public class Parcel10 {
	private static class pContents extends Contents{
		private int i = 11;
		public int value(){
			System.out.println("Content.i = " + i);
			return i;
		}
	}
	
	protected static class pDestination implements Destination{
		private String label;
		private pDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel(){
			return label;
		}
	}
	
	public static Destination dest(String s){
		return new pDestination(s);
	}
	
	public static Contents cont(){
		return new pContents();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contents c = cont();
		Destination d = dest("Dallas_DFW");

	}

}
