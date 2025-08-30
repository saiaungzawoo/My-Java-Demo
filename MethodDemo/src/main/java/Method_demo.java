public class Method_demo {

    //call the method//
    public static void main(String[] args) {
        greeting(2);
        greeting(3); //u can add more//
    }

    static void greeting(int count){
        for (int i = 1; i <=count ; i++) {

            greeting(); //use the method below, same name, diff param//
        }
    }

    //define the method//
    static void greeting() {
        System.out.println("Study");
        System.out.println("Rest");
        System.out.println("Sleep");
        System.out.println();
    }
}
