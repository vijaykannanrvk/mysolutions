package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day2;

import java.util.HashSet;

public class JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {
        // traverse each stone in stones string
        // check if the stone is present in jewel and increment counter
        // retrun counter
        int counter=0;
        HashSet<Character> mySet = new HashSet<Character>();
        for(int i=0;i<jewels.length();i++)
            mySet.add(jewels.charAt(i));
        for(int i=0;i<stones.length();i++)
        {
            if(mySet.contains(stones.charAt(i)))
             counter++;
        }
        return counter;
    }
}
