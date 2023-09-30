package mysolutions.mandatoryHomeWork;

public class LargestSumSubArray {
	
	public int maxSubArray(int[] nums) {
        int start=0,max=Integer.MIN_VALUE,currentmax=0;
        while(start<nums.length)
        {
            if(currentmax<0)
            {
                currentmax=0;
            }
            if(currentmax>=0)
            {
               currentmax+=nums[start]; 
               start++;
            }
            max=Math.max(currentmax,max);
        }
        return Math.max(currentmax,max);
    }

}
