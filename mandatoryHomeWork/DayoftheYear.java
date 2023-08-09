package mysolutions.mandatoryHomeWork;

import org.junit.Test;
import org.junit.Assert;

public class DayoftheYear {
	
	/*
	 * INPUT date YYYY-MM-DD 2020-02-09
	 * OUPUT day 40
	 * 
	 * int [] array={31,28,31,30,31,30,31,31,30,31,30,31}
	 * if year%100==0
	 *   if year%400==0
	 *     array[1]=29
	 *  else if year%4==0
	 *    array[1]=29
	 *  for loop i from 0 to n-2 
	 *    days=days+array[i]
	 *  days=days+DD
	 *  return DD
	 */
	
public int dayOfYear(String date) {
		int [] array={31,28,31,30,31,30,31,31,30,31,30,31};
        int month = Integer.parseInt(date.substring(5,7));
        int year = Integer.parseInt(date.substring(0,4));
        int days = Integer.parseInt(date.substring(8));
        if (year%100==0)
        {
           if(year%400==0)
        	   array[1]=29;
        }
        else if (year%4==0)
              array[1]=29;
        for(int i=0;i<=month-2;i++)
        	days=days+array[i];
        return days;
    }

/*
 * APPROACH 2
 * int temporary =Integer.parseInt(date.substring(0,4))
 * boolean leapyear =false;
 * if year%100==0
 *   if year%400==0
 *     leapyear=true;
 *  else if year%4==0
 *      leapyear=true;
 *   temporary = Integer.parseInt(date.substring(5,7))
 *   int days =Integer.parseInt(date.substring(8))
 *   for i loop from 1 to temporary-1
 *     if(i<8)
 *       if(i%2==0)
 *         if(i==2 && leapyear)
 *           days=days+29;
 *         else
 *            days=days+30;
 *       else
 *          days=days+31;
 *      else
 *         if(i%2==0)
 *           days=days+31
 *         else
 *           days=days+30
 *     return days
 */

public int dayOfYears(String date) {
	int temporary = Integer.parseInt(date.substring(0,4));
	boolean leapyear =false;
	if(temporary%100==0)
	{
		if(temporary%400==0)
			leapyear=true;		
	}
	else if(temporary%4==0)
	{
		leapyear = true;
	}
	temporary = Integer.parseInt(date.substring(5,7));
	int days= Integer.parseInt(date.substring(8));
	for(int i=1;i<temporary;i++)
	{
		if(i<8)
		{
			if(i%2==0)
			{
				if(i==2&&leapyear)
					days+=29;
				else 
					days+=30;
			}
			else
			{
				days+=31;
			}
		}
		else
		{
			if(i%2==0)
			{
				days+=31;
			}
			else
			{
				days+=30;
			}
		}
	}
	return days;
}

@Test
public void test1()
{
	Assert.assertEquals(9, dayOfYears("2019-01-09"));
}

@Test
public void test2()
{
	Assert.assertEquals(41, dayOfYears("2019-02-10"));
}

}
