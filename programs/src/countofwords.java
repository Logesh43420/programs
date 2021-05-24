import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class countofwords
{

	public static void main(String[] args) 
	{
		  
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Student's Article");
	     String s= sc.nextLine().toLowerCase();
	     String result[]=s.split("[\\s,;:.?!]+");
	     System.out.println("Number of words "+result.length);
	     Set<String> set = new HashSet<>(Arrays.asList(result));
	     System.out.println("Number of unique words "+set.size());	          
         Map<String,Integer>  map = new TreeMap<String, Integer> ();
         for(String element: result)
         {
        	 if(!element.isEmpty())
        	 {
        		 map.put(element, map.getOrDefault(element, 0)+1);        	
        		 
        	 }
         	}
	     
	    for(Map.Entry<String ,Integer>entry :map.entrySet())
	    {
	    	System.out.println(entry.getKey()+":"+entry.getValue());
	    }
	}
}