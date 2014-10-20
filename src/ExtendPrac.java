class A{
	A(){
		//constructor
		System.out.println("Construct A");
	}
	
	A(int i){
		System.out.println("Construct A with intergrator " + i);
	}
}

class B{
	B(){
		System.out.println("Coxnstruct B");
	}
	
	B(char ch){
		System.out.print("Construct B with char " + ch);
	}
}

class C extends A{
	C(){
		//constructor
	}
	
	C(boolean ifCon){
		if(ifCon)
			System.out.println("Input value is true");
		else
			System.out.println("Input value is false");
		
		A a_c_Con = new A(10);
		B b_c_Con = new B('t');
	}
	
//	B b_c = new B();
}


public class ExtendPrac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C objC = new C();
		C objC_1 = new C(true);
	}

}
