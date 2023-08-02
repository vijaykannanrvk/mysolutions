package mandatoryHomeWork;

import org.junit.*;


public class StringPalindrome {
	
	/*
     * input - blank, only alphanumeric, phrase, phrase with special characters, valid paliandrome.
     * pcode:
     * 1. convert to lowercase
     * 2. regex 
     * 3. convert it a char array / User charAt index;
     * 4. lopp through all the indices and reverse the string
     * 5. compare both and return result.
     * 
     */
	
	
	public boolean isStringPalindrom(String input)
	{
		input =input.toLowerCase();
		input =input.replaceAll("[^a-zA-Z0-9]", "");
		int start=0,end = input.length()-1;
		while(start<=end)
		{
			if(input.charAt(start)!=input.charAt(end))
				return false;
			start++;
			end--;
		}
		
		return true;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, isStringPalindrom("race a car"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isStringPalindrom("A man, a plan, a canal: Panama"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, isStringPalindrom("A"));
	}

}
