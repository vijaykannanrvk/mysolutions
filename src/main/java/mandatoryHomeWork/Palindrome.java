package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {
	
	/*
	 * INPUT number
	 * OUTPUT true or false
	 * 
	 * TEST DATA:
	 * I/P:1221
	 * O/P: true
	 * 
	 * I/P:-121
	 * O/P: false
	 * 
	 * I/P:0
	 * O/P:true
	 * 
	 * PSEUDO CODE
	 * temp = number
	 * reverse =0
	 * while(number>0)
	 *  reverse =reverse *10+ number%10
	 *  number =number/10
	 * end while
	 * if temp == reverse
	 *  return true;
	 * else 
	 *  return false;
	 */
	static int result;
	public boolean isPalindrome(int number)
	{
		int temp = number;
		int reverse=0;
		if(number>0)
			reverse=reverse(number);
//		while(number>0)
//		{
//			reverse = reverse*10+ number%10;
//			number =number/10;
//		}
		System.out.println(reverse);
		return temp == reverse;
	}
	
	public int reverse(int number)
	{
		if(number==0)
		{
			return number;
		}
		else
		{
			result =result*10+number%10;
			reverse(number/10);
			return result;
		}
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true,isPalindrome(1221));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false,isPalindrome(-121));
	}

	@Test
	public void test3()
	{
		Assert.assertEquals(true,isPalindrome(0));
	}
}
