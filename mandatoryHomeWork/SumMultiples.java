package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class SumMultiples {
	
	/*1.Understood
	2.TestData
	Valid: 8 =>21
	Invalid:-5
	Edge:2=>0
	3.yes
	4.O(n)
	5.wrote code on notepad
	6.checked for compile errors
	7.wrote on ide
	8.works good


	PSUEDO CODE

	input n
	sum=0
	if(n>2)
	for loop i from 3 to n
	if(i%3==0||i%5==0||i%7==0)
	 sum+=i;
	return sum;

	int sum=0;
	if(n>2)
	for(int i=3;i<=n;i++)
	if(i%3==0||i%5==0||i%7==0)
	 sum+=i;
	return sum;

	n=8
	sum=0
	8>2 T
	i=3 3<=8T
	3%3==0 T
	sum=0+3 =>3
	i=4 4<=8
	4%3==0 || 4%5==0 || 4%7 ==0 F
	i=5 5<=8
	5%5==0 T
	3+5 =8
	i=6 6<=8 T
	6%3==0
	8+6=14
	i=7 7<=8 T
	7%7 ==0 T
	14+7 =21
	i=8 8<=8 T
	8%3==0 || 8%5==0 || 8%7 ==0 F*/



	
	public int sumOfMultiples(int n) {
	    int sum=0;
	    for(int i=3;i<=n;i++)
	     if(i%3==0||i%5==0||i%7==0)
	       sum+=i;
	    return sum;
	    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(21, sumOfMultiples(7));
	}
}
