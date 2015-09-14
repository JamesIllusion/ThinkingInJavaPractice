// Exercise 3-3
// put 'switch' into a 'for loop', use each 'case' to show a piece of information,
// put 'break' after each 'case'


package chapter3;

public class InfoSwitch_Ch3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index = 0;
		
		for(int i=0; i<5; i++){
			index = i+1;
			switch(index){
			case 1:
				System.out.println("Hello World!");
//				break;
			case 2:
				System.out.println("Good morning!");
//				break;
			case 3:
				System.out.println("Good afternoon!");
//				break;
			case 4:
				System.out.println("Good evening!");
//				break;
			case 5:
				System.out.println("Good night world!");
//				break;
			}	
		}
	}

}
