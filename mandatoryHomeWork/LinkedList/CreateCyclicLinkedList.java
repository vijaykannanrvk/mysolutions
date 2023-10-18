package mysolutions.mandatoryHomeWork.LinkedList;

import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

import org.junit.Assert;

public class CreateCyclicLinkedList {
	class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		      ListNode(int x,ListNode n) {
		          val = x;
		          next = n;
		      }
		  }
	
	public ListNode createCyclic()
	{
		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
		Random random = new Random(); 
		int n=random.nextInt(3);
		System.out.print(n);
		ListNode temp = head,currentNode=null,previous=null;
		int current =0;
		while(temp!=null)
		{
			if(current==n)
			{
				currentNode=temp;
			}
			current++;
			previous=temp;
			temp=temp.next;
		}
		previous.next=currentNode;
		return head;
	}
	
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> mySet = new HashSet<ListNode>();
        while(head!=null)
        {
            if(mySet.contains(head))
            {
            	System.out.print(head.val);
            return true;
            }
            mySet.add(head);
            head=head.next;
        }
        return false;
    }
	
	@Test
	public void test()
	{
		Assert.assertEquals(true,hasCycle(createCyclic()));
	}
}
