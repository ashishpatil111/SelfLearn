package StringsPlay;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: asp
 * Date: 22/04/2014
 * Time: 21:09
 * To change this template use File | Settings | File Templates.
 */
public class ConversionInString {

    static String s1 = "I love java";
    static String s2 = "223.123";
    static String s3 = "111";

    public static void main(String[] args) {


        othersToString();
        stringToNumbers();

    }

    public static void othersToString() {

//        Convert from int to String
        System.out.println(String.valueOf(10)); // "10" as a string

//        Convert from double to String
        System.out.println(String.valueOf(Math.PI)); // "3.141592653589793"

//        Convert from boolean to String
        System.out.println(String.valueOf(1 < 2));//"true"

//        Convert from date to String
        System.out.println(String.valueOf(new Date()));  // prints date as a string

    }

    public static void stringToNumbers() {

//        Conversion from String to int
        int i = Integer.parseInt(s3);
        System.out.println("Converted string into Integer i = " + i);

//        Conversion from String to double
        double d = Double.parseDouble(s2);
        System.out.println("Converted string into Double d = " + d);

//        Conversion from String to float
        float f = Float.parseFloat(s2);
        System.out.println("Converted string into float f = " + f);


//       Double to int
        int j = (int) d;
        System.out.println("double into integer j = " + j);


    }

}
