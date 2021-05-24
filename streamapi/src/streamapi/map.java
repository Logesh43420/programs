package streamapi;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        List<Employee> empArr=Arrays.asList(new Employee("pramod",1,100)
                ,new Employee("vinod",2,200),new Employee("binod",3,300) );
        //old method
        ListIterator<Employee> iter=empArr.listIterator();
        List<Double> salaries=new ArrayList<>();
        while(iter.hasNext()){
            salaries.add(iter.next().getSalary());
        }
        System.out.println(salaries);

        //using function interface
        Function<Employee,Double> obj=new Function<Employee, Double>() {
            @Override
            public Double apply(Employee employee) {

                return employee.getSalary();
            }
        };
        List<Double> arr=empArr.stream().map(obj).collect(Collectors.toList());
        System.out.println(arr);

        //using lambda expression
        List<Double> arr1=empArr.stream().map(i->i.getSalary()).collect(Collectors.toList());
        System.out.println(arr1);

        //using method references
        List<Double> arr2=empArr.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(arr2);
    }
}
