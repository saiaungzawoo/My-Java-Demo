public class ArraysDemo {

    public static void main(String[] args) {

        double[] grades = new double[5];

        grades[0] = 20.1;
        grades[1] = 90.1;
        grades[2] = 30.1;
        grades[3] = 70.1;
        grades[4] = 50.1;

        for(double result : grades){
            System.out.println("Grades: " + result);
        }

    }
}
