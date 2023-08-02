package mandatoryHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

public class selfDividingNumber {
	
public List<Integer> selfDividingNumbers(int left, int right) {
	List<Integer> myList = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
        	if(i%10!=0)
        	{
        		int temp=i;
        		while(temp>0)
        		{
        			if(temp%10==0)
        				break;
        			if(i%(temp%10)!=0)
        				break;
        			temp=temp/10;
        		}
        		if(temp==0)
        		{
        			myList.add(i);
        		}
        	}
        }
        return myList;
    }

	@Test
	public void test1()
	{
		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,15,22})), selfDividingNumbers(1, 22));
	}

}
