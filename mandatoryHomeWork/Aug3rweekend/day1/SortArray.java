package mysolutions.mandatoryHomeWork.Aug3rweekend.day1;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class SortArray {
	
	public int [] sortArray(int []numbers)
	{
		for(int i=0;i<numbers.length-1;i++)
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]<numbers[i])
				{
					int t=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=t;
				}
			}
		return numbers;
	}
	
	@Test
	public void test()
	{
		int uar[] = new int[] {3,5,4,2,1,0};
		int ar[]=sortArray(uar);
		for (int i = 0; i < uar.length; i++) {
			System.out.println(uar[i]);
		}
	}

}
