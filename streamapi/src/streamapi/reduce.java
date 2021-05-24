package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.BinaryOperator;

public class reduce {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6);
        //old methods
        int sum=0;
        ListIterator<Integer> iter=arr.listIterator();
        while(iter.hasNext()){
            sum+=iter.next();
        }
        System.out.println(sum);
        //using functional interfaces and reduce remember BiFunction
        BinaryOperator<Integer> obj=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        int sum1=arr.stream().reduce(0,obj);
        System.out.println(sum1);

        //lambda expression
        int sum2=arr.stream().reduce(1,(i,i1)->i*i1);
        System.out.println(sum2);

        //method inference
        int sum3=arr.stream().reduce(0,Integer::sum);
        System.out.println(sum3);
    }
}
