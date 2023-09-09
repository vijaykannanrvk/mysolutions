package mysolutions.mandatoryHomeWork.foundation.Sep1stWeek.day5;

import org.junit.Assert;
import org.junit.Test;

public class SortingTheSentence {
	public String sortSentence(String s) {
        String[] sentences= s.split(" ");
        String[] newOrder=new String[sentences.length];
        int len=newOrder.length;
        for(int i=0;i<len;i++)
        {
            String temp =sentences[i];
            int length =temp.length()-1;
            newOrder[temp.charAt(length)-49]=temp.substring(0,length);
        }
        return String.join(" ",newOrder);
    }
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals("This is a sentence", sortSentence("is2 sentence4 This1 a3"));
	}
}
