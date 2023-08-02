package mandatoryHomeWork;

import org.junit.*;

public class ColumnNumber {

	/*
	 * INPUT columnName
	 * OUPUT columnNumber
	 * 
	 * PSEUDO CODE
	 * String s="0ABCDEFGHIJKLMNOPQERSTUVWXYZ"
	 * int columnnum =0
	 * if(columnName.length>0)
	 *  columnnum = s.indexOf(columnName.charAt(0));
	 *  for loop from 1 to columnName.length-1
	 *    columnnum = columnnum *26 +s.indexOf(columnName.charAt(i));
	 *  end for
	 * end if
	 * return columnnum;  
	 */
	
	public int titleToNumber(String columnTitle) {
        String s= "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int columnNumber=0;
        if(columnTitle.length()>0){
            columnNumber=s.indexOf(columnTitle.charAt(0));
        for(int i=1;i<columnTitle.length();i++)//BB
        {
            columnNumber = columnNumber * 26 + s.indexOf(columnTitle.charAt(i)); 
        }
        }
        return columnNumber;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(731, titleToNumber("ABC"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(28, titleToNumber("AB"));
	}
	
}
