package mysolutions.mandatoryHomeWork.Aug4thweekend.day1;

import org.junit.Test;

import org.junit.Assert;

public class ReplaceVowels {
	
	/*
	 * 1.yes
	 * 2. Test Data
	 * i/p:null
	 * o/P:null
	 * i/P: hi testleaf
	 * o/p:h tstlf
	 * i/P: bcdgjgl
	 * o/P:bcdgjgl
	 * 3.yes
	 * 4.yes
	 * 5.pseudo code
	 * * input s="Hi testleaf"
	 * * s.replaceAll("aeiou","")
	 */
	
	public String replaceAllVowels(String s)
	{
		return s.replaceAll("[aeiouAEIOU]","");		
	}
	
	public StringBuilder replaceAllVowels(StringBuilder s)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'))
			{
				result.append(s.charAt(i));
			}
		}
		return result;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(new StringBuilder("h tstlf"), replaceAllVowels(new StringBuilder("hi testleaf")));
	}
}
