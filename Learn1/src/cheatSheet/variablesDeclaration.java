package cheatSheet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 22/04/14
 * Time: 13:25
 * To change this template use File | Settings | File Templates.
 */
public class variablesDeclaration {

    String var1;
    String var2 = "TEST";

    // Declare a (local) variable of type Person
    Person person;
    // Declare a (local) variable of type Person, create a new Object and assign the variable to this object.
    Person person1 = new Person();


    // Declare a array of type String
    String[] array;

    // Declare a array of type Person and create an array for this variable which can hold 5 Persons.
    Person arrayPerson[] = new Person[5];

    //  Declare a ArrayList variable which can hold objects of type Person
    ArrayList<Person> persons;

    // Create a new ArrayList with objects of type Person and assign it to the existing variable persons
        // persons = new ArrayList<Person>();

    // Declare a ArrayList variable which can hold objects of type Person and create a new Object for it.
    ArrayList<Person> persons1 = new ArrayList<Person>();

    LinkedList<Person> person2 = new LinkedList<Person>();

    LinkedHashMap<String, Person> linkedHashMap = new LinkedHashMap<String, Person>();





}
