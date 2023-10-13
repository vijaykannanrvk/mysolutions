package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day2;

public class MiddleNodeLinkedList {
	/**
	  Definition for singly-linked list.*/
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	    public ListNode middleNode(ListNode head) {
	        int size=0;
	        ListNode temp=head;
	        while(head!=null)
	        {
	            head=head.next;
	            size++;
	        }
	        size= size/2;
	        int pos=0;
	        while(temp!=null)
	        {
	            if(pos==size)
	            {
	                return temp;
	            }
	            temp=temp.next;
	            pos++;
	        }
	        return temp;
	    }

}
