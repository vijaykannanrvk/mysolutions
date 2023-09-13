package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day3;

import org.junit.Test;

import org.junit.Assert;

public class RestoreTheString {

	public String restoreString(String s, int[] indices) {
        char[] ar= new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ar[indices[i]]=s.charAt(i);
        }
        return new String(ar);
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals("leetcode", restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
	}
}
