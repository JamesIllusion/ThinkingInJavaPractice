package chapter4;

class Example{
	Example(){
		System.out.println("Default for Example");
	}
	
	Example(String str){
		System.out.println("Constructor with String // " + str);
	}
}

public class DefaultConstructor_Ch4Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example_dflt = new Example();
		Example example_str = new Example("Gundam Seed");
	}

}
