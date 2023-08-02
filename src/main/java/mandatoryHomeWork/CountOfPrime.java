package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class CountOfPrime {
	
	/*
	 * INPUT number 10
	 * OUTPUT NUMBER
	 * 
	 * PSUEDO CODE
	 * int input =10;
	 * int count =0;
	 * int j=1
	 * while j<=input
	 * for i loop from 2 to j/2
	 *   if j divided by i reminder is 0
	 *    continue
	 *   end if
	 *  end for
	 *  count++ 
	 *  j++
	 *  end while
	 *  return count 
	 */
	
	public int isPrime(int number)
	{
		//number =10 [1,2,3,4,5,6,7,8,9,10]
		int j=2;
		int count=0;
		while(j<=number)
		//for(int j=2;j<=number;j++)
		{	
			int i=2;
		   for(;i<Math.sqrt(j);i++)
		   {
			   if(j%i==0)
			   {
				   break;
			   }
		   }
		   if(i>Math.sqrt(j))
		   count++;
		   j++;
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, isPrime(3));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(4, isPrime(10));
	}

}
