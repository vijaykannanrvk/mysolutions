package mandatoryHomeWork;

import org.junit.*;

public class AllAsAreAfterB {
	
	/*
	 * INPUT string
	 * OUPTUT true
	 * 
	 * PSUEDO CODE
	 *  if last index of b ==-1 return false 
	 *  return last index of a< first index of b
	 *  
	 */
	
	public boolean AllAafterB(String s)
	{
		if(s.indexOf('b')==-1)
			return true;
		else
			return s.lastIndexOf('a')<s.indexOf('b');
	}
	
	public boolean AllAafterBs(String s)
	{
		return !s.contains("ba");
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, AllAafterBs("abab"));
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(true, AllAafterBs("aaa"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, AllAafterBs("bbb"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(true, AllAafterBs("aaabbb"));
	}

}
