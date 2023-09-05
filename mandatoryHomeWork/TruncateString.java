package mysolutions.mandatoryHomeWork;

public class TruncateString {
	
	public String truncate(String s,int k)
	{
		int startpos=0;
        for(int i=0;i<k;i++)
        {
            if(s.indexOf(" ",startpos+1)!=-1)
            {
            startpos=s.indexOf(" ",startpos+1);
            }
            else
            {
                return s;
            }
        }
        return s.substring(0,startpos);
	}

	
}
