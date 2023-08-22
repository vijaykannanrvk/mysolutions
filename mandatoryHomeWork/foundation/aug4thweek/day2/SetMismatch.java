package mysolutions.mandatoryHomeWork.foundation.aug4thweek.day2;

import org.junit.Test;

import org.junit.Assert;

public class SetMismatch {

	
	/*
	 * 1.yes
	 * 2.Test DAta
	 * [1,2,2]
	 * [2,3]
	 * [1,1]
	 * [1,2]
	 * 3.yes
	 * 4.no
	 * 5.int missingnum=0,duplicate=0;
for(int i=1;i<array.length;i++)
{ 
  boolean flag =false;
  for(int j=0;j<array.length;j++)
   {
    if(i==array[j])
    {
      flag=true;
      break;
     }
   }
   if(!flag)
   missingNum=i;
   if(array[i]==array[i-1])
    duplicate=array[i]
   if(missingNum!=0&&duplicate!=0)
   return new int [] {duplicate,missingNum};
 }
 return new int {duplicate,array.length};


6.dry run 
[1,2,2]
i=1 1<3 T
flag= false
 j=0  0<3 T
  array[0]==1 T
  flag =true;
if !flag F
if array[1]==array[0] 1==2 F
if (missingNum!=0 && duplicate!=0) F
i=2 2<3 T
 falg=false
 j=0 0<3 T
 array[0]==2 F
j=1 1<3 T
 array[1] ==2 2==2 T
  flag =true
  break
if(!flag) F
if(array[2]==array[1] 2==2 T
 duplicate =2
if (missingNum!=0 && duplicate!=0) F
i=3 3<3 F
return [duplicate,array.length]
       [2,3]
	 */
	
	public int[] findSetMissmatch(int [] array)
	{
		int missingNum=0,duplicate=0;
		for(int i=1;i<array.length;i++)
		{ 
		  boolean flag =false;
		  for(int j=0;j<array.length;j++)
		   {
		    if(i==array[j])
		    {
		      flag=true;
		      break;
		     }
		   }
		   if(!flag)
		   missingNum=i;
		   if(array[i]==array[i-1])
		    duplicate=array[i];
		   if(missingNum!=0&&duplicate!=0)
		   return new int [] {duplicate,missingNum};
		 }
		 return new int[] {duplicate,array.length};
	}
	
	@Test
	public void test()
	{
		Assert.assertArrayEquals(new int [] {2,3}, findSetMissmatch(new int[] {1,2,2}));
	}
}

