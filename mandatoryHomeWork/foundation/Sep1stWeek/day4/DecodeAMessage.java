package mysolutions.mandatoryHomeWork.foundation.Sep1stWeek.day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class DecodeAMessage {
	
	public String decodeMessage(String key, String message) {
        key=key.replaceAll(" ","");
        String keys="";
        {
        Set<Character> mySet = new HashSet<Character>();
        for(int i=0;i<key.length();i++)
        {
        if(mySet.add(key.charAt(i)))
        keys=keys+key.charAt(i);
        }
        }
        key=new String(keys);
        keys="";
        for(int i=0;i<message.length();i++)
        {
            int currentIndex=key.indexOf(message.charAt(i));
            if(currentIndex!=-1)
            keys=keys+(char)(currentIndex+97);
            else
            keys=keys+" ";
        }
        return keys;
    }
	
	 public String decodeMessages(String key, String message) {
	        Map<Character,Character> myMap = new HashMap<Character,Character>();
	        int startpos =97;
	        key=key.replaceAll(" ","");
	        int length=key.length();
	        for(int i=0;i<length;i++)
	        {
	            char tempChar = key.charAt(i);
	            if(!myMap.containsKey(tempChar))
	            {
	            myMap.put(tempChar,(char)(startpos));
	            startpos++;
	            }
	        }
	        StringBuffer result=new StringBuffer();
	        length=message.length();
	        for(int i=0;i<length;i++)
	        {
	            result.append(myMap.getOrDefault(message.charAt(i),' '));
	        }
	        return result.toString();
	    }
	 
	 
	 @Test
		public void test1()
		{
			Assert.assertEquals("this is a secret", decodeMessages("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
		}

}
