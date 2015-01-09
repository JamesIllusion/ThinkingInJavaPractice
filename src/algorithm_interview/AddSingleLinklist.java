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
		Node answer = null;
		Node mark = null;
		
		if(a==null || b==null)
			System.out.println("not able to execute plus operation, missing element");
		
		// decide the head of the result
		if((a.data+b.data)>9){
			answer.data = 1;
			mark = answer;
			answer = answer.next;
			answer.data = (a.data+b.data)%10;
		}
		else{
			answer.data = (a.data+b.data)%10;
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

}
