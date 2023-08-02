package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class StairCaseProbals {
	
	/*
	 * INPUT number of stair case
	 * OUTPUT number of probals
	 * 
	 * TESTDATA
	 * I/P: 1
	 * O/P: 1
	 * 
	 * i=>2
	 * o=>2
	 * 
	 * i=>3
	 * o=>3
	 * 
	 * i=>4
	 * o=>5
	 * 
	 * i=>5
	 * o=>8
	 * 
	 * Understanding: from output are the fibanocci series numbers
	 * PSUEDO CODE
	 * number1=1
	 * number=2=2
	 * for(int i=3;i<=n;i++)
	 *   number2=number1+number2
	 *   number1=number2-number1
	 * 
	 * retrun number2
	 */

	
	public int stairsPorbals(int stairs)
	{
		int number1=1,number2=2;
		for(int i=3;i<=stairs;i++)
		{
			number2=number1+number2;
			number1=number2-number1;
		}
		return number2;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(13, stairsPorbals(6));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(34, stairsPorbals(8));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(144, stairsPorbals(11));
	}
}
