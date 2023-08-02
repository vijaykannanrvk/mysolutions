package mandatoryHomeWork;

import org.junit.*;

public class PivotElement {
	
	/*
	 * INPUT: 1,7,3,6,5,6
	 * OUTPUT:3
	 * 
	 * PSUEDO CODE
	 * rightsum=0,leftsum=0
	 * for loop pivotindex from 0 to array.length-1
	 *  for loop index from 0 to array.length-1
	 *   if index<pivotindex
	 *    leftsum=leftsum+array[index]
	 *   else if index>pivotindex
	 *    rightsum=rightsum+array[index]
	 *   end if
	 *  end for
	 *  if leftsum==rightsum
	 *   retrun pivotindex
	 *  endif
	 *  leftsum=0,rightsum=0
	 * end for
	 *  
	 */
	
	public int pivotIndex(int[] nums) {
        int rightsum=0,leftsum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(j>i)
                {
                    rightsum=rightsum+nums[j];
                }
                else if(j<i)
                {
                     leftsum=leftsum+nums[j];
                }
            }
            if(leftsum==rightsum)
            {
                
                return i;
            }
            leftsum=0;
            rightsum=0;
        }
        return -1;
    }
	
	public int findPivotIndex(int[] nums)
	{
		int rightsum=0,leftsum=0;
		int i=nums.length/2,temp=0;
		while(i<nums.length && i>-1)
		{
			for(int j=0;j<nums.length;j++)
            {
                if(j>i)
                {
                    rightsum=rightsum+nums[j];
                }
                else if(j<i)
                {
                     leftsum=leftsum+nums[j];
                }
            }
            if(leftsum==rightsum)
            {               
                return i;
            }
            else if(leftsum<rightsum) {
            	i++;
            	temp=i;
            }
            else if(leftsum>rightsum) {
            	if(i==temp)
            		return -1;
            	i--;
            }
            System.out.println(leftsum+" "+rightsum);
            leftsum=0;
            rightsum=0;
            //temp=0;
		}
		return -1;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, findPivotIndex(new int[] {1,7,3,6,5,6}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(-1, findPivotIndex(new int[] {1,2,3}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(2, pivotIndex(new int[] {-1,-1,-1,-1,-1,0}));
	}

}
