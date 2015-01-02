package algorithm_interview;

class Node{
	public int data;
	public Node next;
	
	public Node(int value){
		this.data = value;
	}
}

public class SortedLinklist {
	
	static Node mergeList(Node a, Node b){
		Node merge_head;
		Node merge_cur;
		
		if(a==null && b==null){
			System.out.println("both link lists are empty");
			return null;
		}
		else if(a==null)
			return b;
		else if(b==null)
			return a;
		
		
		if(a.data<b.data){
			merge_head = a;
			a = a.next;
		}
		else{
			merge_head = b;
			b = b.next;
		}merge_cur = merge_head;
		
		while(a!=null && b!=null){
			if(a.data<b.data){
				merge_cur.next = a;
				a = a.next;
				
			}
			else{
				merge_cur.next = b;
				b = b.next;
			}
			merge_cur = merge_cur.next;
		}
		
		while(a!=null){
			merge_cur.next = a;
			a = a.next;
			merge_cur = merge_cur.next;
		}
		
		while(b!=null){
			merge_cur.next = b;
			b = b.next;
			merge_cur = merge_cur.next;
		}
		
		return merge_head;
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
		Node a_5 = new Node(12);
		a_1.next = a_2;
		a_2.next = a_3;
		a_3.next = a_4;
		a_4.next = a_5;
		
		Node b_1 = new Node(4);
		Node b_2 = new Node(8);
		Node b_3 = new Node(10);
		Node b_4 = new Node(14);
		Node b_5 = new Node(15);
		b_1.next = b_2;
		b_2.next = b_3;
		b_3.next = b_4;
		b_4.next = b_5;
		
		printList(mergeList(a_1, b_1));
	}
	
}
