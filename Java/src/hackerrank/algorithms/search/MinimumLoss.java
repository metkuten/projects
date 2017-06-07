package hackerrank.algorithms.search;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        BigInteger[] array=new BigInteger[n];
        HashMap<BigInteger,Integer> h1=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            BigInteger a=new BigInteger(sc.next());
            h1.put(a,i);
            array[i]=a;
        }

        Arrays.sort(array);

        BigInteger min=new BigInteger("9999999999999");

        for(int i=0;i<n-1;i++)
        {
            BigInteger b1=array[i];
            BigInteger b2=array[i+1];
            b2=b2.subtract(b1);
            if(min.compareTo(b2)>0&&h1.get(array[i+1])<h1.get(array[i]))
                min=array[i+1].subtract(array[i]);
        }

        System.out.println(min);
    }

}
