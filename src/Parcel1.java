
public class Parcel1 {
	class Contents{
		private int i = 11;
		public int value(){
			System.out.println("Contents.i = " + i);
			return i;
		}
	}
	
	class Destination{
		private String label;
		Destination(String whereTo){
			System.out.println("Destination = " + whereTo);
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	
	public void shipTo(String dest){
		Contents c = new Contents();
		Destination d = new Destination(dest);
	}
	
	public static void main(String[] args){
		Parcel1 p = new Parcel1();
		p.shipTo("Chicago_ORD");
	}

}
