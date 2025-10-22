package streams;

public class Employee {

    private int id;
    private String name;
    private int yearsOfService;

    public Employee(int id, String name, int yearsOfService){
        this.id = id;
        this.name = name;
        this.yearsOfService = yearsOfService;


    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getYearsOfService(){
        return yearsOfService;
    }
}
