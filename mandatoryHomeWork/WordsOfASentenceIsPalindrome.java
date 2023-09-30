package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class WordsOfASentenceIsPalindrome {
	public boolean[] isValidPalindrome(String s)
	{
		String[] sarray = s.split(" ");
		boolean[] output = new boolean[sarray.length];
		for(int i=0;i<sarray.length;i++)
		{
		int start=0;
		if(sarray[i].length()==1)
			output[i]=true;
		else
		{
		sarray[i]=sarray[i].toLowerCase();
		System.out.println(sarray[i]);
		while(start<sarray[i].length()/2)
		{
			System.out.println(sarray[i].charAt(start)+":"+sarray[i].charAt(sarray[i].length()-1-start));
			if(Character.toLowerCase(sarray[i].charAt(start))!=Character.toLowerCase(sarray[i].charAt(sarray[i].length()-1-start)))
			{
				output[i]=false;
				break;
			}
			start++;
			output[i]=true;
		}
		}
		}
		return output;
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new boolean[] {false,false,true,true}, isValidPalindrome("this is a Tst"));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new boolean[] {false,false,true,false}, isValidPalindrome("this is a Test"));
	}
	
	
}
