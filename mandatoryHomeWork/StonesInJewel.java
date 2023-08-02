package mysolutions.mandatoryHomeWork;

import org.junit.*;


public class StonesInJewel {
	// traverse each stone in stones string
    // check if the stone is present in jewel and increment counter
    // retrun counter
	
	public int numJewelsInStones(String jewels, String stones) {
        int counter=0;
        for(int i=0;i<stones.length();i++)
        {
            if(jewels.contains(stones.charAt(i)+""))
             counter++;
        }
        return counter;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, numJewelsInStones("aA", "aAAbbbBB"));
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(0, numJewelsInStones("z", "ZZ"));
	}

}
