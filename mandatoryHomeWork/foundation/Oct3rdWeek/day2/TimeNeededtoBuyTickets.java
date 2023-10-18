package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day2;
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets {
	    public int timeRequiredToBuy(int[] tickets, int k) {
	        Queue<Integer> myQueueTickets = new LinkedList<Integer>();
	        Queue<Integer> myQueueIndex = new LinkedList<Integer>();
	       for(int i=0;i<tickets.length;i++)
	       {
	         myQueueTickets.add(tickets[i]);
	         myQueueIndex.add(i);  
	       }
	       int time=0;
	       while(true)
	       {
	           int curTickets=myQueueTickets.remove();
	           int curIndex=myQueueIndex.remove();
	           if(curTickets>0)
	           {
	               time++;
	               curTickets--;
	               if(curIndex==k)
	               if(curTickets==0)
	               return time;

	               myQueueTickets.add(curTickets);
	               myQueueIndex.add(curIndex);
	           }
	       }

	    }
}
