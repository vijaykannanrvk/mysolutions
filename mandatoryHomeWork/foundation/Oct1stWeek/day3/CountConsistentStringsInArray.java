package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day3;

public class CountConsistentStringsInArray {
	public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> mySet = new HashSet();
        int counter=0;
        for(int i=0;i<allowed.length();i++)
        mySet.add(allowed.charAt(i));

        for(int i=0;i<words.length;i++)
        {
            int j=0;
            for(;j<words[i].length();j++)
            {
                if(!mySet.contains(words[i].charAt(j)))
                break;
            }
            if(j==words[i].length())
            counter++;
        }
    return counter;
    }
}
