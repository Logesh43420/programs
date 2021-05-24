package streamapi;

import java.util.Arrays;
import java.util.List;

public class playground {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,3,4,5,1,2,3);
        // for min,max,count,sorted,limit,skip
        arr.stream().sorted().skip(2).forEach(System.out::println);
//        System.out.println(min);
    }
}
