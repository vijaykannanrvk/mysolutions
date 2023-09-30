package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class ValidPalindrome {
	
	public boolean isValidPalindrome(String s)
	{
		int start=0;
		s=s.toLowerCase();
		while(start<s.length()/2)
		{
			if(s.charAt(start)!=s.charAt(s.length()-1-start))
			{
				return false;
			}
			start++;
		}
		return true;
	}
	
	public boolean isValidPalindromeFromCenter(String s)
	{   int start,end;
		if(s.length()%2==0)
		{
			start=s.length()/2-1;
			end=s.length()/2;
			
		}
		else
		{
			start=s.length()/2-1;
			end=s.length()/2+1;
		}
		s=s.toLowerCase();
		while(start>=0&&end<s.length())
		{
			if(s.charAt(start)!=s.charAt(s.length()-1-start))
			{
				return false;
			}
			start--;
			end++;
		}
		return true;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isValidPalindromeFromCenter("ABCDE"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, isValidPalindromeFromCenter("ABBA"));
	}

}
