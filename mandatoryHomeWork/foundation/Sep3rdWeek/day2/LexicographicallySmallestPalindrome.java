package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day2;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicallySmallestPalindrome {
	public String makeSmallestPalindrome(String s) {
        int start=0,end=s.length()-1;
        char[] sArray = s.toCharArray();
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                if(s.charAt(start)<s.charAt(end))
                sArray[end]=s.charAt(start);
                else
                sArray[start]=s.charAt(end);
                
            }
            start++;
            end--;
        }
        return new String(sArray);
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("abba", makeSmallestPalindrome("abcd"));
	}
	

}
