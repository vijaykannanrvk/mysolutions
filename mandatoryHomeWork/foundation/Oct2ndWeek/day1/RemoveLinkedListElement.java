package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day1;

public class RemoveLinkedListElement {
	
	/**
	 * Definition for singly-linked list.*/
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	    public ListNode removeElements(ListNode head, int val) {
	        ListNode temp=head,previous=null;
	        while(temp!=null)
	        {
	            if(temp.val==val)
	            {
	                if(previous!=null)
	                {
	                    previous.next=temp.next;
	                    temp=temp.next;
	                }
	                else
	                {
	                    previous=temp;
	                    temp=temp.next;
	                }
	            }
	            else
	            {
	            previous=temp;
	            temp=temp.next;
	            }
	        }
	        if(head!=null)
	        if(head.next==null&&head.val==val)
	        head=null;
	        else if(head.val==val)
	        head=head.next;
	        return head;
	        
	    }

}
