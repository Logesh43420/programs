package typeofinerface;
import java.util.function.Predicate;
public class predicate {

	public static void main(String[] args) {

   Predicate <String> p= s-> s.length()>5;
   System.out.println("TRUE /FALSE\n "+p.test("abcd"));
	}

}
