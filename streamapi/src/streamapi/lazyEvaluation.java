package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class lazyEvaluation {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6);
        ListIterator<Integer> iter=arr.listIterator();
        while(iter.hasNext()){
            int i=iter.next();
            if(i%2==0){
                System.out.println(i);
                break;
            }
        }

        //using streams
//        int first=arr.stream().filter(i->i%2==0).findFirst().orElse(0);
        arr.stream().filter(lazyEvaluation::condition).forEach(System.out::println);

//        System.out.println(first);
    }
    public static boolean condition(Integer i){
        System.out.println("inside condition "+i);
        return i%2==0;
    }
}
