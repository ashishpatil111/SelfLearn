package Interface;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 22/04/14
 * Time: 12:10
 * To change this template use File | Settings | File Templates.
 */
public class BehaviourClass implements MyInterface{


    @Override
    public  String myName() {
        String name = "Ashish patil";
        return name;
    }

    @Override
    public Boolean sex() {
        Boolean male = true;
        return male;
    }

    @Override
    public int mobile() {
        int mobile = 4321;
        return mobile;
    }
}
