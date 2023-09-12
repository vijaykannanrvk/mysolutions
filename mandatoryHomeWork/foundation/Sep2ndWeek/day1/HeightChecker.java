package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day1;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class HeightChecker {
	
	public int heightChecker(int[] heights) {
        int sorted[]=heights.clone();
        int count=0;
        Arrays.sort(sorted);
        for(int i=0;i<heights.length;i++)
        if(heights[i]!=sorted[i])
        count++;

        return count;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(5, heightChecker(new int[] {5,1,2,3,4}));
	}

}
