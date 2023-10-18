package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day3;

import java.util.ArrayList;
import java.util.List;

class RecentCounter {
		 List<Integer> myPings;
		    public RecentCounter() {
		        myPings = new ArrayList<Integer>();
		    }
		    
		    public int ping(int t) {
		        int counter=1;
		        for(Integer time: myPings)
		        if(t-time<=3000)
		        counter++;
		        myPings.add(t);
		        return counter;
		    }
		}

		/**
		 * Your RecentCounter object will be instantiated and called as such:
		 * RecentCounter obj = new RecentCounter();
		 * int param_1 = obj.ping(t);
		 */
