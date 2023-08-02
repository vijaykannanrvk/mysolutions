package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import java.util.Arrays;

import org.junit.*;

public class TargetElement {
	
	/*
	 * INPUT array of numbers and target number
	 * OUTPUT array without target numbers
	 * 
	 * PSUEDO CODE
	 * int reducedlength = array.length
	 * for i loop from 0 to array.length-1
	 *  if(array[i]==target)
	 *    reducedlength--;
	 *  end if
	 * end for
	 * if(reducedlength!=array.length)
	 *  int [] result=new int[reducedlength]
	 *  int k=0
	 *  for i loop from 0 to array.length-1
	 *    if(array[i]!=target)
	 *     result[k]=array[i]
	 *     k++
	 *    end if
	 *  end for
	 *  return result
	 * end if
	 * return array 
	 *     
	 */
	
	public int[] RemoveTarget(int [] nums,int target)
	{
		int[] reducedArray= Arrays.stream(nums).filter(s->s!=target).toArray();
		return reducedArray;
	}
	
	public int[] RemoveTargetElement(int[] numbers,int target)
	{
		int reducedLength = numbers.length;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==target)
				reducedLength--;
		}
		
		if(reducedLength != numbers.length)
		{
			int [] result = new int[reducedLength];
		    int k=0;
			for (int i = 0; i < numbers.length; i++) {
				if(numbers[i]!=target) {
				result[k] = numbers[i];
				k++;
				}
			}
			return result;
		}
		return numbers;
	}
	
	public int[] DeleteTargetElement(int []nums,int target)
	{
		int decrement=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				decrement++;
				for(int j=i;j<nums.length-decrement;j++)
				{
					nums[j]=nums[j+1];
					i--;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(decrement);
		nums= new int[nums.length-decrement];
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		return nums;
	}
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int [] {1,3}, RemoveTarget(new int[] {1,2,2,3}, 2));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int [] {}, RemoveTarget(new int[] {2,2}, 2));
	}

}
