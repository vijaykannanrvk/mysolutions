package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day1;

public class FirstUniqueCharacterInString {
	    public int firstUniqChar(String s) {
	        int start=0,end=0,count=0;
	        while(start<s.length())
	        {
	            while(end<s.length())
	            {
	                if(s.charAt(start)==s.charAt(end))
	                count++;
	                if(count>1)
	                break;
	                end++;
	            }
	            if(count==1)
	            return start;
	            end=0;count=0;
	            start++;
	        }
	        return -1;
	        /*Map<Character,Integer> myMap = new LinkedHashMap<Character,Integer>();
	        for(int i=0;i<s.length();i++)
	        {
	            myMap.put(s.charAt(i),myMap.getOrDefault(s.charAt(i),0)+1);
	        }
	        for(Map.Entry<Character,Integer> mySet : myMap.entrySet() )
	        {
	            if(mySet.getValue()==1)
	            {
	                return s.indexOf(mySet.getKey()+"");
	            }
	        }
	        return -1;*/
	    }
}
