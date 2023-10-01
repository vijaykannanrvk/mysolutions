package mysolutions.mandatoryHomeWork;

import java.util.Arrays;

public class AnagaramUsingArray {
	
	/*
	 *PSUEDO CODE
	 *Approach 1:
	 * create a number array of size  26
	 * check if the actual and jumbled string is of equal length
	 * 	loop i from 0 to actual string length -1
	 * 	increase the alphabet array position by 1 for the character at ith position in actual string
	 * 	decrease the alphabet array position by 1 for the character at ith position in jumbled string
	 * end if
	 * else
	 *  return false
	 * loop i from 0 to 25 
	 * check if any value of the alphabet array is not zero
	 * return false
	 * end loop
	 * return true
	 * 
	 * Approach 2:
	 * convert actual to char array
	 * convert jumbled to char array
	 * return array equals of actual char and jumbled array
	 * 
	 */
	public boolean isAnagaram(String actual,String jumbled)
	{
		int[] alphabets = new int[26];
		if(actual.length()==jumbled.length())
		{
			for(int i=0;i<actual.length();i++)
			{
				alphabets[actual.charAt(i)-'a']+=1;
				alphabets[jumbled.charAt(i)-'a']-=1;
			}
		}
		else
			return false;
		for(int i=0;i<alphabets.length;i++)
		{
			if(alphabets[i]!=0)
				return false;
		}
		return true;
		
	}
	
	public boolean isAnagaramCharArray(String actual,String jumbled)
	{
		char[] actualArray = actual.toCharArray();
		char[] jumbledArray = jumbled.toCharArray();
		Arrays.sort(actualArray);
		Arrays.sort(jumbledArray);
		return Arrays.equals(actualArray, jumbledArray);
	}

}
