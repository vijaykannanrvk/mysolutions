package mysolutions.mandatoryHomeWork.foundation;

import org.junit.Test;

import org.junit.Assert;

public class SpyNumber {

	public boolean isSpyNumber(int n)
	{
	int sum=0,product=1;
	if(n>10)
	while(n>0)
	{
	 sum+=n%10;
	 product*=n%10;
	 n/=10;
	}
	else if(n>-1)
	return true;
	return sum==product;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isSpyNumber(123));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isSpyNumber(1124));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isSpyNumber(100));
	}
}
