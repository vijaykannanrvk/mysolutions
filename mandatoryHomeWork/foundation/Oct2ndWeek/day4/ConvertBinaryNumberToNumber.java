package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day4;

public class ConvertBinaryNumberToNumber {
	/**
	  Definition for singly-linked list.*/
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	    public int getDecimalValue(ListNode head) {
	        ListNode tempHead = head;
	        String temp="";
	        while(tempHead!=null)
	        {
	            temp=temp+tempHead.val;
	            tempHead = tempHead.next;
	        }
	        int i=0,n=0;
	        for(int j=0;j<temp.length();j++)
	        {
	            n=n+((temp.charAt(temp.length()-j-1)-48)*(int)Math.pow(2,i));
	            i++;
	        }
	     return n;
	    }
}
