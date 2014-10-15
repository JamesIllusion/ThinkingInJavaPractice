class WaterSource{
	private String str;
	WaterSource(){
		System.out.println("WaterSource()");
		str = new String ("Constructed");
	}
	
	public String toString(){
		return str;
	}
}

public class SprinklerSystem{
	private String valve1, valve2, valve3, valve4;
	WaterSource wsource;
	int i;
	float f;

	void print(){
		System.out.println("Valve1 = " + valve1);
		System.out.println("valve2 = " + valve2);
		System.out.println("Valve3 = " + valve3);
		System.out.println("valve4 = " + valve4);
		System.out.println("i = " + i);
		System.out.println("float = " + f);
		System.out.println("water source = " + wsource);
	}

	public static void main(String[] args){
		SprinklerSystem x = new SprinklerSystem();
		x.print();
	}
}
