package mysolutions.mandatoryHomeWork;

import org.junit.*;

public class StringHalvesAreAlike {
	
	/* Input String of length which is even output boolean
	 * 
	 * Split the string into equal halves 
	 * str 1 and str 2     
	 * str 1 and str 2 - Remove all consonants except vowels 
	 * comapare length of str1  and str 2 and return true if equal else false
	 * 
	 */
	    
	    @Test
	    public void test1()

	    {
	        Assert.assertEquals(false, StrVomelComp("textbook"));
	    }
	    
	    @Test
	    public void test2()

	    {
	        Assert.assertEquals(true, StrVomelComp("bOok"));
	    }

	public boolean StrVomelComp(String str)
	{
	    
	    String str1 = str.substring(0,str.length()/2);
	    String str2 = str.substring(str.length()/2);
	    str1 = str1.replaceAll("[^a,e,i,o,u,A,E,I,O,U]","");
	    str2 = str2.replaceAll("[^a,e,i,o,u,A,E,I,O,U]","");
	    
	    return str1.length()==str2.length();
	}
	 
}
