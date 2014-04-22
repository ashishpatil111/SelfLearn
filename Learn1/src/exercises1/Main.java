package exercises1;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 22/04/14
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String [] args){

        Person person = new Person("Ashish","Patil",25);
        Address address = new Address("Syney Grove","Tyne", 234324);

        person.setLastName("Patil111");
        person.writeName();




        person = new Person("Vijay","Patil",32);
        System.out.println("\n\n\n FristName = "+person.getFirstName()+"\n");

        if(person.getFirstName().equals("Vijay"))
            person.setFirstName("Hemant");

        person.writeName();

       person.setAddress(address);

       address =  null;

        System.out.println("\n Area = "+person.getAddress().getArea()
                           +"\n City = "+person.getAddress().getCity()
                            +"\n PostCode = "+person.getAddress().getPin());
    }
}
