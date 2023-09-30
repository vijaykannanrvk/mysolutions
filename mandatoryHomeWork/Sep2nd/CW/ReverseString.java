package mysolutions.mandatoryHomeWork.Sep2nd.CW;

import org.junit.Test;

import org.junit.Assert;

public class ReverseString {
	
	public String reverseS(String s)
	{
		int start=0;
		int end = s.length()-1;
		char[] sarray =s.toCharArray();
		while(start<end)
		{
			char temp=sarray[start];
			sarray[start] =sarray[end];
			sarray[end] =temp;
			start++;
			end--;
		}
		return new String(sarray);
	}
	
	@Test
	public void test1()
	{
	  Assert.assertEquals("yajiv", reverseS("vijay"));
	}
	
	@Test
	public void test2()
	{
	  Assert.assertEquals("nannak", reverseS("kannan"));
	}

}
