import java.util.Scanner;

public class Conditional3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score on the test: ");
        double input = scanner.nextDouble();

        double FirstPlaceScore = 100.0;
        double SecondPlaceScore = 80.0;
        double ThirdPlaceScore = 60.0;

        boolean FirstScore = input >= FirstPlaceScore;
        boolean SecondScore = input >= SecondPlaceScore;
        boolean ThirdScore = input >= ThirdPlaceScore;

        if (FirstScore) {
            System.out.println("You scored first place!");
        } else if (SecondScore) {
            System.out.println("You scored second place!");
        } else if (ThirdScore) {
            System.out.println("You scored third place!");
        } else {
            System.out.println("Sorry, you scored very low.");
        }


        scanner.close();
    }
}
