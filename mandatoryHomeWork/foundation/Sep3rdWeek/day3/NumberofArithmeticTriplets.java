package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day3;

import org.junit.Assert;
import org.junit.Test;

public class NumberofArithmeticTriplets {

	public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        for(int i=0;i<=nums.length-3;i++)
        for(int j=0;j<=nums.length-2;j++)
        for(int k=0;k<=nums.length-1;k++)
        if(nums[k]-nums[j]==diff&&nums[j]-nums[i]==diff)
        count++;
        return count;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, arithmeticTriplets(new int[] {0,1,4,6,7,10},3));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, arithmeticTriplets(new int[] {4,5,6,7,8,9},2));
	}
}
