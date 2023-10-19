package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day4;

import org.junit.Test;
import org.junit.Assert;

public class RemoveAllAdjancentStrings {
	public String removeDuplicates(String s) {
        int start=0,end=1;
        while(start<s.length()&&end<s.length())
        {

            if(s.charAt(start)==s.charAt(end))
            {
                s=s.substring(0,start)+s.substring(end+1);
                if(start>0)
                --start;
                else
                start=0;
                end=start+1;
            }
            else
            {
                start++;
                end=start+1;
            }
        }
        return s;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals("aca", removeDuplicates("abbaaca"));
	}
}
