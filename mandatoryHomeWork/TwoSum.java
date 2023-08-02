package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	
	/*
	 * INPUT array of number, target number
	 * OUTPUT array of 2 numbers
	 * 
	 * TEST DATA
	 * I/P:nums = [2,7,11,15], target = 9
	 * O/P:[0,1]
	 * 
	 * I/P:nums =[-1,2,-3], target =-4
	 * O/P:[0,2]
	 * 
	 * PSUEDO CODE
	 * int[] result = int [2];
	 * for i loop 0 to array.length-1
	 *  for j = i+1 loop till array.length-1
	 *   if(array[i]+array[j]=target)
	 *     result ={i,j}
	 *     return result;
	 *    end if
	 *   end for
	 *  end for
	 *  return result;
	 *   
	 *     
	 */
	
	public int[] twosSum(int []numbers, int target)
	{
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]+numbers[j]==target)
					return new int [] {i,j};
			}
		}
		return new int[] {};
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {0,1}, twosSum(new int [] {2,7,11,15}, 9));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {1,2}, twosSum(new int [] {3,2,4}, 6));
	}
	
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] {0,2}, twosSum(new int [] {-1,2,-3}, -4));
	}

}
