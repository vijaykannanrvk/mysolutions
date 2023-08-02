package mandatoryHomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.*;

public class UniqueOccurences {
	
	/*
	 * INPUT array of numbers
	 * OUTPUT true
	 * 
	 * Map<int,int> mymap;
	 * for loop i from 0 to numbers.length-1
	 *  if mymap.keycontians numbers[i]
	 *   mymap.put numbers[i],mymap.get(numbers[i])+1
	 *  else
	 *   mymap.put number[i],1
	 *  end if
	 * end for
	 * Set<int> myset
	 * for loop value in the map values
	 *  if(!set.add(value))
	 *   return false;
	 *  end if
	 * end for
	 * return true;
	 * 
	 */
	
	public boolean isUniqueOccurence(int[] numbers)
	{
		Map<Integer,Integer> myMap = new HashMap();
		for (int index = 0; index < numbers.length; index++) {
			if(myMap.containsKey(numbers[index]))
			 myMap.put(numbers[index], myMap.get(numbers[index])+1);
			else
			 myMap.put(numbers[index], 1);
		}
		Set<Integer> mySet = new HashSet<>();
		for (Integer value : myMap.values()) {
			if(!mySet.add(value))
				return false;	
		}
		return true;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isUniqueOccurence(new int[] {1,2,2,1,1,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, isUniqueOccurence(new int[] {1,2,2,1,1,3,4}));
	}

}
