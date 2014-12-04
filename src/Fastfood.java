class Soup{
	private Soup(){}

	public static Soup makeSoup(){
		return new Soup();
	}

	private static Soup ps1 = new Soup();

	public static Soup access(){
		return ps1;
	}

	public void f(){}
}

class Burger{
	void f(){
		new Lunch();
	}
}

public class Fastfood{
	void test(){
//		Soup priv1 = new Soup();
		Soup priv2 = Soup.makeSoup();
		Burger fri1 = new Burger();
		Soup.access().f();
	}
}
