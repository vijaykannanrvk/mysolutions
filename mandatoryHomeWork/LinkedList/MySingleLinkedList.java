package mysolutions.mandatoryHomeWork.LinkedList;

public class MySingleLinkedList {
	Node head= null,tail=null;
	int size;
	public class Node{
		int key;
		Node next;
		public Node(int key)
		{
			this.key=key;
			size++;
		}
	}
	
	public void add(int key)
	{
		if(head==null)
		{
			tail=head=new Node(key);
		}
		else
		{
			tail=tail.next=new Node(key);
			/* which is right to left processing
			 * tail.next = new Node(key);
			 * tail=tail.next;
			 */
		}
	}
	
	public void remove(int key)
	{
		Node previous=null,temp=head;
		while(temp!=null)
		{
			if(temp.key==key)
			{
				if(previous==null)
				{
					head=head.next;
					
				}
				else if(temp.next==null)
				{
					previous.next=null;
					tail=previous;
				}
				else
				{
					previous.next=temp.next;
				}
				size--;
				return;
		   }
			else
			{
				previous=temp;
				temp=temp.next;
			}
		}	
	}
	
	public void addAll(int[] keys)
	{
		for(int i=0;i<keys.length;i++)
		if(head==null)
		{
			tail=head=new Node(keys[i]);
		}
		else
		{
			tail=tail.next=new Node(keys[i]);
			/* which is right to left processing
			 * tail.next = new Node(key);
			 * tail=tail.next;
			 */
		}
	}
	
	public void RemoveAll(int key)
	{
		Node previous=null,temp=head;
		while(temp!=null)
		{
			if(temp.key==key)
			{
				if(previous==null)
				{
					head=head.next;
					
				}
				else if(temp.next==null)
				{
					previous.next=null;
					tail=previous;
				}
				else
				{
					previous.next=temp.next;
				}
				size--;
		    }
			previous=temp;
			temp=temp.next;
		}	
	}
	
	public int lastIndexOf(int key)
	{
		Node temp=head;
		int index=-1,size=0;
		while(temp!=null)
		{
			if(temp.key==key)
			{
				index=size;
			}
			size++;
			temp=temp.next;
		}
		return index;
	}
	
	public void insert(int key,int index)
	{
		Node temp=head,previous=null;
		int currentIndex=0;
		if(index==0)
		{
			temp=new Node(key);
			temp.next=head;
			head=temp;
			return;
		}
		while(temp!=null)
		{
			if(currentIndex==index)
			{
			 previous= previous.next = new Node(key);
			 previous.next=temp;
			 return; 
			}
			previous=temp;
			temp=temp.next;
			currentIndex++;
		}
		if(currentIndex==index)
		{
		 previous= previous.next = new Node(key);
		 previous.next=temp;
		 return; 
		}
	}
	
	public void addAll(int[] keys,int index)
	{
		int currentIndex=0;
		Node temp=head,previous=null;
		if(index==0)
		{
			for(int i=0;i<keys.length;i++)
			{
				if(i==0)
				{
				temp=new Node(keys[i]);
				head=temp;
				}
				else
					temp=temp.next=new Node(keys[i]);
			}
			return;
		}
		while(temp!=null)
		{
			if(currentIndex==index)
			{
				for(int i=0;i<keys.length;i++)
				{
					previous=previous.next=new Node(keys[i]);
				}
				previous.next=temp;
				return;
			}
			previous=temp;
			temp=temp.next;
			currentIndex++;
		}
		if(currentIndex==index)
		{
			for(int i=0;i<keys.length;i++)
			{
				previous=previous.next=new Node(keys[i]);
			}
			previous.next=temp;
			return;
		}
	}

}
