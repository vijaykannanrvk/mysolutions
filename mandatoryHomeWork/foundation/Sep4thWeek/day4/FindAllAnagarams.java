package mysolutions.mandatoryHomeWork.foundation.Sep4thWeek.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class FindAllAnagarams {
	public boolean isAnagaram(String s,int[] alphabet)
    {
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) {
            return false;
            }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        int[] alphabet = new int[26];
        for (int i = 0; i < p.length(); i++) alphabet[p.charAt(i) - 'a']++;
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<=s.length()-p.length();i++)
        {
            if(isAnagaram(s.substring(i,i+p.length()),alphabet.clone()))
            result.add(i);
        }
        return result;
    }
    
    @Test
    public void test1()
    {
    	System.out.println(findAnagrams("cbaebabacd", "abc"));
    	Assert.assertEquals(true, Arrays.asList(new int[] {0,6}).equals(findAnagrams("cbaebabacd", "abc")));
    }
}
