import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethodAccess {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        PrivateClass privateMethodAccess = new PrivateClass();
        Class privateClass = privateMethodAccess.getClass();
        Method method = privateClass.getDeclaredMethod("print",null);
        method.setAccessible(true);
        method.invoke(privateMethodAccess);
    }
}

class PrivateClass {
    private void print() {
        System.out.println("########Private method called");
    }
}
