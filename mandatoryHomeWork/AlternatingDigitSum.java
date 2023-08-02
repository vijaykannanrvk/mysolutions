package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class AlternatingDigitSum {
	
	/*
	 * INPUT n=521
	 * OUTPUT 4
	 * 
	 * PSEUDO CODE
	 * numofdigits =10
	 * while(numofdigits>n)
	 * {
	 * 	numofdigits=numofdigits*10
	 * }
	 * numofdigits=numofdigits/10
	 * 
	 * counter=1
	 * sum=0;
	 * while(n>0)
	 * {
	 *  if(counter%2==0)
	 *  {
	 *  sum=sum-n/numofdigits;
	 *  n=n%numofdigits
	 *  numofdigits=numofdigits/10
	 *  }
	 * }
	 */
	
public int alternateDigitSum(int n) {
        int numOfDigits=10;//541 100
        while(n>=numOfDigits)
        {
        	numOfDigits =numOfDigits*10;
        }
        System.out.println(numOfDigits);
        numOfDigits/=10;
        int counter =1,sum=0;
        while(n>0)
        {
        	if(counter%2==0)
        	{
        		sum=sum-n/numOfDigits;
        	}
        	else
        	{
        		sum=sum+n/numOfDigits;
        	}
        	n=n%numOfDigits;
        	numOfDigits=numOfDigits/10;
        	counter++;
        }
        return sum;
    }

	@Test
	public void test1()
	{
		Assert.assertEquals(0, alternateDigitSum(99999999));
	}

}
