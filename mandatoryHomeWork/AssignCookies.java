package mysolutions.mandatoryHomeWork;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies {
	
	/*
	 * TEST DATA:
	 * I/P:g = [1,2,3], s = [1,1]
	 * O/P: 1
	 * I/P:g = [1,2], s = [1,2,3]
	 * O/P: 2 
	 * 
	 * 
	 * PESUDO CODE
	 * sort the greed array
	 * sort the size array
	 * Initialize the greed pointer to 0
	 * Initialize the size pointer to 0
	 * Initialize the contented pointer to 0
	 * loop until size or greed reaches the length of their respective arrays
	 * check if size value at the size pointer is greater the greed value at greed pointer
	 *   increase the contented by 1
	 *   increase the size by 1
	 *   increase the greed by 1
	 *  end if
	 * 
	 */
	
	public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int greed=0,size=0;
        while(greed<g.length&size<s.length)
        {
            if(s[size]>=g[greed])
            {
                count++;
                size++;
                greed++;
            }
            else
            {
                size++;
            }
        }
        return count;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, findContentChildren(new int [] {1,2,3}, new int [] {1,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, findContentChildren(new int [] {1,2}, new int [] {1,2,3}));
	}

}
