package mandatoryHomeWork;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityElement {
	
	/*
	 * INPUT number array
	 * OUTPUT majority element
	 * 
	 * PSUEDO CODE
	 * map<Integer,Integer>
	 *for i loop from 0 to array length -1
	 *  if(!map.keysSet().contains(i))
	 *    count=1
	 *    for j loop from i+1 to array length -1
	 *     if(array[i]==array[j])
	 *      count++;
	 *     end if
	 *    end for
	 *   map.put(array[i],count);
	 *  end if
	 *end for
	 *for entry in entrySet
	 *  if entry.getValue() == i/2
	 *   return entry.getKey()
	 *   
	 *   return -1   
	 *    
	 */
	
   public int majorityNumber(int[] numbers)
   {
	   Map<Integer,Integer> map = new HashMap<>();  
	   for (int i = 0; i < numbers.length; i++)
		if(!map.keySet().contains(numbers[i]))
		{
			int count=0;
			for (int j = i+1; j < numbers.length; j++)
				if(numbers[i]==numbers[j])
				 count++;
			map.put(numbers[i], count);
		}		   
	   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {	  
		   if(entry.getValue()==numbers.length/2)
			   return entry.getKey();
	      }
	   return -1;
   }
   
   @Test
   public void test1()
   {
	   int [] nums = {3,2,3};
	   Assert.assertEquals(3, majorityNumber(nums));
   }
   
   
   @Test
   public void test2()
   {
	   int [] nums = {2,2,1,1,1,2,2};
	   Assert.assertEquals(2, majorityNumber(nums));
   }
   
   @Test
   public void test3()
   {
	   int [] nums = {2,3,3};
	   Assert.assertEquals(3, majorityNumber(nums));
   }
} 
