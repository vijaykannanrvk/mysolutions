package mandatoryHomeWork;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfPlusOne {
	
	/*
	 * INPUT array of numbers //1,1,2
	 * OUTPUT number 2
	 * 
	 * PSUEDO CODE
	 * count =0
	 * for i loop from 0 to array.length-1
	 *  for j =0 loop until array.length-1
	 *   if(array[i]+1== array[j])
	 *    count++
	 *   endif
	 *  end for
	 * end for
	 * return count;
	 */
	
	public int CountOfPlus1(int [] numbers)
	{
		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[i]+1==numbers[j])
					count++;
			}
		}
		return count;
	}
	
	/*
	 * count=0
	 * HashMap<Integer,Integer> myMap
	 * for i loop from 0 to array.length-1
	 *   myMap.put(array[i],myMap.getOrDefault(array[i],0)+1)
	 * end for
	 * foreach entry in myMap
	 *   count =count+myMap.getOrDefault(entry.Key+1,0)
	 * end for
	 * return count
	 *   
	 */
	
	public int CountOfPlus11(int [] numbers)
	{
		int count=0;
		HashMap<Integer,Integer> myMap =new HashMap();
		for (int i = 0; i < numbers.length; i++) {
			myMap.put(numbers[i],myMap.getOrDefault(numbers[i],0)+1);
		}
		System.out.println(myMap);
		for (Entry<Integer,Integer> i : myMap.entrySet()) {
			count =count+(myMap.getOrDefault(i.getKey()+1,0)*myMap.get(i.getKey()));
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, CountOfPlus11(new int[] {1, 2, 3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, CountOfPlus11(new int[] {1, 2, 1}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, CountOfPlus11(new int[] {1, 1, 3, 3, 5, 5, 7, 7}));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(4, CountOfPlus11(new int[] {1, 1, 2,2}));
	}

}
