package streamapi;
import java.util.*;
import java.util.stream.Stream;

public class Introduction {
    public static void main(String[] args) {
           Object[] list=new Object[5];
        Stream<Object> s=Arrays.stream(list);

        //example
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> s3=arr.stream();

        ListIterator<Integer> iter= arr.listIterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        for(Integer i:arr){
            System.out.print("\n"+i+" ");
        }

        arr.stream().forEach(System.out::println);
    }
    public static Stream<Integer> getStream(){
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6);
        return arr.stream();
    }
}
