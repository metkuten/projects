package sort;

/**
 * Created by nmetkute on 2/12/17.
 */
public class BubbleSortString {

    public static void main(String args[]) {
        String numberArr[] = {"Nishikant","Neha","Shatakshi","ABC","Metkute","Pramila"};


        for (int i = numberArr.length-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {

                if(numberArr[j-1].compareTo(numberArr[j])>0){
                    String temp = numberArr[j-1];
                    numberArr[j-1] = numberArr[j];
                    numberArr[j] = temp;
                }
            }
        }

        System.out.println("Final value="+numberArr.toString());
    }
}
