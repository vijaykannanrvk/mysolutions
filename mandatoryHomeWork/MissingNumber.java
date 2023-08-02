package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber {

	/*
	 * INPUT number array [3,0,1]
	 * OUPUT number
	 * 
	 * PSUEDO CODE
	 * for i loop form  0 to array.length
	 *   for j loop from 0 to array.length-1
	 *     if(i==array[j])
	 *      i++
	 *      j=0
	 *   end for
	 *   if(j==array.length)
	 *    return i      
	 *  end for
	 *  return array.length   
	 */
	
	public int missingNum(int [] numbers)
	{
		for (int i = 0; i <= numbers.length; i++) {
			int j;
			for (j = 0; j < numbers.length; j++) {
				if(i==numbers[j])
				{
					i++;
					j=0;
				}
			}
			if(j==numbers.length)
				return i;			
		}
		return numbers.length;
	}
	
	public int missingNums(int [] numbers)
	{
		//int k=0;//1,0
		for (int i = 0; i <= numbers.length; i++) {			
			for (int j = 0; j < numbers.length; j++) {
				//System.out.println(i);
				if(i==numbers[j])
				{			
					System.out.println(i +" "+j);
					++i;
					j=0;					
				}
			}
			System.out.println(i +"num");
			return i;			
		}
		return numbers.length;
	}
	
	public int missingNumf(int [] numbers)
	{
		//int k=0;
		for (int i = 0; i <= numbers.length; i++) {	
			boolean flag = true;
			for (int j = 0; j < numbers.length; j++) {
				//System.out.println(++k);
				if(i==numbers[j])
				{					
					flag=false;
				}
			}
			if(flag)
			return i;			
		}
		return numbers.length;
	}
	
	public int missingNumber(int[] numbers) {
		for(int i=1;i<numbers.length;i++)
        {
            numbers[0]=numbers[0]+numbers[i];
        }
        return ((numbers.length*(numbers.length+1))/2)-numbers[0];
    }
	
	@Test
	public void test1()
	{
		int[] nums= {3,0,1};
		Assert.assertEquals(2, missingNumf(nums));
	}
	
	@Test
	public void test2()
	{
		int[] nums= {2,1,0};
		Assert.assertEquals(3, missingNumf(nums));
	}
	
	@Test
	public void test3()
	{
		int[] nums= {9,6,4,2,3,5,7,0,1};
		Assert.assertEquals(8, missingNumf(nums));
	}
}
