package mysolutions.mandatoryHomeWork;

import org.junit.*;

public class Anagaram {
	
	/*
	 * INPUT two strings
	 * OUTPUT true or false
	 * 
	 *loop take every character from string1
	 * replace first matching character in the string2
	 * end loop
	 * return if string2 equal to null 
	 */ 

	public boolean isAnagaram(String actual, String jumbled)
	{
		if (actual.length() != jumbled.length())
			return false;
		int i=0;
		while(actual.length()>i)
		{
			jumbled=jumbled.replaceFirst(actual.charAt(i)+"", "");
			i++;
		}
		return jumbled.equals("");
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isAnagaram("anagram", "nagaram"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, isAnagaram("rat", "car"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isAnagaram("ab", "a"));
	}
}
