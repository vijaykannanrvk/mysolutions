package mysolutions.mandatoryHomeWork.foundation.Sep3rdWeek.day2;

import org.junit.Assert;
import org.junit.Test;

public class NumOfSubarrays {

	public int numOfSubarray(int[] arr, int k, int threshold) {
        int count=0,sum=0;
        for(int i=0;i<=arr.length-k;i++)
        {
            if(i==0)
            for(int j=0;j<k;j++)
            sum+=arr[j];
            else
            sum=sum-arr[i-1]+arr[i+k-1];

            if(sum/k>=threshold)
            count++;
        }
        return count;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, numOfSubarray(new int[] {2,2,2,2,5,5,5,8},3,4));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(6, numOfSubarray(new int[] {11,13,17,23,29,31,7,5,2,3},3,5));
	}
}
