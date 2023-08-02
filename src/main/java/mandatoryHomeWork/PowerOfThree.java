package mandatoryHomeWork;

import org.junit.*;

public class PowerOfThree {
	
	/*
	 * INPUT number
	 * OUTPUT boolean ->true or false
	 * 
	 * TEST DATA
	 * I/P: 81
	 * O/P: true
	 * 
	 * I/P: 85
	 * O/P: false
	 * 
	 * PSEUDO CODE
	 * while(n>0)
	 *  if(n%3!=0)
	 *   return false
	 *  end if
	 * end while
	 * return true
	 */  
	
	public boolean isPowerOfThree(int number)
	{
		while(number>2)
		{
			if(number%3!=0)
				return false;
			number= number/3;
		}
		return true;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, isPowerOfThree(85));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isPowerOfThree(81));
	}


}
