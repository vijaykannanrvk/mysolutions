package mysolutions.mandatoryHomeWork.foundation.Sep4thWeek.day2;

import org.junit.Assert;
import org.junit.Test;

public class BowlingIsWinner {
	public int isWinner(int[] player1, int[] player2) {
		int playerr1=0,playerr2=0,k=2,j=2;
        for(int i=0;i<player1.length;i++)
        {
            if(k<2)
            {
            	playerr1+=2*player1[i];
                k++;
            }
            else
            {
            	playerr1+=player1[i];
            }
            if(player1[i]==10)
            {
                k=0;
            }
            
            if(j<2)
            {
            	playerr2+=2*player2[i];
                j++;
            }
            else
            {
            	playerr2+=player2[i];
            }
            if(player2[i]==10)
            {
                j=0;
            }
        }
        if(playerr1==playerr2)
        return 0;
        else if(playerr1<playerr2)
        return 2;
        else
        return 1;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, isWinner(new int[] {3,5,7,6},new int[] {8,10,10,2}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, isWinner(new int[] {2,3},new int[] {4,1}));
	}
}
