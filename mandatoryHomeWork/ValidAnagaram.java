package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class ValidAnagaram {
 
	public boolean isAnagaram(String s1,String s2)
	{
		for (int i = 0; i < s1.length(); i++) {
			if(s2.indexOf(s1.charAt(i))!=-1)
				s2=s2.substring(0,s2.indexOf(s1.charAt(i)))+s2.substring(s2.indexOf(s1.charAt(i))+1);
		}
		return s2.isEmpty();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isAnagaram("anagram", "nagaram"));//garam
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isAnagaram("abcez", "zebca"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isAnagaram("rat", "car"));
	}
}
