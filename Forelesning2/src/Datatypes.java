import java.util.Arrays;

public class Datatypes {
    public static void main(String[] args) {

        int number;

        //System.out.println(number);
        number = 42;
        System.out.println(number);
        System.out.println();
        long longNumber = 69_69_69_69_69_69_00L;
        System.out.println();
        //System.out.println(number+longNumber);
        long sum = number + longNumber;
        System.out.println(sum);
        System.out.println();
        double doubleNumber = 2.97389234822222222222394;
        System.out.println(doubleNumber);
        float floatNumber = 45.343432432F;
        System.out.println(floatNumber);
        System.out.println();
        int decimalToInt = (int)doubleNumber;

        System.out.println(decimalToInt);
        System.out.println();

        int newNumber = number;
        System.out.println(newNumber + "\n");
        number = 69;

        double[] arrayOfDoubles = new double[4];
        System.out.println();
        arrayOfDoubles[3] = 6.9;
        arrayOfDoubles[0] = 4.2;
        System.out.println(Arrays.toString(arrayOfDoubles));
    }
}
