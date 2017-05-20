import java.util.Scanner;

public class GCDNumber {
    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(findGCD(number1,number2));
    }
    private static int findGCD(int number1 , int number2){
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2,number1%number2);
    }
}
