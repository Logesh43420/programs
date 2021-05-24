package programs;

public class reference
{	
	private String s;
	
	public interface myInterface
	{
		myclass get(String s);
	}
	public static void main(String[] args) {
		myInterface f= s->new myclass(s);
		f.get("using lamdas");
		
		myInterface f1=myclass::new;
		f1.get("using constructor");
	}
}