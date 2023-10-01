package mysolutions.mandatoryHomeWork;

public class AllAlphabets {
	
	public boolean isAllAlphabets(String S)
	{
	if(S.length()>=26)
	{
	 short[] alphabets = new short[26];
	 for(int i=0;i<S.length();i++)
		 alphabets[S.charAt(i)-97]++;
	 for(int i=0;i<alphabets.length;i++)
		 if(alphabets[i]<1)
			 return false;
	}
	else
		return false;
			 
	 
	 return true;
	}
}
