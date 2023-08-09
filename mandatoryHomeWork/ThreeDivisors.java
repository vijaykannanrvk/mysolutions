package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class ThreeDivisors {
	public boolean isThree(int n) {
        int count=0;
        for(int i=2;i<n;i++)
        if(n%i==0)
        count++;
        return count==1;
        
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, isThree(2));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isThree(4));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, isThree(9));
	}
}
