package java8.Stream;


import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("nishikant");
        names.add("metkute");

        names.stream()
                .filter(name -> name.contains("nis"))
                .forEach(name -> System.out.println(name.toUpperCase()));

        //System.out.println(names)
;
    }
}
