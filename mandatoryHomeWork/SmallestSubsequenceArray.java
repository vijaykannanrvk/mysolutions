package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class SmallestSubsequenceArray {
	
	public int isSmallestSubsequenceArray(int[] nums,int k)
	{
		int start=0,end=start-1,sum=0,subarraySize=Integer.MAX_VALUE;
		while(end<nums.length)
		{
			if(sum<k)
			{
			end++;
			sum=sum+nums[end];
			}
			else
			{
			sum=sum-nums[start];
			start++;
			}
			if(sum>k)
				subarraySize=subarraySize>(end-start-1)?(end-start-1):subarraySize;				
			if(subarraySize==-1)
					return 1;
			System.out.println(sum);
			System.out.println(subarraySize);			
			System.out.println(start+":"+end);
		}
		return subarraySize>(end-start-1)?(end-start-1):subarraySize;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, isSmallestSubsequenceArray(new int[] {1,2,3,4,5},10));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, isSmallestSubsequenceArray(new int[] {4,2,7,11,7,6,25},20));
	}

}
