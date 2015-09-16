//: SimpleConstructor_.java
// 

package chapter4;

class Rock_{
	Rock_(int i){
		System.out.println("Creating Rock number " + i);
	}
}

public class SimpleConstructor_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++)
			new Rock_(i);
	}
}
