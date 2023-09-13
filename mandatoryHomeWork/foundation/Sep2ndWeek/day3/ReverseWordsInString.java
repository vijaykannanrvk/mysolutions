package mysolutions.mandatoryHomeWork.foundation.Sep2ndWeek.day3;

import org.junit.Test;

import org.junit.Assert;

public class ReverseWordsInString {
	
	public String reverseWords(String s)
	{
		StringBuilder temp =new StringBuilder(s);
		String[] splitArray = temp.reverse().toString().split(" ");
		temp =new StringBuilder("");
		for (int i = splitArray.length-1; i >0 ; i--) {
			temp.append(splitArray[i]+" ");
		}
		return temp.append(splitArray[0]).toString();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
	}
}
