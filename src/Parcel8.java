
public class Parcel8 {
	public Destination dest(final String dest){
		return new Destination(){
			private String label = dest;
			public String label(){
				System.out.println("Parcel8.label = " + label);
				return label;
			}
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel8 p = new Parcel8();
		Destination d = p.dest("Los Angeles_LAX");
	}
}
