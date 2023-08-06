package mysolutions.mandatoryHomeWork;

import org.junit.Test;
import org.junit.Assert;

public class AverageValueOfEvenNumbers {
	    public int averageValue(int[] nums) {
	        int sum=0,n=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]%2==0&&nums[i]%3==0)
	            {
	            sum+=nums[i];
	            n++;
	            }
	        }
	        return sum!=0?sum/n:0;
	    }
	    
	    @Test
	   public void test1()
	   {
		   Assert.assertEquals(9, averageValue(new int[] {1,3,6,10,12,15}));
	   }
	    
	    @Test
		 public void test2()
		 {
		   Assert.assertEquals(0, averageValue(new int[] {1,2,4,7,10}));
		 }
}
