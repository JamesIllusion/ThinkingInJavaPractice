//: LabeledFor.java
// Java's "labeled for loop"

package chapter3;

public class LabeledFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		outer:	// Can't have statements here
			for(; true;){	// infinite loop
				inner:	// can't have statements here
					for(; i<10; i++){
						prt("i= " +i);
						if(i==2){
							prt("continue");
							continue;
						}
						if(i==3){
							prt("break");
							i++;	//otherwise i never gets incremented
							break;
						}
						if(i==7){
							prt("continue outer");
							i++;	//otherwise i never gets incremented
							continue outer;
						}
						if(i==8){
							prt("breaker outer");
							break outer;
						}
						for(int k=0; k<5; k++){
							if(k==3){
								prt("continue inner" + "k=" + k);
								continue inner;
							}
						}
						
					}
			}
	}
	
	static void prt(String s){
		System.out.println(s);
	}

}
