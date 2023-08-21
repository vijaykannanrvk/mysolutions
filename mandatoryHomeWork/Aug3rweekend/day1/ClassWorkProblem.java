package mysolutions.mandatoryHomeWork.Aug3rweekend.day1;

import org.junit.Assert;
import org.junit.Test;

public class ClassWorkProblem {
	
	/*
    Given two array, arr1, and arr2
    Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2
     
     arr1 = {1,2,3,4} , arr2 = {2,3,4,5}
     
     output = {
     3+4+5-1,
     2+4+5-2,
     2+3+5-3,
     2+3+4-4     
     */

	public int [] arraySum(int []a,int b[])
	{
		int [] sum;
		if(a.length>b.length)
		sum = new int[a.length];
		else
		sum = new int[b.length];
		int temp=0;
		for(int i=0;i<b.length;i++)
		{
			temp=temp+b[i];
		}
		for(int i=0;i<sum.length;i++)
		{
			if(i<a.length&&i<b.length)
			sum[i]=temp-b[i]-a[i];
			else if(i<a.length)
				sum[i]=temp-a[i];
			else if(i<b.length)
				sum[i]=temp-b[i];
		}
		return sum;
	}
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {11,9,7,5,9}, arraySum(new int[] {1,2,3,4,5}, new int[] {2,3,4,5}));
	}
}
