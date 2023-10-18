package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day3;

public class ReOrderList {
	/**
	 * Definition for singly-linked list. */
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	    public void reorderList(ListNode head) {
	    if(head.next!=null)
	    {
	     ListNode tempHead = head,reverse=null,next=null;
	     int size=0;
	     while(tempHead!=null)
	     {
	         ListNode temp = new ListNode(tempHead.val,reverse);
	         next=tempHead.next;
	         reverse=temp;
	         tempHead=next;
	         size++;
	     }
	     int i=0;
	     tempHead = head;
	     while(tempHead!=null)
	     {
	         if(i%2==0)
	         {
	             ListNode temp = tempHead.next;
	             tempHead.next=reverse;
	             reverse=reverse.next;
	             next=tempHead;
	             tempHead=tempHead.next;         
	             tempHead.next=temp;
	         }
	         else
	         {
	         next=tempHead;
	         tempHead=tempHead.next;
	         }
	         if(i+1==size)
	         {
	         next.next=null;
	         return;
	         }
	         i++;
	     }
	    }
	    }
}
