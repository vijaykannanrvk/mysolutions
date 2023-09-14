package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import org.junit.Assert;

public class DigitCountEqual {

	public boolean digitCount(String num) {
        Map<Integer,Integer> myMap = new HashMap<Integer, Integer>();
        for(int i=0;i<num.length();i++)
        {
            myMap.put(num.charAt(i)-48,myMap.getOrDefault(num.charAt(i)-48,0)+1);
        }
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)!=myMap.getOrDefault(i,0)+48)
            {
                return false;
            }
        }
        return true;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, digitCount("1210"));
	}
}
