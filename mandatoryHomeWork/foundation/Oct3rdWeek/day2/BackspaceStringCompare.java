package mysolutions.mandatoryHomeWork.foundation.Oct3rdWeek.day2;

public class BackspaceStringCompare {
	    public boolean backspaceCompare(String s, String t) {
	        String newS="",newT="";
	        int i=0;
	        for(;i<s.length()&&i<t.length();i++)
	        {
	            if(s.charAt(i)=='#')
	            {
	            if(newS.length()!=0)
	            newS=newS.substring(0,newS.length()-1);
	            }
	            else
	            newS=newS+s.charAt(i);

	            if(t.charAt(i)=='#')
	            {
	            if(newT.length()!=0)
	            newT=newT.substring(0,newT.length()-1);
	            }
	            else
	            newT=newT+t.charAt(i);
	        }
	        while(i<t.length())
	        {
	            if(t.charAt(i)=='#')
	            {
	            if(newT.length()!=0)
	            newT=newT.substring(0,newT.length()-1);
	            }
	            else
	            newT=newT+t.charAt(i);
	            i++;
	        }
	        while(i<s.length())
	        {
	            if(s.charAt(i)=='#')
	            {
	            if(newS.length()!=0)
	            newS=newS.substring(0,newS.length()-1);
	            }
	            else
	            newS=newS+s.charAt(i);
	            i++;
	        }
	        return newS.equals(newT);
	    }
}
