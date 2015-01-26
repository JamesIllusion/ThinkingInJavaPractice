// given a single link list, and an integer K, return the last Kth node

// answer:

package algorithm_interview;

class LinkNode{
	int m_nKey;
	LinkNode next;
}

class SingleLinkList{
	
	int listLength(LinkNode head){
		int count = 0;
		
		while(head.next!=null){
			count++;
			head = head.next;
		}
		
		return count;
	}
	
	// simply calculate the length of the link list, and then get the N-Kth node as result
	LinkNode getLastK_1(LinkNode head, int K){
		if(listLength(head)<K)
			return null;
		
		for (int i=0; i<listLength(head)-K; i++)
			head = head.next;
		
		return head;
	}
	
	// double cursors, keep cursors' distance as K, once the first one reaches the tail, the second points the result
	LinkNode getLastK_2(LinkNode head, int K){
		if(listLength(head)<K)
			return null;
		
		LinkNode cursor_1 = head;
		LinkNode cursor_2 = head;
		
		for(int i=0; i<K; i++)
			cursor_1 = cursor_1.next;
		
		while(cursor_1.next!=null){
			cursor_1 = cursor_1.next;
			cursor_2 = cursor_2.next;
		}
		
		return cursor_2;
	}
}

public class AlgorithmQuestion8 {

}
