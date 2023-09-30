package mysolutions.mandatoryHomeWork.foundation.Sep4thWeek.day6;

import org.junit.Test;

public class FindTheIndex {
	
	public int findtheIndexOfHash(String s)
	{
		int size=16;
		int n = s.hashCode();
		int r = n>>>16;
		int index= r&size-1;
		System.out.println(n);
		System.out.println(r);
		System.out.println(index);
		return index;
	}
	
	@Test
	public void test1()
	{
		findtheIndexOfHash("SizeOfTheArray");
	}

}
