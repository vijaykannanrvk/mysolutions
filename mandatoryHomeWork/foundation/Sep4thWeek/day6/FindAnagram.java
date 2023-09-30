package mysolutions.mandatoryHomeWork.foundation.Sep4thWeek.day6;

import java.util.HashMap;

public class FindAnagram {

	public boolean isAnagram(String s,String a)
	{
		HashMap<Character,Integer> sMap = new HashMap();
		HashMap<Character,Integer> aMap = new HashMap();
		for(int i=0;i<s.length();i++)
		{
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
		}
		for(int i=0;i<a.length();i++)
		{
			aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0)+1);
		}
		return sMap.equals(aMap);
	}
}
