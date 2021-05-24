package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class filter {
public static void main(String[] args) {
	
	List<Integer> list =Arrays.asList(1,2,3,5,6,7,8,9,10);
	List<Integer> remove =new ArrayList<>();
	ListIterator <Integer> ir =list.listIterator();
//	while(ir.hasNext())
//	{
//		int i=ir.next();
//		if(i%2==0)
//		{
//			remove.add(i);
//		}
//	}
//	System.out.println(remove);
	list.stream().filter(i->i>2).forEach(System.out :: println );
}
}
