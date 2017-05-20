import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmetkute on 2/28/17.
 */
public class StaticBlock {

    private static List<String> csrfFilterExcludeList = new ArrayList<String>();

    static {
        csrfFilterExcludeList.add("testccs");
    }

    public static void main(String[] args) {
        System.out.println(csrfFilterExcludeList);
    }
}
