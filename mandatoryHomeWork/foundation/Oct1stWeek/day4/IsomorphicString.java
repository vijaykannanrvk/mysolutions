package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day4;

import java.util.HashMap;

public class IsomorphicString {
	    public boolean isIsomorphic(String s, String t) {
	        HashMap<Character,Character> smap = new HashMap();
	        for(int i=0;i<s.length();i++)
	        {
	            if(!smap.containsKey(s.charAt(i)))
	            smap.put(s.charAt(i),t.charAt(i));
	            else
	            if(smap.get(s.charAt(i))!=t.charAt(i))
	            return false;
	        }
	        return true;
	    }
}
