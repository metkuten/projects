import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <number;i++){
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
