package mysolutions.mandatoryHomeWork;

import org.junit.*;

public class MergeStringsAlternately {
	
	/*
	 * INPUT string word1 and string word2
	 * OUTPUT mergedWord
	 * 
	 * PSEUDO CODE
	 * mergedword = ""
	 * length = smallest length of word1 and word2
	 * for loop i from 0 to length-1
	 *  mergedword = mergedword + word1.charAt(i)+word2.charAt(i)
	 * end for
	 * if(word1.Length()<word2.Lenght())
	 *   mergedword =mergedword+word2.substring(i)
	 *  else
	 *   mergedword =mergedword+word1.substring(i)
	 *  endif
	 * return mergedword
	 */
	
	public String mergeAlternately(String word1, String word2) {
        String mergedString ="";
        int length = word1.length()<word2.length()?word1.length():word2.length();
        int i=0;
        for(i=0;i<length;i++)
        {
            mergedString=mergedString+word1.charAt(i)+word2.charAt(i);
        }
        if(word1.length()<word2.length())
        {
            mergedString =mergedString+ word2.substring(i);
        }
        else
        {
            mergedString =mergedString+ word1.substring(i);
        }
        return mergedString;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals("apbqcr",mergeAlternately("abc", "pqr"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("apbqrs",mergeAlternately("ab", "pqrs"));
	}

}
