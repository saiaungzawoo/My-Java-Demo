package streams;

import java.util.ArrayList;
import java.util.List;

public class MoreStreamsDemo {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Sai", 3));
        employees.add(new Employee(2,"Som", 5));
        employees.add(new Employee(3,"Serry", 13));
        employees.add(new Employee(4,"Doxy", 1));
        employees.add(new Employee(5,"Lucy", 15));


        //normal way
        int aboveTen = 0;

        for(Employee e : employees){
            if(e.getYearsOfService() > 10){
                aboveTen++;
                System.out.println(e.getName());
            }

        }

        System.out.println("Number: " + aboveTen);


        //using streams
        long tenAbove = employees.stream()
                .filter(e -> e.getYearsOfService() > 10).count();

        System.out.println(tenAbove);

        //get first letter of the name
        //normal way

        for(Employee e : employees){
            if(e.getName().startsWith("S")){
                System.out.println(e.getName());
            }
        }
        System.out.println();



        //using streams
        List<Employee> startsWithS = employees.stream()
                .filter(n -> n.getName().startsWith("S"))
                .toList();

        startsWithS.forEach(n -> System.out.println(n.getName()));




    }
}
