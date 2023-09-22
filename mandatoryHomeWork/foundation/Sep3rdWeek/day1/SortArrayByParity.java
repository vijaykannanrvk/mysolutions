package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day1;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity {
	public int[] sortArrayParity(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end)
        {
            if(nums[start]%2!=0)
            {
                if(nums[end]%2==0)
                {
                    int temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                }
                else
                {
                    end--;
                }
            }
            else
            {
                start++;
            }
        }
        return nums;
    }
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {2,4,3,1}, sortArrayParity(new int[] {3,1,2,4}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int[] {0}, sortArrayParity(new int[] {0}));
	}
}
