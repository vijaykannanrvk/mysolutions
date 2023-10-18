package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day1;

import java.util.Stack;

public class BaseBall {
	    public int calPoints(String[] operations) {
	        Stack<Integer> myStack = new Stack<Integer>();
	        int result=0;
	        for(int i=0;i<operations.length;i++)
	        if(operations[i].equals("+"))
	        {
	            if(!myStack.empty())
	            {
	                int j=myStack.pop(),peek=myStack.peek();
	                myStack.push(j);
	                myStack.push(j+peek);
	            }
	        }
	        else if(operations[i].equals("C"))
	        {
	            if(!myStack.empty())
	            {
	                myStack.pop();
	            }
	        }
	        else if(operations[i].equals("D"))
	        {
	            if(!myStack.empty())
	            {
	                int peek=myStack.peek();
	                myStack.push(2*peek);
	            }
	        }
	        else
	        {
	            myStack.push(Integer.parseInt(operations[i]));
	        }
	        while(!myStack.empty())
	        result=result+myStack.pop();
	        return result;
	}
}
