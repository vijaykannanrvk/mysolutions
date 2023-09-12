package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day1;

import org.junit.Test;
import org.junit.Assert;

public class FaultyKeyboard {
	public String finalString(String s) {
        int startpos=0;
        String result="";
        while(s.indexOf('i',startpos)!=-1)
        {
            StringBuilder temp = new StringBuilder(result+s.substring(startpos,s.indexOf('i',startpos)));
            result=temp.reverse().toString();
            startpos=s.indexOf('i',startpos)+1;
        }
        return result+s.substring(startpos);
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals("rtsng", finalString("string"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("ponter", finalString("poiinter"));
	}
}
