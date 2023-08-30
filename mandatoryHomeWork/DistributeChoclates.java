package mysolutions.mandatoryHomeWork;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.*;

public class DistributeChoclates {

	/*
	 * INPUT array of numbers
	 * OUTPUT number of that can be consumed
	 * 
	 * TEST DATA
	 * I/P: [1,1,2,2,3,3]
	 * O/P:3
	 * 
	 * I/P: [1,1,1,1]
	 * O/P: 1
	 * 
	 * I/P: [1,1,2,2]
	 * O/P: 2
	 * 
	 * PSUEDO CODE
	 * add the array to set
	 * if set.size>=array.length/2
	 *  return array.length/2
	 * else
	 *  set.size
	 */
	
	public int distributeChoco(int [] numbers)
	{
		/*Set<Integer> mySet = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
		Arrays.stream(numbers).forEach(System.out::println);*/
		if(mySet.size()>=numbers.length/2)
		{
			return numbers.length/2;
		}
		else
			return mySet.size();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, distributeChoco(new int[] {1,1,2,2,3,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, distributeChoco(new int[] {1,1,1,1,3,3}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1, distributeChoco(new int[] {1,1,1,1,1,1}));
	}
}
