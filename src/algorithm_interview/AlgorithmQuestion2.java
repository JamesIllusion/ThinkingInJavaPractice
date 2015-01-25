// define data structure of stack, with operation of 'findMin' to get the minimum element from the stack
// time complexity of 'findMin' , 'push', 'pop' has to be O(1)

package algorithm_interview;

class Stack{
	private int N;
	private Node first;
	
	private class MinStack extends Stack{		
		MinStack(){
			first=null;
			N=0;
		}
		
		void push(int m){
			Node temp = first;
			
			if(m<first.data)
				first = new Node(m);
			else
				first = new Node(first.data);
			
			first.next = temp;
			N++;
		}
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
		Node temp = first;
		first = new Node(n);
		first.next = temp;
		N++;
		
		MinStack.push(n);
	}
	
	int pop(){
		int n = first.data;
		first = first.next;
		
		MinStack.pop();
		
		return n;
	}
	
	int peek(){
		if(isEmpty())
			System.out.println("ERROR: Empty Stack");
		
		return first.data;
	}
	
	int findMin(){
		return MinStack.peek();
	}
}

public class AlgorithmQuestion2 {

}
