package mysolutions.mandatoryHomeWork.foundation.Oct1stWeek.day1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class DestinationCity {
	    public String destCity(List<List<String>> paths) {
	        String destination=paths.get(0).get(1);
	        for(int i=1;i<paths.size();i++)
	        {
	         List<String> list = paths.get(i);
	         if(destination.equals(list.get(0)))
	         {
	             destination =list.get(1);
	             i=-1;
	         }
	        }
	         return destination;
	    }
	    
	    @Test
	    public void test1()
	    {
	    	Assert.assertEquals("Sao Paulo", destCity(Arrays.asList(Arrays.asList(new String[] {"London","New York"}),Arrays.asList(new String[] {"New York","Lima"}),Arrays.asList(new String[] {"Lima","Sao Paulo"}))));
	    }

}
