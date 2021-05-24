package typeofinerface;
import java.util.function.*;
public class supplier {
public static void main(String[] args) {
	
	Supplier<Double > s= ()->Math.random();
	System.out.println(s.get());
}
}
