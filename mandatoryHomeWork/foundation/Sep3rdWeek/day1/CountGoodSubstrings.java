package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CountGoodSubstrings {
	public int countGoodSubstring(String s) {
        int start=0,count=0,k=3;
        while(start+k<=s.length())
        {
          if(!isDuplicate(s.substring(start,start+k)))
          {
            count++;
          }
          start++;
        }
        return count;
    }

    public boolean isDuplicate(String s)
    {
      Set<Character> mySet = new HashSet<Character> ();
      for(int i=0;i<s.length();i++)
      if(!mySet.add(s.charAt(i)))
      return true;
      return false;
    }
    
    @Test
	public void test1()
	{
		Assert.assertEquals(4, countGoodSubstring("aababcabc"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, countGoodSubstring("xyzzaz"));
	}
}
