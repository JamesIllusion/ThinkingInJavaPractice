// Exercise 3-2
// Modify exercise 3-1 (print 1 - 100 integer),
// use 'break' to exit when printing 47


package chapter3;

public class PrintlntBreak_Ch3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=100; i++){
			System.out.println(i);
			
			if(i == 47)
//				break;
				return;
		}
	}

}
