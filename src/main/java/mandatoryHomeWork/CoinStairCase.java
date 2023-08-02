package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class CoinStairCase {
	
	/*
	 * INPUT number of coins
	 * OUPUT number of full stairs
	 * 
	 * TEST DATA
	 * i/p:10
	 * o/p:4
	 * 
	 * i/p:7
	 * o/p:3
	 * 
	 * i/p:0
	 * o/p:0
	 * 
	 * PSUEDO CODE
	 * int count=0;i=1;
	 * while(n>0)
	 * {
	 *  n=n-i;
	 *  if(n>0)
	 *  count++;
	 *  i++;
	 * }
	 * return count;
	 */
	

	public int noOfStairCase(int coins)
	{
		int rows=1;
		while(coins>0)
		{
			coins=coins-rows;
			if(coins>=0)
				rows++;
			else
				return rows-1;
		}
		return rows-1;
	}
	
	public int numOfStairCase(int coins)
	{
		int i=1;
		for (; i <=coins; i++) {
			coins =coins-i;
			if(coins<0)
				break;
				
		}
		return i-1;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(3, numOfStairCase(6));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(4, numOfStairCase(11));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(2, numOfStairCase(4));
	}
}
