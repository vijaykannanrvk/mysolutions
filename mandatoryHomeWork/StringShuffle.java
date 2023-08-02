package mysolutions.mandatoryHomeWork;

import org.junit.*;


public class StringShuffle {
	
	/*
	 * PSEUDO CODE
	 * char ar[] = new char[s.length]
	 * for loop i from 0 to s.length-1
	 *  ar[indices[i]]=s.charAt(i)
	 * endfor
	 * return char array to string
	 * 
	 */
	
	public String shuffleString(String s,int[] indices)
	{
		char[] ar= new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ar[indices[i]]=s.charAt(i);
        }
        return new String(ar);
	}
	
	@Test
	public void test1()														
	{												 //01234567			   //0,1,2,3,4,5,6,7  //4,6,5,7,0,1,2,3   	
		Assert.assertEquals("leetcode", shuffleString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("abc", shuffleString("abc", new int[] {0,1,2}));
	}

}
