package mandatoryHomeWork;

import java.util.Arrays;

import org.junit.*;

public class SeniorCitizen {
	
	public int isSeniorCitizen(String []passengers)
	{
		return (int) Arrays.stream(passengers).filter(s->Integer.valueOf(s.charAt(11)+""+s.charAt(12))>60).count();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2,isSeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0,isSeniorCitizen(new String[] {"7868190130M3522","5303914400F2311","9273338290F1110"}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0,seniorcitizens(new String[] {"7868190130M0022","5303914400F0011","9273338290F0010"}));
	}
	public int seniorcitizens(String[] input)
	
	{
		int counter =0;
		for (int i = 0; i < input.length; i++) {
		
			
		int age= Integer.valueOf(input[i].substring(11, 13)) ;
		
		if(age>=60)
		{
			counter++;
		}
			
		}
		return counter ;
	}

}
