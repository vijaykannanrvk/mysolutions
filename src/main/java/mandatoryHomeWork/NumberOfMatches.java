package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class NumberOfMatches {
	
	/*
	 * INPUT number of teams
	 * OUPTUT number of matches
	 * 
	 * PSUUDO CODE
	 * int count=0
	 * while n>1
	 * if n%2==0
	 *   count= count+n/2
	 *   n=n-n/2
	 *  else
	 *    count =count+(n-1)/2
	 *    n=n-((n-1)/2)
	 *  end if
	 */
	
	public int numOfMatches(int teams)
	{
		int count=0;
		while(teams>1)
		{
			if(teams%2==0)
			{
				count =count+teams/2;
				teams= teams-teams/2;
			}
			else
			{
				count =count+(teams-1)/2;
				teams= teams-(teams-1)/2;
			}
		}
		return count;
		
	}
	
	public int numOfMatche(int teams)
	{
		int count=0;
		for(;teams>1;teams=teams/2)
		{
			if(teams%2==0)
				count =count+teams/2;
			else
				count =count+(teams-1)/2;
		}
		return count;
		
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(6, numOfMatches(7));
	}

}
