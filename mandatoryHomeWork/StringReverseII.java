package mysolutions.mandatoryHomeWork;

import org.junit.Test;

import org.junit.Assert;

public class StringReverseII {
	    public String reverseStr(String s, int k) {
	        String output="";
	        int j=0;
	        int i=0;
	        if(k>s.length())
	        output=reverseS(s);
	        else
	        for(;i<=s.length()-k;i=i+k)
	        {
	            if(j%2==0)
	            output=output+reverseS(s.substring(i,i+k));
	            else
	            output=output+s.substring(i,i+k);
	            j++;
	        }
	        if(j%2!=0)
	        output=output+s.substring(output.length());
	        else
	        output=output+reverseS(s.substring(output.length()));
	        return output;
	    }

	    public String reverseS(String s)
	    {
	        int start=0,end=s.length()-1;
	        char[] sarray=s.toCharArray();
	        while(start<end)
	        {
	            char temp = sarray[start];
	            sarray[start]=sarray[end];
	            sarray[end]=temp;
	            start++;
	            end--;
	        }
	        return new String(sarray);
	    }
	    
	    @Test
	    public void test()
	    {
	    	Assert.assertEquals("bacdfeg", reverseStr("abcdefg",2));
	    }

}
