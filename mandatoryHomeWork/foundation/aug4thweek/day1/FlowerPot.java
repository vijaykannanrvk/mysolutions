package mysolutions.mandatoryHomeWork.foundation.aug4thweek.day1;

import org.junit.Test;

import org.junit.Assert;

public class FlowerPot {
	
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		Test Data
	 *  [0,0,1,0,1] n=1
	 *  true
	 *  [1,0,0] n=1
	 *  true
	 *  [1,0,0,1] n=1
	 *  false
		3.Do you know the Solution?
		yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		no
		5. Derive Pseudo code in paper (for the best chosen approach)
		     Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		PSUEDO CODE
		1. for i loop from 0 to array.length-1
		2.split problem to three parts
		  1.first position of array
		    if first two elements are zero -> first element can be replaced by 1 and increment possible by 1
		  2.last position of array
		    if last two elements are zero -> replace last element by 1 and increment possible by 1
		  3.if middle portions of array
		    if front and back are zero replace center by 1
		    
		  for i =0 t0 array.length-1
		  if(i==0)
            {
                if(flowerbed[i]==0&&flowerbed[i+1]==0)
                {
                possible++;
                i++;
                }
            }
            else if(i==flowerbed.length-1)
            {
                if(flowerbed[i]==0&&flowerbed[i-1]==0)
                possible++;
            }
            else if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0)
            {
                possible++;
                i++;
            }  
            if(possible ==n)
            return true
		    
		6. Dry run the pseudo code with all test data from step #2
		
		1=>[0,0,1,0,1] n=1
		i=0 possible =0
		i==0 T
		  flowerbed[i]==0&&flowerbed[i+1]==0 (T)
		    possible=0+1=1
		possible == n 1==1
		return true
		
		2=>[1,0,0] n=1
		i=0 possible =0
		i==0 T
		 flowerbed[i]==0&&flowerbed[i+1]==0 (F)
		i=1
		 i==0 F
		 i==2 F
		 flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0 1==0&&0==0&&0==0 F
		i=2
		 i==0 F
		 i==2 T
		  flowerbed[i]==0&&flowerbed[i-1]==0 (T)
		  possible =0+1 
		
		possible==n 1==1
		return true
		
		
		7.Write the code on notepad
		
		
		8. Dry run the code with all test data from step #2
		
		9. Write code on IDE (remember to add comments and practice coding standards)
		
		10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 1.
	 * 2.
	 *  3.
	 *  
	 */
	public boolean isFlowerPot(int[] flowerbed, int n)
	{
	 int possible=0;
	 if(flowerbed.length>1)
	 for(int i=0;i<flowerbed.length;i++)
	  {
	   if(i==0)
	   {
	    if(flowerbed[i]==0&&flowerbed[i+1]==0)
	    {
	     possible++;
	     i++;
	    }
	   }
	   else if (i==flowerbed.length-1)
	   {
	    if(flowerbed[i]==0&&flowerbed[i-1]==0)
	    {
	     possible++;
	    }
	   }
	   else if(flowerbed[i]==0&&flowerbed[i-1]==00&&flowerbed[i+1]==0)
	   {
	     possible++;
	     i++;
	    }
	   if(possible>=n)
	   return true;
	  }
	 else if(flowerbed.length==1)
	 {
		  if(flowerbed[0]==0)
				  return true;
		  else if(n==0)
			   return true;
	 }		 
	 return false;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isFlowerPot(new int [] {0,0,1,0,0,0,0}, 3));
	}

}
