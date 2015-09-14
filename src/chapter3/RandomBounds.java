//: RandomBounds.java
// Does Math.random() produce 0.0 and 1.0?

package chapter3;

public class RandomBounds {
	static void usage(){
		System.out.println("Usage: \n\t" +  "RandomBounds lower\n\t" +  "RandomBounds upper");
		System.exit(1);
	}
	
	public static void main(String[] args){
		if(args.length!=1) usage();
		if(args[0].equals("lower")){
			while(Math.random()!=0.0)
				;		//keep trying
			System.out.println("Produced 0.0!");
		}
		if(args[0].equals("uppper")){
			while(Math.random()!=1.0)
				;		//keep trying
			System.out.println("Produced 1.0!");
		}
		else
			usage();
	}
}
