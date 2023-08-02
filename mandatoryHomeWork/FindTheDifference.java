package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDifference {
	
	/*
	 * PSEUDO CODE
	 * traverse through the string every character in s
	 *  remove the character first occurence in the t
	 * return t.charAt(0)
	 */
	
	public char charDifference(String s,String t)
	{
		for(int i=0 ;i<s.length();i++)
		{
			t=t.replaceFirst(s.charAt(i)+"", "");
		}
		//System.out.println(t);
		return t.charAt(0);
	}
	
	@Test
	public void test1()
	{
		//System.out.println(charDifference("abcd", "acbde"));
		Assert.assertEquals('e',charDifference("abcd", "acbde"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals('a',charDifference("a", "aa"));
	}

}
