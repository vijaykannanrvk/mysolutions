package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class CWReverse1Reverse2 {
	
	public boolean doubleReverse(int n)
	{
		int reverse1=0,reverse2=0,temp=n;
		while(n>0)
		{
			reverse1=reverse1*10+n%10;
			n=n/10;
		}
		System.out.println(reverse1);
		while(reverse1>0)
		{
			reverse2=reverse2*10+reverse1%10;
			reverse1=reverse1/10;
		}
		return reverse2==temp;
	}

	@Test
	public void test()
	{
		Assert.assertEquals(false, doubleReverse(12300));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, doubleReverse(2012));
	}
}
