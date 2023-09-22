package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day3;

import org.junit.Assert;
import org.junit.Test;

public class NumberSubstringsContainingAllThreeCharacters {
	public int numberOfSubstrings(String s) {
        int count=0;
        for(int j=0;j<=s.length()-3;j++)
        {
            boolean flag=false;
            for(int i=j+3;i<=s.length();i++)
            {
                if(!flag)
                {
                flag=isABCpresent(s.substring(j,i));
                }
                if(flag)
                count++;
            }
        }
        return count;
    }
    public boolean isABCpresent(String s)
    {
        int[] presence = new int[3];
        for(int i=0;i<s.length();i++)
        presence[s.charAt(i)-97]++;

        if(presence[0]>=1&&presence[1]>=1&&presence[2]>=1)
        return true;

        return false;
    }
    
    @Test
	public void test1()
	{
		Assert.assertEquals(10, numberOfSubstrings("abcabc"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3, numberOfSubstrings("aaacb"));
	}
}
