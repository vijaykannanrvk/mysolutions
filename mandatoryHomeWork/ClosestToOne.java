package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class ClosestToOne {
	
	/*
	 * INPUT array of numbers
	 * OUTPUT number
	 * 
	 * PSUEDO CODE
	 * int small = array[0]
	 * 
	 * for i loop from 0 to array length-1
	 *   if (array[i]>0)
	 *     if(small>0)
	 *       if(small>array[i])
	 *         small =array[i]
	 *       end if
	 *     else
	 *      if(small*-1>array[i])
	 *        small =array[i]
	 *      end if
	 *     end if
	 *   else  
	 *     if(small>0)
	 *       if(small>array[i]*-1)
	 *         small =array[i]
	 *       end if
	 *     else
	 *      if(small*-1>array[i]*-1)
	 *        small =array[i]
	 *      end if
	 *     end if
	 *   
	 * return small;
	 */
	
	public int closesttoZero(int [] array)
	{
		if(array.length>0)
		{
			int small = array[0];
			for (int i = 0; i < array.length; i++) {
					   if (array[i]>0)
					      if(small>0)
					       if(small>array[i])
					         small =array[i];
					     else
					      if(small*-1>array[i])
					        small =array[i];
					   else  
					     if(small>0)
					       if(small>array[i]*-1)
					         small =array[i];					       
					     else
					      if(small*-1>array[i]*-1)
					        small =array[i];					      					   					 
			}
			return small;
		}
		return -1;
	}
	
	@Test
	public void test1()
	{
	 Assert.assertEquals(-1, closesttoZero(new int [] {-1,2,-3}));
	}
	
	@Test
	public void test2()
	{
	 Assert.assertEquals(-1, closesttoZero(new int [] {-1,2,-3,1,-10,-20,100}));
	}
	

}
