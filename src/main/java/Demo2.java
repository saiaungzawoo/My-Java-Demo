public class Demo2 {
    public static void main(String[] args) {

        String text = "this is a text";
        String NotText = "this is not a text";

        /*System.out.println(text + " " + "and" + " " + NotText); */

        String dumbo = text + " " + NotText;
        System.out.println(dumbo.toUpperCase());

        String dumbo1 = dumbo.toUpperCase();
        String dumbo2 = dumbo.toLowerCase();
        String dumbo3 = String.valueOf(dumbo.length());

        System.out.println(dumbo1);
        System.out.println(dumbo2);
        System.out.println(dumbo3);
    }
}

