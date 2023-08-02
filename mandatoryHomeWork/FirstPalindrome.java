package mysolutions.mandatoryHomeWork;

import org.junit.*;


public class FirstPalindrome {
	
	public boolean isStringPalindrom(String input)
	{
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
	
	public String isStringsPalindrome(String [] intput)
	{
		for (String string : intput) {
			if(isStringPalindrom(string))
				return string;
		}
		return "";
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("ada", isStringsPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("racecar", isStringsPalindrome(new String[] {"notapalindrome","racecar"}));
	}

}
