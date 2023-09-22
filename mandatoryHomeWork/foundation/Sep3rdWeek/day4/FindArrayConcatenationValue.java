package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day4;

import org.junit.Assert;
import org.junit.Test;

public class FindArrayConcatenationValue {
	public long findTheArrayConcVal(int[] nums) {
        int start=0,end=nums.length-1;
        long sum=0;
        while(start<end)
        {
            String temp =nums[start]+""+nums[end];
            sum+=Integer.parseInt(temp);
            start++;
            end--;
        }
        if(start==end)
        {
          sum+=nums[start];  
        }
        return sum;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(59, findTheArrayConcVal(new int[] {7,52,2,4}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(673, findTheArrayConcVal(new int[] {5,14,13,8,12}));
	}
}
