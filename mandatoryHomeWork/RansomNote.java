package mysolutions.mandatoryHomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class RansomNote {
 
	public boolean canConstructBruteForce(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++)
        {
            if(magazine.indexOf(ransomNote.charAt(i))!=-1)
            {
                magazine=magazine.replaceFirst(ransomNote.charAt(i)+"","");
                ransomNote=ransomNote.replaceFirst(ransomNote.charAt(i)+"","");
                i--;
            }
        }
        return ransomNote.equals("");
    }
	
	public boolean canConstructHashMap(String ransomNote, String magazine)
	{
		Map<Character,Integer> myMap= new HashMap<>();
		for(int i=0;i<ransomNote.length();i++)
		{
			myMap.put(ransomNote.charAt(i), myMap.getOrDefault(ransomNote.charAt(i), 0)-1);
		}
		
		for(int i=0;i<magazine.length();i++)
		{
			myMap.put(magazine.charAt(i), myMap.getOrDefault(magazine.charAt(i), 0)+1);
		}
		
		for(Entry<Character,Integer> entry : myMap.entrySet() )
		{
			if(entry.getValue()<0)
				return false;
		}
		return true;
		
	}
	
	public boolean canConstructArray(String ransomNote, String magazine)
	{
		short[] alphabet= new short[26];
		for(int i=0;i<ransomNote.length();i++)
		{
			alphabet[ransomNote.charAt(i)-97]--;
		}
		
		for(int i=0;i<magazine.length();i++)
		{
			alphabet[magazine.charAt(i)-97]++;
		}
		
		for(int i=0;i<alphabet.length;i++)
		{
			if(alphabet[i]<0)
				return false;
		}
		return true;
		
	}
	
	public boolean canConstructConcurrentHashMap(String ransomNote, String magazine)
	{
		
		Map<Character,Integer> myMap= new ConcurrentHashMap<>();
		
		for(int i=0;i<magazine.length();i++)
		{
			if(ransomNote.indexOf(magazine.charAt(i))!=-1)
			myMap.put(magazine.charAt(i), myMap.getOrDefault(magazine.charAt(i), 0)+1);
		}
		
		for(int i=0;i<ransomNote.length();i++)
		{
			if(myMap.get(ransomNote.charAt(i))==1)
			{
				myMap.remove(ransomNote.charAt(i));
			}
			else
				myMap.put(ransomNote.charAt(i), myMap.getOrDefault(ransomNote.charAt(i), 0)-1);
		}
		
		
		return myMap.isEmpty();
	}
}
