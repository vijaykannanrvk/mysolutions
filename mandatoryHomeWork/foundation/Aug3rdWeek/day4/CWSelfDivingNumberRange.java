package mysolutions.mandatoryHomeWork.foundation.Aug3rdWeek.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import net.bytebuddy.agent.builder.AgentBuilder.RawMatcher.ForElementMatchers;

import org.hamcrest.Matcher;
import org.junit.Assert;

public class CWSelfDivingNumberRange {
	
	/*

	Question:
	=========
	A self-dividing number is a number that is divisible by every digit it contains.

	For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
	A self-dividing number is not allowed to contain the digit zero.

	Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

	 

	Example 1:

	Input: left = 1, right = 22
	Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
	Example 2:

	Input: left = 47, right = 85
	Output: [48,55,66,77]

	1.yes
	2.TestData
	 Valid:
	 Input:1,22
	 [1,2,3,4,5,6,7,8,9,11,12,15,22]
	 Invalid:
	 Input:47,85
	 [48,55,66,77]
	3.yes
	4.try to optimal solution
	5.Psuedo code
	 List<int> result = new ArrayList<int> ();
	 for(i=left;i<=right;i++)
	 {
	   int n=i;
	   while(n>0)
	   {
	     if(!i%(n%10)==0)
	      break;
	     n=n/10;
	   }
	   if(n==0)
	     result.Add(i);//add
	 }
	 return result;
	6.dry run
	7.Write code in notepad
	8.chceck compile time errors
	9.
	*/
	 
	
	public List<Integer> selfDividNumberRange(int left,int right)
	{
		List<Integer> result = new ArrayList<Integer> ();
		 for(int i=left;i<=right;i++)
		 {
		   int n=i;
		   while(n>0)
		   {
			 if(n%10==0)
				 break;
			 else if(!(i%(n%10)==0))
		      break;
		     n/=10;
		   }
		   if(n==0)
		     result.add(i);
		 }
		 return result;
	}
	
	@Test
	public void test1()
	{
		List<Integer> expected= Arrays.asList(48,55,66,77);
		Assert.assertEquals(expected,selfDividNumberRange(47, 85));
	}
	
	@Test
	public void test2()
	{
		List<Integer> expected= Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22);
		Assert.assertEquals(expected, selfDividNumberRange(1, 22));
	}

}
