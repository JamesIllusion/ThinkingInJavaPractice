
public class Parcel6 {
	public Contents cont(){
		return new Contents(){
			private int i =11;
			public int value(){
				System.out.println("value in Parcel6 is " + i);
				return i;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel6 p = new Parcel6();
		Contents c = p.cont();
	}
}
