package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DisappearedNumber {
	    public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> actual = new LinkedList<>();
	        List<Integer> result = new ArrayList<>();
	        for(int i=0;i<nums.length;i++)
	        actual.add(nums[i]);
	        for(int i=1;i<=nums.length;i++)
	        if(!actual.remove(Integer.valueOf(i)))
	        result.add(i);
	        return result;
	    }
}
