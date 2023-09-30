package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class ValidPalindromeNumber {
	
	public boolean IsValidPalindrome(int n)
	{
		int temp=n;
		int reverse=0;
		while(n>0)
		{
			reverse=reverse*10+n%10;
			n=n/10;
		}
		return temp==reverse;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, IsValidPalindrome(101));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, IsValidPalindrome(100));
	}

}
