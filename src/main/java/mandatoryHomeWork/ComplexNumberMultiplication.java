package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

public class ComplexNumberMultiplication {
	
	/*
	 * INPUT num1=a+ib num2=c+id
	 * OUTPUT (ac-bd)+i(bc+ad)
	 * 
	 * PSUEDO CODE
	 * a= Integer.paresInt(num1.substring(0,num1.charAt('+')+1))
	 * c= Integer.paresInt(num2.substring(0,num2.charAt('+')+1))
	 * b= Integer.paresInt(num1.substring(num1.charAt('+')+1))
	 * d= Integer.paresInt(num2.substring(num2.charAt('+')+1))
	 * 
	 * return (a*c-bd)+"+i"(bc+ad);
	 */
	
	public String complexNumberMultiply(String num1, String num2) {
			int a= Integer.parseInt(num1.substring(0,num1.indexOf('+')));
			int c= Integer.parseInt(num2.substring(0,num2.indexOf('+')));
			int  b= Integer.parseInt(num1.substring(num1.indexOf('+')+1,num1.length()-1));
			int  d= Integer.parseInt(num2.substring(num2.indexOf('+')+1,num2.length()-1));
			  
			  return (a*c-b*d)+"+"+(b*c+a*d)+"i";      
    }

	@Test
	public void test1() {
		Assert.assertEquals("0+2i", complexNumberMultiply("1+1i", "1+1i"));
	}

}
