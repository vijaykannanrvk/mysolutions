package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day2;

public class MergeTwoLinkedList {
	/**
	 * Definition for singly-linked list.*/
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode myHead=null;
	        if(list1!=null&&list2!=null)
	        {
	            if(list1.val<list2.val)
	            {
	                myHead= new ListNode(list1.val);
	                list1 =list1.next;
	            }
	            else
	            {
	                myHead =new ListNode(list2.val);
	                list2=list2.next;
	            }
	        }
	        else if(list1!=null)
	        {
	            myHead= new ListNode(list1.val);
	            list1 =list1.next;
	        }
	        else if(list2!=null)
	        {
	            myHead= new ListNode(list2.val);
	            list2 =list2.next;
	        }
	        ListNode temp=myHead;
	        while(list1!=null&&list2!=null)
	        {
	            if(list1.val<list2.val)
	            {
	                    myHead.next= new ListNode(list1.val);
	                    list1 =list1.next;
	                    myHead=myHead.next;
	            }
	            else
	            {
	                myHead.next =new ListNode(list2.val);
	                list2=list2.next;
	                myHead=myHead.next;
	            }
	        }
	        while(list1!=null)
	        {
	            myHead.next= new ListNode(list1.val);
	            list1 =list1.next;
	            myHead=myHead.next;
	        }
	        while(list2!=null)
	        {
	            myHead.next= new ListNode(list2.val);
	            list2 =list2.next;
	            myHead=myHead.next;
	        }
	        return temp;
	    }
}
