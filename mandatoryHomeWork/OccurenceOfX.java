package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class OccurenceOfX {
	
	/*
	 * INPUT array of numbers, x number
	 * OUTPUT count
	 * 
	 * TEST DATA
	 * i/p ar[]= {1,1,2,2,2,3},x=2
	 * o/p 3
	 * 
	 * i/p ar[]= {},x=2
	 * o/p 0
	 * 
	 * i/p ar[]={-1,0,0,0,1},x=1
	 * o/p 1
	 * 
	 * PSUEDO CODE
	 * count =0
	 * for i loop from o to array.length-1
	 *  if array[i]==x
	 *   count++
	 *  end if
	 * end for
	 * return count
	 */
	
	
	public int occurenceOfX(int []nums,int target)
	{
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(count!=0)
			if(nums[i]==target)
			{
				count++;
			}
			else
				return count;
			else
			if(nums[i]==target)
			{
				count++;
			}			
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, occurenceOfX(new int[] {1,1,2,2,2,3}, 2));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, occurenceOfX(new int[] {}, 0));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(2, occurenceOfX(new int[2], 0));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(1, occurenceOfX(new int[] {-1,0,0,0,1}, 1));
	}

}
