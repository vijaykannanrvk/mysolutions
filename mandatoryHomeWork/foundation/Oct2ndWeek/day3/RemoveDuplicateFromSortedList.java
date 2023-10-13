package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day3;

public class RemoveDuplicateFromSortedList {
	/**
	 * Definition for singly-linked list.*/
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	    public ListNode deleteDuplicates(ListNode head) {
	        ListNode tempHead =head,previous=null;
	        while(tempHead != null){
	            if(previous!=null)
	            {
	                if(previous.val==tempHead.val)
	                {
	                    previous.next=tempHead.next;
	                    tempHead=tempHead.next;
	                }
	                else
	                {
	                    previous=tempHead;
	                    tempHead=tempHead.next;
	                }
	            }
	            else
	            {
	                    previous=tempHead;
	                    tempHead=tempHead.next;
	            }
	        }
	        return head;
	    }
}
