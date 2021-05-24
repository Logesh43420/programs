package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinct {
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,1,30,30,70, 90 ,30,30,20,20,50);
		List<Integer> dup = new ArrayList<>();
//		for(Integer i : list)
//		{
//			if(!dup.contains(i))
//			{
//				dup.add(i);
//			}
//		}
//		Collections.sort(dup);
//		System.out.println("duplicate"+dup);	
//	
 dup =list.stream().distinct().sorted().collect(Collectors.toList());
 System.out.println(dup);
}
}