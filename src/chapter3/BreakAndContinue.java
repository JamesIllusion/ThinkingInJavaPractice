//: BreakAndContinue.java
// Demonstrates break and continue keywords


package chapter3;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++){
			if(i==74)	break;
			if(i%9!=0)	continue;
			System.out.println(i);
		}
		System.out.println("\n");
		int i=0;
		while(true){
			i++;
			int j=i*27;
			if(j==1269)	break;
			if(i%10!=0)	continue;
			System.out.println(i);
		}
	}

}
