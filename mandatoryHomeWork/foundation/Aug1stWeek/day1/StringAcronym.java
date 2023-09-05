package mysolutions.mandatoryHomeWork.foundation.Aug1stWeek.day1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class StringAcronym {

	public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size())
            return false;
        for(int i=0;i<words.size();i++)
        {
            if(s.charAt(i)!=words.get(i).charAt(0))
            {
                return false;
            }
        }
        return true;
    }
	
	@Test
	public void test1() {
		Assert.assertEquals(true, isAcronym(Arrays.asList("alice","bob","charlie"), "abc"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isAcronym(Arrays.asList("alice","arnold","charlie"), "abc"));
	}
}
