package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class maximum69Number {
	
	/*
	 * Input number
	 * Output number
	 * 
//		i=1
//		changednum=0
//		while(i<10000)
//		 if(number<i)
//		    i=i/10;
//		    break;
//		 end if
//		 i=i*10
//		end while
//		while(number>0)
//		 if(number/i==6)
//		   changednum=changednum+9*i+number%i
//		   retrun changednum
//		else
//		 changednum=changednum+(number/i)*i
//		end if
//		 number=number%i
//		 i=i/10
//		end while
//		return changednumber
	 */
	
	public int maximum69Num(int number)
	{
		int changedNumber =0,i=1;
		
		while(i<=10000)
		{
			if(number<i)
			{
				i=i/10;
				break;
			}
			i=i*10;
		}
		while(number>0)
		{
			if(number/i==6)
			{
				changedNumber=changedNumber+9*i+number%i;
				return changedNumber;
			}
			else
			{
				changedNumber=changedNumber+(number/i)*i;
			}
			number= number%i;
			i=i/10;
		}
		return changedNumber;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(969, maximum69Num(669));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(9669, maximum69Num(6669));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(9999, maximum69Num(9999));
	}

}
