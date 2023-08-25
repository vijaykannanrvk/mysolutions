package mysolutions.mandatoryHomeWork.foundation.aug4thweek.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelectRange {
	    public List<String> summaryRanges(int[] nums) {
	        List<String> myList= new ArrayList<String> ();
	        int startindex=-1,endindex=-1;
	        startindex=0;
	        if(nums.length>0)
	        {
	        for(int i=0;i<nums.length-1;i++)
	        {

	            if(nums[i+1]-nums[i]==1)
	            {
	                endindex=i+1;
	            }
	            else
	            {
	                if(endindex!=-1)
	                myList.add(nums[startindex]+"->"+nums[endindex]);
	                else
	                myList.add(nums[startindex]+"");
	                startindex=i+1;
	                endindex=-1;
	            }
	        }
	        if(endindex!=-1)
	        myList.add(nums[startindex]+"->"+nums[endindex]);
	        else
	        myList.add(nums[startindex]+"");
	        }
	        return myList;
	    }
	    
	    @Test
	    public void test1()
	    {
	    	Assert.assertEquals(Arrays.asList("0->2","4->5","7"), summaryRanges(new int [] {0,1,2,4,5,7}));
	    }
	}
