package sort;

/**
 *
 *      **imp: it puts greater number at the end.
 *      1) set i to the length of the array (means i will indicate last element of array),  and iterate back till start(0 size).
 *      2) start j from 1 size(i.e. 0+1), iterate till less than or equal to i
 *      3) check if j-1th element is greater than jth element if so then swipe else continue iteration.
 *
 */
public class BubbleSortNumber {

    public static void main(String args[]) {
        int numberArr[] = {3, 2, 6, 9, 4, 1, 5, 8, 7};


        for (int i = numberArr.length-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {

                if(numberArr[j-1]>numberArr[j]){
                    int temp = numberArr[j-1];
                    numberArr[j-1] = numberArr[j];
                    numberArr[j] = temp;
                }
            }
        }

        for(int i: numberArr){
            System.out.print(i);
        }
    }
}
