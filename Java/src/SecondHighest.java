import java.util.Arrays;

/**
 * Created by nmetkute on 2/4/17.
 */
public class SecondHighest {

    public static void main(String args[]){
        int num[] = {2,6,3,1,6,7,8};

        Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }
}
