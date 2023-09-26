package mysolutions.mandatoryHomeWork.foundation.Sep4thWeek.day1;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolors {

	public int minRecolors(String blocks, int k) {
        int end=k,minoperations=Integer.MAX_VALUE;
        while(end<=blocks.length())
        {
            minoperations=Math.min(minoperations,operations(blocks.substring(end-k,end)));
            if(minoperations==0)
            return 0;
            end++;
        }
        return minoperations;
    }
    public int operations(String block)
    {
        int count=0;
        for(int i=0;i<block.length();i++)
        {
            if(block.charAt(i)=='W')
            count++;
        }
        return count;
    }
    
    @Test
	public void test1()
	{
		Assert.assertEquals(3, minRecolors("WBBWWBBWBW",7));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, minRecolors("WBWBBBW",3));
	}
    
    
}
