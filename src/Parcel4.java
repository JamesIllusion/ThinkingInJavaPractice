
public class Parcel4 {
	public Destination dest(String s){
		class pDestination implements Destination{
			private String label;
			private pDestination(String whereTo){
				label = whereTo;
			}
			public String readLabel(){
				System.out.println("shipping label = " + label);
				return label;
			}	
		}
		return new pDestination(s);
	}
	
	public static void main(String[] args){
		Parcel4 p = new Parcel4();
		Destination de = p.dest("Dallas_DFW");
	}

}
