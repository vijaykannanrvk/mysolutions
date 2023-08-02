package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigits {
	
	/*
	 * INPUT number
	 * OUTPUT number
	 * 
	 * TEST DATA
	 * I/P:123
	 * O/P:6
	 * 
	 * I/P:0
	 * O/P:0
	 * 
	 * I/P:1234590
	 * O/P:6
	 * 
	 * PSEUDO CODE
	 * if number>0
	 *  total= total+number%10
	 *  if number/10 !=0
	 *  recurse function number/10
	 *  else
	 *   if total>9
	 *   number=total
	 *   total=0
	 *   recurse function by number
	 */
	
	static int total=0;
	
	public int addDigit(int number)
	{
		if(number>0)
		{
			total=total+number%10;
			if(number/10!=0)
			addDigit(number/10);
			else if(total>9)
			{
				number=total;
				total=0;
				addDigit(number);
			}
		}
		return total;
	}
	
	public int addDigits(int number)
	{
		if(number==0)
				return number;
		else
			return number%9!=0?number%9:9;
		
	}
	
	public int addDigitss(int number)
	{
		int total=0;
		if(number<0)
		{
			number = number*-1;
			while(number>0)
			{
				if(number/10==0)
					total=total-number;
				else
					total =total+number%10;
				number=number/10;
			}
		}
		return total;
			
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0,addDigitss(-101));
	}
	

}
