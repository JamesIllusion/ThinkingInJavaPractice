// define data structure of stack, with operation of 'findMin' to get the minimum element from the stack
// time complexity of 'findMin' , 'push', 'pop' has to be O(1)

// answer: using a auxiliary stack / value pointer to store current minimum value

package algorithm_interview;

class Stack{
	private int N;
	private stackNode first;
	
	private class stackNode{
		int value;
		int min;
		stackNode next;
		
		stackNode(){		}
	}
	
	Stack(){
		first = null;
		N = 0;
	}
	
	boolean isEmpty(){
		return (N==0);
	}
	
	int size(){
		return N;
	}
	
	void push(int n){
		stackNode temp = first;
		first = new stackNode();
		first.value = n;
		
		if(isEmpty() || n<temp.min)
			first.min = n;
		else
			first.min = temp.min;
		
		first.next = temp;
		N++;
	}
	
	int pop(){
		int value = first.value;
		first = first.next;
		
		return value;
	}
	
	int peek(){
		if(isEmpty())
			System.out.println("ERROR: Empty Stack");
		
		return first.value;
	}
	
	int findMin(){
		return first.min;
	}
}

public class AlgorithmQuestion2 {

}
