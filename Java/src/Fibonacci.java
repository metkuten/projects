import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int number1 = 0;
        int number2 = 1;
        for(int i=0;i<range;i++){
            if(i==0){
                System.out.println(number1);
                continue;
            }
            if(i==1){
                System.out.println(number2);
                continue;
            }
            int addition = number1+number2;
            System.out.println(number1+number2);
            number1 = number2;
            number2 = addition;
        }
    }
}