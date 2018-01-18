import java.util.Scanner;

public class PrimeNumberOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        int sqNumber = (int)Math.sqrt(number) +1;
        for(int i = 2; i <sqNumber;i+=2){
            if(number ==2) {
                isPrime = true;
                break;
            }
            if(number%i == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}
