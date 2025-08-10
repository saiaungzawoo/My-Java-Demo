public class ForLoopDemo {
    public static void main(String[] args) {

        //print 5 times//
        for(int loop = 0; loop < 5; loop++){
            System.out.println("Hello, world!");
        }

        //increment by 2//
        for (int loop = 2; loop <=10 ; loop = loop + 2) {
            System.out.println(loop);
        }

        //count down 10 to 0//
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);
        }

        //count down by 3//
        //9 to 0//
        for (int i = 9; i >=0 ; i = i -3) {
            System.out.println(i);
        }
    }
}
