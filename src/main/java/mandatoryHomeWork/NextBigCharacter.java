package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class NextBigCharacter {
	/*
	 * INPUT array of character, character
	 * OUTPUT character
	 * 
	 * I/P: ch[]={'d','f',h'}, 'e'
	 * O/P: 'f'
	 * 
	 * I/P: ch[] ={},'a'
	 * O/P: null
	 * 
	 * I/P: ch[]={'a','z'}, 'b'
	 * O/P: 'z'
	 * 
	 * PSUEDO CODE
	 * for i loop from 0 to array.length-1
	 *  if ar[i]>e
	 *   return ar[i]
	 *   end if
	 * end for
	 * return null 
	 */
	
	public char nextBigChar(char[] characters,char character)
	{
		for (int i = 0; i < characters.length; i++) {
			if(characters[i]>character)
				return characters[i];
		}
		return (Character) null;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals('f', nextBigChar(new char[] {'d','f','h'}, 'e'));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals('z', nextBigChar(new char[] {'a','z'}, 'g'));
	}

}
