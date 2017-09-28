import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");
        set.forEach(s -> System.out.println(s));
    }
}
