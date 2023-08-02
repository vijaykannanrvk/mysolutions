package mandatoryHomeWork;

import org.junit.*;


public class LengthofLastWord {
	
	/*
	 * INPUT string
	 * OUPUT length of the last word
	 * 
	 * 
	 * PSEUDO CODE
	 * Find the last index of the space
	 * return the length-last index-1
	 */

	public int LengthOfLastWord(String s)
	{
		return s.trim().length()-s.trim().lastIndexOf(' ')-1;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(5, LengthOfLastWord("Hello World"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(4, LengthOfLastWord("   fly me   to   the moon  "));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(6, LengthOfLastWord("luffy is still joyboy"));
	}
}
