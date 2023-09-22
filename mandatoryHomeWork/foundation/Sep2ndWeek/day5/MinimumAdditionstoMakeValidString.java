package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day5;

import org.junit.Test;

import org.junit.Assert;

public class MinimumAdditionstoMakeValidString {

	public int addMinimum(String word) {
        word=word.replace("abc","0");
        word=word.replace("ab","1");
        word=word.replace("bc","1");
        word=word.replace("ac","1");
        word=word.replace("b","2");
        word=word.replace("a","2");
        word=word.replace("c","2");
        int sum=0;
        for(int i=0;i<word.length();i++)
        {
            sum+=Integer.parseInt(word.charAt(i)+"");
        }
        return sum;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, addMinimum("b"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(6, addMinimum("aaa"));
	}
}
