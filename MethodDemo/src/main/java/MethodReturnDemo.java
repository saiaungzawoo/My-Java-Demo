public class MethodReturnDemo {

    public static void main(String[] args) {

        int value = 5;
        int output = sum(value);
        System.out.println(output);



    }

    //define//
    static int sum(int num) {

        return num * (num + 1) / 2;

    }

}
