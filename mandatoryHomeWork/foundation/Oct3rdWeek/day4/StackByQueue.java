package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day4;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import org.junit.Assert;

public class StackByQueue {
	class MyStack {
		   Queue<Integer> myStack;
		    public MyStack() {
		        myStack  = new LinkedList<Integer>();
		    }
		    
		    public void push(int x) {
		        myStack.add(x);
		    }
		    
		    public int pop() {
		        for(int i=0;i<myStack.size()-1;i++)
		        {
		            myStack.add(myStack.remove());
		        }
		        return myStack.remove();
		    }
		    
		    public int top() {
		        int top=pop();
		        myStack.add(top);
		        return top;
		    }
		    
		    public boolean empty() {
		        return myStack.size()==0;
		    }
		}

		/**
		 * Your MyStack object will be instantiated and called as such:
		 * MyStack obj = new MyStack();
		 * obj.push(x);
		 * int param_2 = obj.pop();
		 * int param_3 = obj.top();
		 * boolean param_4 = obj.empty();
		 */
	@Test
	public void test1()
	{
		MyStack obj = new MyStack();
		obj.push(1);
		obj.push(2);
		int param_2 = obj.pop();
		Assert.assertEquals(2, param_2);
		int param_3 = obj.top();
		Assert.assertEquals(1, param_3);
		boolean param_4 = obj.empty();
		Assert.assertEquals(false, param_4);
	}
}
