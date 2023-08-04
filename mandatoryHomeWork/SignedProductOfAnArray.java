package mysolutions.mandatoryHomeWork;

import org.junit.Test;
import org.junit.Assert;


public class SignedProductOfAnArray {
	    public int arraySign(int[] nums) {
	        int multiple=1;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]<0)
	            {
	                multiple*=-1;
	            }
	            else if(nums[i]>0)
	            {
	                multiple*=1;
	            }
	            else
	            {
	                return 0;
	            }
	        }
	        return multiple;
	    }
	    
	    @Test
	    public void test1() {
	    	Assert.assertEquals(1, arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
	    }
	    
	    @Test
	    public void test2() {
	    	Assert.assertEquals(0, arraySign(new int[] {1,5,0,2,-3}));
	    }
}
