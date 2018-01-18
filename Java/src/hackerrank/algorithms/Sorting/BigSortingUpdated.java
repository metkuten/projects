package hackerrank.algorithms.Sorting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSortingUpdated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String [] sortedSet = new String[inputNumber];
        for(int i=0 ;i <inputNumber ; i++){
            sortedSet[i] = scanner.next();
            String abc = "";
        }
        Arrays.sort(sortedSet);

        /*
        Arrays.sort(sortedSet, new Comparator<String>() {
            @Override
            public int compare(String arg0, String arg1) {
                if (arg0.length() > arg1.length())
                    return 1;
                else if (arg0.length() < arg1.length())
                    return -1;
                else if (arg0.length() == arg1.length()) {
                    for (int i = 0; i < arg0.length(); i++) {
                        if (arg0.charAt(i) > arg1.charAt(i))
                            return 1;
                        if (arg0.charAt(i) < arg1.charAt(i))
                            return -1;
                    }
                }
                return 0;
            }
        });*/

        for(String value : sortedSet){
            System.out.println(value);
        }
    }
}

