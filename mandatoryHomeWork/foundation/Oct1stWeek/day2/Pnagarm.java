package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day2;

public class Pnagarm {
	public boolean checkIfPangram(String sentence) {
        boolean[] alphabets = new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            alphabets[sentence.charAt(i)-97] = true;
        }
        for(int i=0;i<26;i++)
        if(alphabets[i]==false)
        return false;

        return true;
    }
}
