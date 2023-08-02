package mysolutions.mandatoryHomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class OccurenceOfCharacters {
	
	/*
	 * INPUT string
	 * OUTPUT map<char,int>
	 * 
	 * PSUEDO CODE
	 * map<char,int>
	 * for i loop from 0 to string length
	 *  if(!map.Keys.contains(s.charat(i)))
	 *   charcount =0
	 *   for j loop from i+1 to string length
	 *    if s.charat(i) == s.charat(j)
	 *      charcount++
	 *    end if
	 *   end for
	 *   map.put(s.charat(i),charcount)
	 *   end if
	 *   end for
	 *   return map 
	 */
	
	public Map<Character,Integer> occurence(String sentence)
	{
		sentence =sentence.toLowerCase();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < sentence.length(); i++) {
			if(!map.keySet().contains(sentence.charAt(i)))
			{
				int charcount=1;
				for (int j = i+1; j < sentence.length(); j++) {
					if(sentence.charAt(i)==sentence.charAt(j))
					{
						charcount++;
					}
				}
				map.put(sentence.charAt(i), charcount);
			}
		}
		return map;
		
	}
	
	@Test
	public void test1()
	{
		String sentence= "I want consistency";
		Map<Character,Integer> map = new HashMap<Character,Integer>(){{
		put('i', 2); 
		put(' ', 2);
		put('w', 1);
		put('a', 1);
		put('n', 3);
		put('t',2);
		put('c',2);
		put('o',1);
		put('s',2);
		put('e',1);
		put('y',1);}};
		Assert.assertEquals(map,occurence(sentence));		
	}
	
	@Test
	public void test2()
	{
		String sentence= "example";
		Map<Character,Integer> map = new HashMap<Character,Integer>(){{
		put('e', 2); 
		put('x', 1);
		put('a', 1);
		put('m', 1);
		put('p', 1);
		put('l',1);}};
		Assert.assertEquals(map,occurence(sentence));		
	}
	
	@Test
	public void test3()
	{
		String sentence= "Test";
		Map<Character,Integer> map = new HashMap<Character,Integer>(){{
		put('t', 2); 
		put('e', 1);
		put('s', 1);}};
		Assert.assertEquals(map,occurence(sentence));		
	}

}
