package typeofinerface;
import java.util.function.Consumer;  
public class consumer {  
    static void printMessage(String name){  
        System.out.println("Hello "+name);  
    }  
    static void printValue(int val){  
        System.out.println(val);  
    } 

    public static void main(String[] args) {  
        // Referring method to String type Consumer interface   
        Consumer<String> c = consumer::printMessage;  
       c.accept("John");   // Calling Consumer method  
        // Referring method to Integer type Consumer interface  
        Consumer<Integer> d = consumer::printValue;  
        d.accept(12);   // Calling Consumer method  
    }
}
