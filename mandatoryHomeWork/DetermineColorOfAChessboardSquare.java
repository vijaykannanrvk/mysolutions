package mysolutions.mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class DetermineColorOfAChessboardSquare {
	
	public boolean whatColor(String chessSquare)
	{
		String s="abcdefgh";
		if((s.indexOf(chessSquare.charAt(0))+1)%2==0&&Integer.parseInt(chessSquare.charAt(1)+"")%2!=0)
			return true;
		else if((s.indexOf(chessSquare.charAt(0))+1)%2!=0&&Integer.parseInt(chessSquare.charAt(1)+"")%2==0)
			return true;
		else return false;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, whatColor("b2"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, whatColor("e2"));
	}

}
