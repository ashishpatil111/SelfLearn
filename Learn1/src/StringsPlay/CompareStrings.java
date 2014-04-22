package StringsPlay;

/**
 * Created with IntelliJ IDEA.
 * User: asp
 * Date: 22/04/2014
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 */
public class CompareStrings {


    public static void main(String[] args) {

        String s1 = "I love java";
        String s2 = "i Love Java";


        // use equals method to compare strings.
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else if (s1.equalsIgnoreCase(s2))
            System.out.println("Strings are equal in ignore case");
        else
            System.out.println("Strings are not equal");


        // Working with Strings

        System.out.println("ilovejava".equals(s2)); //false

        System.out.println("i love java".equalsIgnoreCase(s2)); //true

        System.out.println(s1.charAt(4)); // v

        System.out.println(s1.substring(3));  //ove java

        System.out.println(s1.substring(2, 5)); //lov

        System.out.println(s1.indexOf("v")); //4

        System.out.println(s1.lastIndexOf("ve")); //4

        System.out.println(s1.endsWith("va")); // true

        System.out.println(s1.endsWith("ve")); // false

        System.out.println(s1.startsWith("I")); // true

        System.out.println(s1.trim()); // Removes leading and trailing spaces.

        System.out.println(s1.replace(s1, s2));

        System.out.println(s1.toLowerCase());

        System.out.println(s1.toUpperCase());

        System.out.println(s1.concat(s2));

        System.out.println(s1 + s2);  //concate

        String[] array = s1.split(" ");
        System.out.println(array[1] + "\n" + array[2]);  //love


    }


}

