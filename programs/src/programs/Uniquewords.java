package programs;
import java.util.Set; 
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Uniquewords
{

	public static void main(String[] args) 
	{
		  
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Student's Article");
	     String s= sc.nextLine();
	     s=s.toLowerCase();
	     String result[]=s.split("[\\s,;:.?!]+");
	     System.out.println("Number of words "+result.length);
	     Set<String> set = new HashSet<>(Arrays.asList(result));
	     System.out.println("Number of unique words "+set.size());	          
       
        TreeSet<String> treeSet = new TreeSet<>(set);
        Iterator<String> itr =treeSet.iterator();
       
        System.out.println("The words are");
        for(int j1=1;j1<=set.size();j1++)
        {
            System.out.println(j1+"."+itr.next());
	    	 
		}	   
	}
	}


