package mysolutions.mandatoryHomeWork.Sep2nd.CW;

import org.junit.Test;

import org.junit.Assert;

public class CaloriesScore {
	
	public int CalculateScore(int []calories ,int days,int lower,int upper)
	{
		int score=0;
		for(int i=0;i<=calories.length-days;i++)
		{
			int total=0;
			for(int k=0;k<days;k++)
			{
				total = total+calories[i+k];
			}
			System.out.println(total);
			if(total<lower)
				score--;
			else if(total>upper)
				score++;
		}
		return score;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, CalculateScore(new int[] {1,2,3,4,5},1,3,3));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, CalculateScore(new int[] {3,2},2,3,3));
	}

	@Test
	public void test3()
	{
		Assert.assertEquals(1, CalculateScore(new int[] {6,5,0,0,1},3,1,5));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(0, CalculateScore(new int[] {0,0,0,0,0},1,0,0));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(-1, CalculateScore(new int[] {7,7,0},3,15,15));
	}
}
