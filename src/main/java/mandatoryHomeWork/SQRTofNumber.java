package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class SQRTofNumber {

	public int mySqrt(int x) {
		if(x<2)
			return x;
		int i=1;
	       for( i=1;i<=x/2+1;i++)
	       {
	           if(i*i==x)
	               return i;
	           else if(i*i>x||i*i<0)
	            return i-1;
	       }
	       return 0;
	    }
	
	@Test
	public void test1()//2,14,73,95,600
	{
		Assert.assertEquals(46340,mySqrt(2147483647));
	}
	
	@Test
	public void test2()//2,14,73,95,600
	{
		Assert.assertEquals(14654,mySqrt(214748364));
	}
}
