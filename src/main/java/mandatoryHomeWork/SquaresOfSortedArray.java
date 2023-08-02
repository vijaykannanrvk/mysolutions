package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfSortedArray {
	
	/*
	 * INPUT array of numbers
	 * OUPUT array of numbers
	 * 
	 * TEST DATA
	 * I/P:[-4,-1,0,3,10]
	 * O/P:[0,1,9,16,100]
	 * 
	 * I/P:[-7,-3,2,3,11]
	 * O/P:[4,9,9,49,121]
	 * 
	 * PSUEDO CODE
	 * start =0, end = array.length-1
	 * square[],k=array.length-1
	 * while(start<=end)
	 * {
	 *  startSquare = array[start]*array[start]
	 *  endSquare =array[end]*[end]
	 *  if(startSquare>endSquare)
	 *   square[k] =startSquare
	 *   start++
	 *  else
	 *   square[k] =endSquare
	 *   end--
	 *  endif
	 *  k-- 
	 * }
	 * return square
	 */
	
	public int[] squareOfSortedArrays(int[] numbers)
	{
		int start=0,end=numbers.length-1,k=numbers.length-1;
		int[] squares = new int[numbers.length];
		int startSquares=0,endSquares=0;
		while(start<=end)
		{
			startSquares = numbers[start]*numbers[start];
			endSquares = numbers[end]*numbers[end];
			if(startSquares>endSquares)
			{
				squares[k] =startSquares;
				start++;
			}
			else
			{
				squares[k] =endSquares;
				end--;
			}
			k--;
		}
		return squares;
	}
	
	@Test
	public void test1()
	{
		Assert.assertArrayEquals(new int [] {0,1,9,16,100}, squareOfSortedArrays(new int [] {-4,-1,0,3,10}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertArrayEquals(new int [] {4,9,9,49,121}, squareOfSortedArrays(new int [] {-7,-3,2,3,11}));
	}

}
