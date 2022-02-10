public class Grunnkonsepter {
    public static void main(String[] args) {

        /* System.out.println(args[0] + " " + args[1]); */
        System.out.println(args[0] + " " + args[1]);
        System.out.println();
        System.out.println();
        System.out.println();


        int number = 10;
        if (number < 5) {
            System.out.println("The number is less than 5. ");

        } else if (number > 15) {
            System.out.println("The number is greater than 15.");
        } else {
            System.out.println("The number is greater than 5, but less than 15");
        }

        if (number == 10) {
            System.out.println("Yippy! the number is 10");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int iteration = 0;
        while (iteration < 5) {
            System.out.println(iteration);
            iteration++;
        }

        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }
        System.out.println();
        for (int x = 5; x > 0; x -= 2) {
            System.out.println(x);
        }
        System.out.println();
        printSomething();

        System.out.println();
       /* printNumbersTo(endNumber()); */
        System.out.println();
        System.out.println(returnTheBestNumber());

    }
    public static void printSomething() {
        System.out.println("Something");
    }
    public static void printNumbersTo(int endNumber){
        for (int x = 0; x <= endNumber; x++) {
            System.out.println(x);
        }


    }
    public static int returnTheBestNumber() {
        return 69;
    }
}
