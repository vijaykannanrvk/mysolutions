package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class CountOfOne {

	public int CountOf1(int [] numbers) //[0,0,0,1,1] =>5
	{
		for(int i=numbers.length-1;i>=0;i--)
		{
			if(numbers[i]!=1)
			{
				return numbers.length-1-i;
			}
		}
		return 0;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2,CountOf1(new int[] {0,0,0,1,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2,CountOf1(new int[] {0,0,0,1,1}));
	}
}
