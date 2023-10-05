package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day1;

public class FairCandySwap {
	    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	        int astart=0,bstart=0;
	        int asum=0,bsum=0,actualtotal=0;
	        while(astart<aliceSizes.length&&bstart<bobSizes.length)
	        {
	            asum+=aliceSizes[astart++];
	            bsum+=bobSizes[bstart++];
	        }
	        while(astart<aliceSizes.length)
	        {
	            asum+=aliceSizes[astart++];
	        }
	        while(bstart<bobSizes.length)
	        {
	            bsum+=bobSizes[bstart++];
	        }
	        actualtotal=(asum+bsum)/2;
	        return new int[]{actualtotal-asum,actualtotal-bsum};
	    }
}
