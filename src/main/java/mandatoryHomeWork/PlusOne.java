package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne {
	/*
	 * INPUT array numbers
	 * OUTPUT array numbers
	 * 
	 * PSUEDO CODE 
	 * String s="";
	 * for i loop from 0 to array .length-1
	 *  s=s+array[i];
	 * numb =Integer.ParseInt(s)
	 * if(numb ==9||numb=99||numb=999||numb=9999)
	 * newarray[array.length+1]
	 * else
	 * newarray[array.length]
	 * numb =numb+1;
	 * 
	 * string s= numb.Tostring()
	 * for i loop from 0 to string length-1
	 *   newarray[i]= Integer.ParseInt(s.chartat(i))
	 *  end for
	 *  retrun newarray
	 */
	public int[] plus1(int[] numbers) //889 890
	{
		String s="";
		for (int i = 0; i < numbers.length; i++) {
		s=s+numbers[i];	
		}
		int num = Integer.parseInt(s);
		int []res;
		if(num==9||num==99||num==999||num==9999)
		{
			res = new int[numbers.length+1];
		}
		else
			res = new int[numbers.length];
		num =  num+1;
		String temp = num+"";
		for (int i = 0; i < res.length; i++) {
			res[i]=  (int)temp.charAt(i) -48;
		}
		return res;
	}
	
	public int[] plusonee(int[] numbers)
	{
		for (int i = numbers.length-1; i > -1; i--) {
			if(numbers[i]<9)
			{
				numbers[i]++;
				return numbers;
			}
			numbers[i]=0;
		}
		int [] result = new int[numbers.length+1];
		result[0]=1;
		return result;
	}
    
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int [] {1,2,4}, plusonee(new int [] {1,2,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int [] {1,0,0,0}, plusonee(new int [] {9,9,9}));
	}
}
