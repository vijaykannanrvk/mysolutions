package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class MoveZerosToLast {
	
	/*
	 * INPUT array of numbers
	 * OUTPUT array of numbers
	 * 
	 * PSEUDO CODE
	 * for i loop from 0 to array.length-1
	 * if array[i]==0
	 *  for j=i loop from i to array.length-2
	 *   array[i]==array[i+1]
	 *  end for
	 *  array[array.length-1]=0
	 * end if
	 *end for
	 *
	 *PSUEDO CODE1
	 *start =0(start of array)
	 *end = array.length-1(end of array)
	 *while(start<=end)
	 * if(array[start]==0)
	 *  if(array[end]!=0)
	 *    array[start]=array[end]
	 *    array[end]=0
	 *    start++
	 *    end--
	 *   else
	 *    end--
	 *   endif
	 *  else
	 *   start++
	 * endif
	 *end while
	 * 
	 *  
	 */
	
	public void Move0toLast(int []nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0)
			{
				for (int j = i; j < nums.length-1; j++) {
					nums[j]=nums[j+1];
				}
				i--;
				nums[nums.length-1]=0;
			}
		}	
	}
	
	public void moveZeroToLast(int [] nums)
	{
		int start =0,end  = nums.length-1;
		while(start<=end)
		{
			if(nums[start]==0)
			{
				if(nums[end]!=0)
				{
					nums[start]=nums[end];
					nums[end]=0;
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
	}
	
	@Test
	public void test1()
	{
		int[] nums = {0,0,1,2,3,0};
		moveZeroToLast(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
