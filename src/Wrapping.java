
public class Wrapping {
	private int i;
	public Wrapping(int x){
		i = x;
	}
	public int value(){
		System.out.println("Wrapping.value is " + i);
		return i;
	}

}
