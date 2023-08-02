package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumber {

	
	/*
	 * INPUT array of numbers
	 * OUTPUT number
	 * 
	 * PSUEDO CODE
	 * for i loop from 0 to array.length-2
	 *  for j loop from i+1 to array.length-1
	 *   if(array[i]==array[j])
	 *    i++
	 *    j=0
	 *   end if
	 *  end for
	 *  return array[i]
	 *  end for
	 *  
	 */
	
	public int isSingleNumber(int [] numbers)
	{
		int i=0;
			for (int j = 0; j < numbers.length && i<numbers.length; j++) {
				if(i!=j)
				{
					if(numbers[i]==numbers[j])
					{
						i++;
						j=-1;							
					}
				}
			}
			return numbers[i];			
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, isSingleNumber(new int[] {2,2,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(4, isSingleNumber(new int[] {4,1,2,1,2}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1, isSingleNumber(new int[] {1}));
	}
}
