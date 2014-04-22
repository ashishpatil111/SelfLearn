package inheritance;


/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 22/04/14
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */

// here by using extends word, a subclass can inherit properties, methods of superclass.

public class ChildClass extends ParentClass {

    public static void main (String [] args){
      hi();
    }
    static void hi(){
        System.out.print("Hi from child class.\n");


        String h = hello(); // as its an extended class.
        //or
        //String hello = ParentClass.hello();  // In case if class is not extended, we need to use full qualified name.



        System.out.println(h);
        //or
        //System.out.println(ParentClass.hello());
    }


}
