package typeofinerface;
import java.util.function.*;

public class functional {
	public static void main(String[] args) {
		Function <Integer,String > f= t->t*10+" data is multiplied by 10";
		System.out.println(f.apply(2));
	}

}
