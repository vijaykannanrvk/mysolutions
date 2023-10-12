package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day3;

import java.util.HashMap;
import java.util.Map;

public class SumOnUniques {
	public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> myMap  = new HashMap<Integer, Integer>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            myMap.put(nums[i],myMap.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(myMap.get(nums[i])==1)
            sum+=nums[i];
        }
        return sum;
    }
}
