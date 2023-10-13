package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day4;

public class InsertionOfTwoLinkedList {
	/**
	  Definition for singly-linked list.*/
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	       ListNode tempHead =headA;
	       while(headB!=null)
	       {
	        headA=tempHead;
	        while(headA!=null)
	        {
	            if(headA==headB&&headA!=null)
	            return headA;
	            else
	            {
	            headA=headA.next;
	            }
	        }
	        headB=headB.next;
	       }
	        return null;
	    }
}
