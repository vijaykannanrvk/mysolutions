package mysolutions.mandatoryHomeWork.DoublyLinkedList;

import java.util.Queue;

import org.junit.Test;

public class DoublyLinkedList {
	Node head=null,tail=null;
	int size=0;
	
	public class Node
	{
		int data;
		Node next;
		Node prev;
		public Node(int val)
		{
			data=val;
			next=null;
			prev=null;
			
		}
		
		public Node(int val,Node next,Node prev)
		{
			data=val;
			this.next=next;
			this.prev=prev;
		}
	}
	
	public void add(int val)
	{
		if(head==null)
		{
			head=tail=new Node(val);
		}
		else
		{
			this.tail.next = new Node (val,null,tail);
			this.tail=this.tail.next;
		}
		this.size++;
	}
	
	public void addFirst(int val)
	{
		if(head==null)
			this.head=this.tail=new Node(val,null,null);
		else
		{
		Node current = new Node (val,head,null);
		this.head=current;
		}
		this.size++;
	}
	
	public void addLast(int val)
	{
		if(head==null)
			this.head=this.tail=new Node(val,null,null);
		else
		{
			this.tail.next = new Node (val,null,tail);
			this.tail=this.tail.next;
		}
		this.size++;
	}
	
	public void removeFirst()
	{
		if(head.next!=null)
		{
		this.head=head.next;
		this.head.prev=null;
		}
		else
		{
			this.head=this.tail=null;
		}
		this.size--;
	}
	
	public void removeLast()
	{
		if(tail.prev!=null)
		{
		this.tail=tail.prev;
		this.tail.next=null;
		}
		else
		{
			this.head=this.tail=null;
		}
		this.size--;
	}
	
	
	@Test
	public void test1()
	{
		DoublyLinkedList DLL = new DoublyLinkedList();
		DLL.add(10);
		DLL.add(20);
		DLL.add(30);
		DLL.add(40);
		DLL.addFirst(100);
		DLL.addFirst(101);
		DLL.addFirst(102);
		DLL.addFirst(103);
		DLL.addLast(200);
		DLL.addLast(201);
		DLL.addLast(202);
		DLL.addLast(203);
		Node temph = DLL.head;
		while(temph!=null)
		{
			System.out.println(temph);
			System.out.println(temph.prev+":"+temph.data+":"+temph.next);
			temph=temph.next;
		}
		System.out.println(DLL.size);
		DLL.removeFirst();
		DLL.removeFirst();
		DLL.removeFirst();
		DLL.removeFirst();
		DLL.removeLast();
		DLL.removeLast();
		DLL.removeLast();
		DLL.removeLast();
		Node tempt=DLL.tail;
		while(tempt!=null)
		{
			System.out.println(tempt);
			System.out.println(tempt.prev+":"+tempt.data+":"+tempt.next);
			tempt=tempt.prev;
		}
		System.out.println(DLL.size);
		DLL.reverse();
		temph = DLL.head;
		while(temph!=null)
		{
			System.out.println(temph);
			System.out.println(temph.prev+":"+temph.data+":"+temph.next);
			temph=temph.next;
		}
	}
	
	public void reverse()
	{
		Node tempHead = this.head;
		Node prev=null;
		while(tempHead!=null)
		{
			prev=tempHead.prev;
			tempHead.prev=tempHead.next;
			if(tempHead.prev==null)
				this.head=tempHead;
			tempHead.next=prev;
			if(tempHead.next==null)
				this.tail=tempHead;
			tempHead=tempHead.prev;
			
		}
		
	}
	
	/*@Test
	public void test2()
	{
		String s="";
		Queue<Integer> myQueueu = new Queue<>();
	}*/

}
