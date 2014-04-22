package exercises1;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 22/04/14
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */
public class Person {



    String firstName;
    String lastName ;
    int age ;
    Address address;


    public  Person(String fN, String lN, int age){
        this.firstName= fN;
        this.lastName=lN;
        this.age = age;
    }

    public void writeName(){
        System.out.println("\n FirstName = "+firstName +"\n LastName = "+lastName +"\n Age = "+age);

    }


    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




}
