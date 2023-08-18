package mysolutions.mandatoryHomeWork.foundation.Aug3rdWeek.day4;

import org.junit.Test;

import org.junit.Assert;

public class SpyNumber {
	/*
	 * 1.yes
2.TestData
valid: 123,10
invalid:-123
edge cases:0
3.yes
4.O(n)
5.Psuedo Code
sum=0
product=1
while(n>0)
  sum=sum+n%10
  product=product*n%10
  n=n/10
end while
return sum==product
6.Dry run on paper
7.code in notepad

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
	*/
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
