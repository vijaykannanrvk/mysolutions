package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day3;

import java.util.HashMap;
import java.util.HashSet;

public class RingsAndRods {
	    public int countPoints(String rings) {
	        int count=0;
	        HashMap<Character,HashSet<Integer>> myMap = new HashMap<Character,HashSet<Integer>>();
	        for(int i=0;i<rings.length()-1;i+=2)
	        {
	            HashSet<Integer> myTempSet =myMap.getOrDefault(rings.charAt(i),new HashSet<Integer>());
	            myTempSet.add(rings.charAt(i+1)-48);
	            myMap.put(rings.charAt(i),myTempSet);
	        }
	        for(int i=0;i<10;i++)
	        {
	            if(myMap.get('R')!=null&&myMap.get('G')!=null&&myMap.get('B')!=null)
	            if(myMap.get('R').contains(i)&&myMap.get('G').contains(i)&&myMap.get('B').contains(i))
	            count++;
	        }
	        return count;
	    }
}
