//: BigEgg2.java
// Proper inheritance of an inner class

package chapter7;

class Egg2{
	protected class Yolk{
		public Yolk(){
			System.out.println("Egg2.Yolk.construct");
		}
		
		public void f(){
			System.out.println("Egg2.Yolk.f");
		}
	}
	
	private Yolk y = new Yolk();
	
	public Egg2(){
		System.out.println("Egg2.construct\n");
	}
	
	public void insertYolk(Yolk yy){
		y = yy;
	}
	
	public void g(){
		y.f();
	}
}


public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk{
		public Yolk(){
			System.out.println("BigEgg2.Yolk.construct");
		}
		
		public void f(){
			System.out.println("BigEgg2.Yolk.f");
		}
	}

	/**
	 * @param args
	 */
	
	public BigEgg2(){
		System.out.println("BigEgg2.construct\n");
		
		insertYolk(new Yolk());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Egg2 e2 = new BigEgg2();
		
		e2.g();

	}

}
