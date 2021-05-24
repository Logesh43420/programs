import java.io.*;
import java.util.Scanner;

public class file {

	public static void main(String[] args)throws IOException
	{
        try 
        {
       File f= new File("C:\\Users\\ELCOT\\Documents\\test.t                                                xt");
       Scanner sc= new Scanner(f);
       while(sc.hasNext())
       {
    	   System.out.println(sc.nextLine());
       }
        }catch(FileNotFoundException e)
        {
           e.printStackTrace();
        }
      

	}

}
