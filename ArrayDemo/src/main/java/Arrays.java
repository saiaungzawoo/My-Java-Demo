public class Arrays {

    public static void main(String[] args) {

        //init arrays//
        String[] colors = {"red", "blue", "yellow"};

        System.out.println(colors[0]);

        //length//
        System.out.println(colors.length);

        //enhanced loop - to print the contents//
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
