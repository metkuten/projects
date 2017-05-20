package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("nishikant");
        names.add("metkute");

        names.forEach(name -> System.out.println(name));
    }
}
