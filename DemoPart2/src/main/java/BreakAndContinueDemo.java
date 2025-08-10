public class BreakAndContinueDemo {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {

            if (i == 5){ //terminate at this code//
                break;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <=20 ; i++) {

            if (i == 6){  //skip over this code//
                continue;
            }
            System.out.println(i);
        }
    }
}
