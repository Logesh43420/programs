package streamapi;
import java.util.*;
public class parallelStream {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6);
//        arr.parallelStream().forEach(i->parallelStreamExam(i));
        arr.parallelStream().forEachOrdered(i->parallelStreamExam(i));
    }
    public static void parallelStreamExam(int i){

        System.out.println(Thread.currentThread().getName());
        System.out.println(i);
    }

}
