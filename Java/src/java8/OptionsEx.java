package java8;

import java.util.ArrayList;
import java.util.Optional;

public class OptionsEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nishikant");
        names.add("metkute");

        String abc = "nishikant";

        names.stream().map(value -> value.toUpperCase());

        //Optional.ofNullable(names).map(value-> "abc");

        System.out.println(names);
    }
}
