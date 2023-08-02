package mandatoryHomeWork;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Duplicates {
	
	/*
	 * INPUT array of numbers
	 * OUTPUT boolean
	 * 
	 * PSUEDO CODE
	 * HashSet<int>
	 * for loop from 0 to array.length-1
	 *   if !set.add(array[i])
	 *    return true
	 *   end if
	 *  end for
	 * return false
	 * 
	 */
	
	public boolean isDuplicate(int []numbers)
	{
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if(!set.add(numbers[i]))
				return true;
		}
		return false;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(true, isDuplicate(new int[] {1,2,3,1}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isDuplicate(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, isDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}

}
