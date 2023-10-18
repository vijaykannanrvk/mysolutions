package mysolutions.mandatoryHomeWork.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class SinglyLinkedList {
    //11,43,23,11,90
	Node head =null,tail=null;
	int size=0;
	public class Node
	{
		int value;
		Node next;
		
		public Node(int key)
		{
			this.value=key;
			next=null;
		}
	}
	
	public Node add(int key)
	{
		return new Node(key);
	}
	
	public void adds(int key)
	{
		if(head==null)
		{
		 head= new Node(key);
		 tail =head;
		 size=1;
		}
		else
		{
			tail.next = new Node(key);
			tail=tail.next;
			size++;
		}
	}
	
	/*SinglyLinkedList mylinklist = new SinglyLinkedList();
	mylinklist.adds(11);//1
	mylinklist.adds(43);//2
	mylinklist.adds(23);//3
	mylinklist.adds(12);
	mylinklist.adds(90);*/
	
	@Test
	public void test1()
	{
		Node head = new Node(11);
		head.next = new Node(43);
		head.next.next =new Node(23);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(90);
		
		Node temp = head;
		while(temp!=null)
		{
			System.out.println("CurrentNode:"+temp+"| |Value:"+temp.value+"| |Next:"+temp.next);
			temp=temp.next;
		}
		System.out.println();
		
		Node reverse= reverse(head);
		while(reverse!=null)
		{
			System.out.println("CurrentNode:"+reverse+"| |Value:"+reverse.value+"| |Next:"+reverse.next);
			reverse=reverse.next;
		}
	}
	
	public Node reverse(Node head)
	{
		Node curr=head,next=null,prev=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;		
		}
		return prev;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public boolean remove(int index)
	{
		int size =0;
		Node temp =this.head;
		if(index==0)
		{
			this.head=this.head.next;
			this.size--;
			return true;
		}
		while(temp!=null)
		{
			if(size==index-1)
			{
				if(temp.next!=null)
				{
				temp.next= temp.next.next;
				this.size--;
				return true;
				}
				else
					return false;
					
			}
			size++;
			temp= temp.next;
		}
		return false;
	}
	
	public void insert(int key,int index)
	{
		int size=0;
		Node temp=this.head;
		if(index==0)
		{
			this.head=new Node(key);
			this.head.next=temp;
			this.size++;
			return ;
		}
		while(temp!=null)
		{
			if(size==index-1)
			{
				Node next=temp.next;
				temp.next=new Node(key);
				temp.next.next=next;
				this.size++;
				return;
			}
			temp=temp.next;
			size++;	
		}
		if(size==index-1)
		{
			this.tail.next=new Node(key);
			this.size++;
		}
		
	}
	
	public void insertAtIndex( int[] keys,int index)
	{
		int size=0;
		Node temp=this.head;
		if(index==0)
		{
			Node next=head;
			for(int i=0;i<keys.length;i++)
			{
				if(i==0)
				{
					temp=new Node(keys[i]);
					this.head=temp;
				}
				else
				temp =temp.next=new Node(keys[i]);
			}
			temp.next=next;
			return;
		}
		while(temp!=null)
		{
			if(size==index-1)
			{
				Node next=temp.next;
				for(int i=0;i<keys.length;i++)
				{
					temp =temp.next=new Node(keys[i]);
				}
				temp.next=next;
				return;
			}
		}
	}
	
	public void addAll(int [] values)
	{
		for(int i=0;i<values.length;i++)
		if(head==null)
		{
		 head= tail = new Node(values[i]);
		 size=1;
		}
		else
		{
			tail.next = new Node(values[i]);
			tail=tail.next;
			size++;
		}
	}
	
	public void removeAll()
	{
		this.head=null;
	}
	
	public int lastIndexOf(int key)
	{
		int size=0,index=-1;
		Node temp=this.head;
		while(temp!=null)
		{
			if(key==temp.value)
				index= size;
			size++;
			temp=temp.next;
		}
		return index;
	}
	
	@Test
	public void test2()
	{
		//LinkedList<Integer> list = new LinkedList<>();
		//list.clone();
		SinglyLinkedList mylinklist = new SinglyLinkedList();
		mylinklist.adds(11);//1
		mylinklist.adds(43);//2
		mylinklist.adds(23);//3
		mylinklist.adds(12);
		mylinklist.adds(90);
		Node temp = mylinklist.head;
		while(temp!=null)
		{
			System.out.println("CurrentNode:"+temp+"| |Value:"+temp.value+"| |Next:"+temp.next);
			temp=temp.next;
		}
		System.out.println(mylinklist.size());
		mylinklist.remove(3);
		
		
		SinglyLinkedList mylinklist1 = new SinglyLinkedList();
		mylinklist1.addAll(new int [] {11,43,23,12,90,24});
		temp = mylinklist1.head;
		while(temp!=null)
		{
			System.out.println("CurrentNode:"+temp+"| |Value:"+temp.value+"| |Next:"+temp.next);
			temp=temp.next;
		}
		System.out.println();
		mylinklist1.insert(11, 4);
		//System.out.println(lastIndexOf(11));
		temp = mylinklist1.head;
		while(temp!=null)
		{
			System.out.println("CurrentNode:"+temp+"| |Value:"+temp.value+"| |Next:"+temp.next);
			temp=temp.next;
		}
		System.out.println(mylinklist1.lastIndexOf(11));
		
	}
}
