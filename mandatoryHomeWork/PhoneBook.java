package mysolutions.mandatoryHomeWork;
import java.util.*;
import java.io.*;

public class PhoneBook {
		public static void main(String []argh)
		{
			Scanner in = new Scanner(System.in);
	        Map<String,Integer> mymap =new HashMap();
	        System.out.println("Enter n");
	        int n=in.nextInt();
			in.nextLine();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter name");
				String name=in.nextLine();
				int phone=in.nextInt();
	            mymap.put(name, phone);
				in.nextLine();
			}
	        String result="";
			while(in.hasNext())
			{        
				System.out.println("search name");
				String s=in.nextLine();
	            if(mymap.containsKey(s)&&result.isEmpty())
	            {
	                result=result+s+"="+mymap.get(s);
	            }
	             else if  (mymap.containsKey(s))   
	             {
	                result=result+"\n"+s+"="+mymap.get(s);
	             }else{
	                 result=result+"\n"+"Not found";
	             }
	        }
	        System.out.println(result);
	   }   
}
