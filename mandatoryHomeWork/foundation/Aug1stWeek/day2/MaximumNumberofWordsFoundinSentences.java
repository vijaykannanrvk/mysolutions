package mysolutions.mandatoryHomeWork.foundation.Aug1stWeek.day2;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class MaximumNumberofWordsFoundinSentences {
	public int mostWordsFound(String[] sentences) {
        int big=0;
        for(int i=0;i<sentences.length;i++)
        {
            if(big<sentences[i].split(" ").length)
            big=sentences[i].split(" ").length;
        }
        return big;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(6, mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
	}
}
