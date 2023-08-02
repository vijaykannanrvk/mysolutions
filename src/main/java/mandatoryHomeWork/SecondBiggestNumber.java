package mandatoryHomeWork;

import org.junit.*;

public class SecondBiggestNumber {
	//traverse through array and take every character
    // check the ascii range for numbers
    //if big1<number
    // big2=big1
    // big1 = number
    // else if big2<number
    //big2= number
    //end if
    //return big2
	
	
	public int secondHighest(String s) {
        int big1=-1,big2=-2,i=0;
        for(i =0;i<s.length();i++)
        {
            if(s.charAt(i)>47 && s.charAt(i)<58)
            {
                if(big1<(s.charAt(i)-48))
                {
                    big2=big1;
                    big1=s.charAt(i)-48;
                }
                else if(big2<(s.charAt(i)-48)&&(s.charAt(i)-48)!=big1)
                {
                    big2=s.charAt(i)-48;
                }
            }
        }
        if(big2==-2)
        return -1;
        return big2;
    }
	
	@Test
	public void test1() {
		Assert.assertEquals(-1, secondHighest("abcdefgh"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, secondHighest("ab1d2f3h"));
	}

}
