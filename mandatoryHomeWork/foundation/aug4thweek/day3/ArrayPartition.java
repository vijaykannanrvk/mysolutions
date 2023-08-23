package mysolutions.mandatoryHomeWork.foundation.aug4thweek.day3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartition {

	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, arrayPairSum(new int [] {1,4,3,2}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(9, arrayPairSum(new int [] {6,2,6,5,1,2}));
	}
}
