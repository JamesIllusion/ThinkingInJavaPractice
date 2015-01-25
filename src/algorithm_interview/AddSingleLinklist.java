// given two link list, add together bit by bit to generate a new link list

package algorithm_interview;

class Node_{
	public int data;
	public Node next;
	
	public Node_(int value){
		this.data = value;
	}
}

public class AddSingleLinklist {
	
	static Node addList(Node a, Node b){
		Node answer = new Node(0);
		Node mark = new Node(0);
		
		if(a==null || b==null)
			System.out.println("not able to execute plus operation, missing element");
		
		// decide the head of the result
		if((a.data+b.data)>9){
			answer.data = 1;
			mark = answer;
			answer = answer.next;
			answer.data = (a.data+b.data)-10;
		}
		else{
			answer.data = a.data+b.data;
			mark = answer;
			answer = answer.next;
		}
		a = a.next;
		b = b.next;
		
		// calculation loop
		while(a!=null && b!=null){
			if((a.data+b.data)>9){
				answer.data = (a.data+b.data)%10;
				answer.next = answer;
				
				while(mark!=answer){
					mark.data+=1;
					mark = mark.next;
				}
			}
			
			else if((a.data+b.data)==9){
				answer.data = 9;
				answer = answer.next;
			}
			
			else if((a.data+b.data)<9){
				answer.data = a.data+b.data;
				mark = answer;
				answer = answer.next;
			}
			
			a = a.next;
			b = b.next;
		}
		
		return answer;
//		return null;
	}
	
	static void printList(Node node){
		while(node.next!=null){
			System.out.print(node.data + " -> ");
			node = node.next;
		}System.out.println(node.data);
	}
	
	public static void main(String[] args){
		Node a_1 = new Node(2);
		Node a_2 = new Node(5);
		Node a_3 = new Node(7);
		Node a_4 = new Node(9);
		Node a_5 = new Node(0);
		a_1.next = a_2;
		a_2.next = a_3;
		a_3.next = a_4;
		a_4.next = a_5;
		
		Node b_1 = new Node(4);
		Node b_2 = new Node(8);
		Node b_3 = new Node(6);
		Node b_4 = new Node(3);
		Node b_5 = new Node(1);
		b_1.next = b_2;
		b_2.next = b_3;
		b_3.next = b_4;
		b_4.next = b_5;
		
		printList(addList(a_1, b_1));
	}

}
