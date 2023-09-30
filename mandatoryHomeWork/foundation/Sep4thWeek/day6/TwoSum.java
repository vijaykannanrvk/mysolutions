package mysolutions.mandatoryHomeWork.foundation.Sep4thWeek.day6;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public int[] findTwoSum(int []nums,int n)
	{
		HashMap<Integer,Integer> myMap =new HashMap<>();
        for(int i=nums.length-1;i>-1;i--)
        {
            if(!myMap.containsKey(n-nums[i]))
			  myMap.put(nums[i],i);
            else
             return new int[] {myMap.get(n-nums[i]),i};
        System.out.println(myMap);
        }
     return new int[] {0,0};
	}

}
