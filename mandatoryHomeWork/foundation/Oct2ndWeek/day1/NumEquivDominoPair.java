package mysolutions.mandatoryHomeWork.foundation.Oct2ndWeek.day1;

public class NumEquivDominoPair {
	    public int numEquivDominoPairs(int[][] dominoes) {
	        int count=0;
	        for(int i=0;i<dominoes.length-1;i++)
	         for(int j=i+1;j<dominoes.length;j++)
	         if(dominoes[i][0]==dominoes[j][0]&&dominoes[i][1]==dominoes[j][1])
	          count++;
	        else if(dominoes[i][0]==dominoes[j][1]&&dominoes[i][1]==dominoes[j][0])
	             count++;
	         return count;
	    }
}
