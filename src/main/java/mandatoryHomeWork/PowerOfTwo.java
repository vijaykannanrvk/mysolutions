package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo {
	
	/*
	 * INPUT number
	 * OUTPUT boolean
	 * 
	 * PSUEDO CODE
	 * 
	 * while(number>1)
	 *  if number%2==0
	 *   number =number/2
	 *  else
	 *   return false
	 *  end if
	 * end while
	 *  if(number==1)
	 *    return true;
	 *  end if
	 * 
	 */
	
	public boolean TwoPower(int number)
	{
		while(number>1)
		{
			if(number%2==0)
				number=number/2;
			else
				return false;
		}
		if(number==1)
		{
			return true;
		}
		return false;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, TwoPower(8));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, TwoPower(1));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, TwoPower(31));
	}

}
