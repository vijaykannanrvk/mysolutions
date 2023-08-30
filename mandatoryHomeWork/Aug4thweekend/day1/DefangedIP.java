package mysolutions.mandatoryHomeWork.Aug4thweekend.day1;

import org.junit.Test;

public class DefangedIP {
	
	public void defangIP(String ip)
	{
		String defangedip ="";
		for (int i = 0; i < ip.length(); i++) {
			if(ip.charAt(i)=='.')
			{
				defangedip=defangedip+"[.]";
			}
			else
			{
				defangedip=defangedip+ip.charAt(i);
			}
		}
		System.out.println(defangedip);
	}
	
	@Test
	public void test1()
	{
		defangIP("1.1.1.1");
	}

}
