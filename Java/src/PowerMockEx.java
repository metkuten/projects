/**
 * Created by nmetkute on 2/26/17.
 */
public class PowerMockEx {

    public void getName(){
        String abc = "";
        abc = StaticClass.getName();
        String pqr = "";
    }


}

class StaticClass {
    public static String  getName(){
        return "Nishikant";
    }
}


