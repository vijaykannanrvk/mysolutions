package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumber {
	
	/*
	 * INPUT number
	 * OUTPUT boolean
	 * 
	 * PSUEDO CODE
	 * input number
	 * for i loop from 2 to number/2
	 *   if number divided by i reminder is 0
	 *    return false
	 *   end if
	 *  end for
	 *  return true  
	 */
	
	/*
	 * PSUEDO Code
if n>1 && n<1000
  for loop i from 2 to n/2
     if n%i==0
       return false
  end for
return true
	 */
	
	public boolean isPrimes(int num)
	{
		if(num>1&&num<=1000)
		{
			for(int i=2;i<=num/2;i++)
				if(num%2==0)
					return false;
		}
		return true;
	}
	
	public boolean isPrime(int number)
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isPrime(3));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, isPrime(50));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, isPrime(-591));
	}

}
