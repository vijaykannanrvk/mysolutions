package mandatoryHomeWork;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzz {
	
	/*
	 * INPUT number
	 * OUPUT string array
	 * 
	 * PSUEDO CODE
	 * array[number]
	 * for i loop from 1 to number
	 *  if i%3==0 && i%5==0
	 *    array[i-1]="FizzBuzz"
	 *  else if i%3==0
	 *    array[i] ="Fizz"
	 *  else if i%5==0
	 *     array[i]= "Buzz"
	 *  else
	 *     array[i]=i
	 *   end if
	 *  end for
	 * return array 
	 */

	public String[] fizzBuzzz(int number)
	{
		String[] array=new String[number];
		for (int i = 1; i <= number; i++) {
			if(i%3==0&&i%5==0)
				array[i-1]="FizzBuzz";
			else if(i%3==0)
				array[i-1]="Fizz";
			else if(i%5==0)
				array[i-1]="Buzz";
			else
				array[i-1]=i+"";
		}
		return array;
	}
	
	@Test
	public void test1()
	{
	 String [] expected ={"1","2","Fizz"};	 
	 Assert.assertEquals(true, Arrays.equals(expected, fizzBuzzz(3)));
	}
	
	@Test
	public void test2()
	{
	 String [] expected ={"1","2","Fizz","4","Buzz"};
	 Assert.assertEquals(true, Arrays.equals(expected, fizzBuzzz(5)));
	}
	
	@Test
	public void test3()
	{
	 String [] expected ={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
	 Assert.assertEquals(true, Arrays.equals(expected, fizzBuzzz(15)));
	}
}
