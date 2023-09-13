package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day2;

import org.junit.Test;

import org.junit.Assert;

public class NumberOfLinesAlphabet {
	public int[] numberOfLines(int[] widths, String s) {
        int line=1,sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=widths[s.charAt(i)-97];
            if(sum>100)
            {
                line++;
                sum=widths[s.charAt(i)-97];
            }
        }
        return new int[]{line,sum};
    }
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int[] {3,60}, numberOfLines(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"abcdefghijklmnopqrstuvwxyz"));
	}
}
