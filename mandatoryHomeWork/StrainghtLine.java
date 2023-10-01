package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class StrainghtLine {
	
	/*
	 * INPUT array[][]
	 * OUTPUT boolean true or false
	 * 
	 * TEST DATA
	 * 1.{{1,2},{1,3},{1,4},{1,5}}
	 * 2.{{2,1},{3,1},{4,1}}
	 * 3.{{1,1},{2,2},{3,3}}
	 */

	public boolean isStraightLine(int[][] coordinates)
	{
		int slope=0;
        if(coordinates.length>2)
				{
					if((coordinates[1][0]-coordinates[0][0])!=0)
					slope = (coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
					for(int i=2;i<coordinates.length;i++)
					{
						if(slope!=0)
						{
							if((coordinates[i][0]-coordinates[i-1][0])!=0)
							{
							if(slope!=(coordinates[i][1]-coordinates[i-1][1])/(coordinates[i][0]-coordinates[i-1][0]))
						return false;
							}
						}
					}
				}
				return true;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isStraightLine(new int [][] {{1,-8},{2,-3},{1,2}}));
	}
}
