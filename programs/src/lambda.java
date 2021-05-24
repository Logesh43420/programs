
public class lambda {
	public static void main(String [] args)
	{
		//sumof two numbers
		sum s=(x,y)->System.out.println("sum is " +(x+y));
		s.add(10,20);
		
		int length=20;
		functionalinterfacesub f=()->System.out.println("lenght is"+length);
		f.length();
		}

}
