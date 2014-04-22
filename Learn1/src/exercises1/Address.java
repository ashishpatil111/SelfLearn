package exercises1;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 22/04/14
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
public class Address {

    String area, city;
    int pin;

    public Address(String area,String city, int pin){
        this.area = area;
        this.city = city;
        this.pin = pin;
    }


    //getters n setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}
