package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class StockBuySell {
	
	/*
	 * INPUT array of stock prices
	 * OUTPUT max profit
	 * 
	 * 
	 * TEST DATA
	 * +ve: I/P price={1,2,4,5,6}
	 *      O/P 5
	 *      
	 * -ve: I/P price ={}
	 *      O/P 0
	 *     
	 * +ve: I/P price ={7,4,3,2,5,1}
	 *      O/P 3
	 *      
	 *      
	 * PSUEDO CODE
	 * profit =0
	 * for i loop from 0 to array.length-2
	 *  for j=i+1 loop from 0 to array.length-1
	 *   if array[i]<array[j]
	 *    if profit< array[j]-array[i]
	 *     profit =array[j]-array[i]
	 *    end if
	 *   end if
	 *  end for
	 * end for
	 * return profit
	 *    
	 * 
	 */
	
	public int stockMaxProfit(int []price)
	{
		int profit=0;
		for (int i = 0; i < price.length-1; i++) {
			for (int j = i+1; j < price.length; j++) {
				if(price[j]>price[i])
					if(profit<price[j]-price[i])
						profit =price[j]-price[i];
			}
		}
		return profit;
		
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(5,stockMaxProfit(new int[] {1,2,4,5,6}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3,stockMaxProfit(new int[] {7,4,3,2,5,1}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0,stockMaxProfit(new int[] {}));
	}

}
