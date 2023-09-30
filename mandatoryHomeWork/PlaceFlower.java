package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class PlaceFlower {

	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int possible=0;
	        if(flowerbed.length>1)
	        for(int i=0;i<flowerbed.length;i++)
	        {
	            if(i==0)
	            {
	                if(flowerbed[i]==0&&flowerbed[i+1]==0)
	                {
	                possible++;
	                i++;
	                }
	            }
	            else if(i==flowerbed.length-1)
	            {
	                if(flowerbed[i]==0&&flowerbed[i-1]==0)
	                possible++;
	            }
	            else if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0)
	            {
	                possible++;
	                i++;
	            }
	            if(possible>=n)
	            return true;
	        }
	        else if(flowerbed.length==1)
		     {
			  if(flowerbed[0]==0)
					  return true;
			  else if(n==0)
				   return true;
		    }	
	        return false;
	    }
	    
	    @Test
	    public void test1()
	    {
	    	Assert.assertEquals(true, canPlaceFlowers(new int [] {1,0,0,0,1}, 1));
	    }
	    
	    @Test
	    public void test2()
	    {
	    	Assert.assertEquals(false, canPlaceFlowers(new int [] {1,0,0,0,1}, 2));
	    }
}
