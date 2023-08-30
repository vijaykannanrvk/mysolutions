package mysolutions.mandatoryHomeWork;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.Assert;

public class InsertionOfTwoArrays {
	/*
	 * INPUT two array of numbers
	 * OUTPUT array of numbers
	 * 
	 * PSUEDO CODE
	 * set myset;
	 * for loop i to nums1.length-1
	 *  if(!myset.keycontains(nums1[i]))
	 *  for loop j to nums2.length-1
	 *   if(nums[i]==nums2[j])
	 *   {
	 *   myset.Add(nums1[i]);
	 *   break;
	 *   }
	 *  end for
	 *  end if
	 * end for
	 * return myset;
	 */
	
	public int[] intersection(int[] nums1, int[] nums2) 
	{
        Set<Integer> mySet= new HashSet();
        for (int i = 0; i < nums1.length; i++) 
        {
			if(!mySet.contains(nums1[i]))
				for (int j = 0; j < nums2.length; j++) 
				{
					if(nums1[i]==nums2[j])
					{
						mySet.add(nums1[i]);
						break;
					}
				}
		}
        return mySet;//.stream().mapToInt(x->x).toArray();
    }
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {1,2}, intersection(new int[] {1,2,3}, new int[] {4,2,1}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {2}, intersection(new int[] {1,2,2,1}, new int[] {2,2}));
	}
	
	@Test
	public void test3() {//nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		Assert.assertArrayEquals(new int[] {4,9}, intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
	}

}
