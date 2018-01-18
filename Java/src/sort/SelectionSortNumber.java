package sort;


/**
 *      imp: it puts lowerst number at the start.
 *      1) set i to the 0th element of array,  and iterate back till end of array.
 *      2) start j to i+1th position, iterate till end of array
 *      3) check if jth element is lesser than ith element, if so then swipe else continue iteration.
 */
public class SelectionSortNumber {
    public static void main(String args[]) {
        int numberArr[] = {3, 2, 6};

        for (int i = 0; i < numberArr.length-1; i++) {
            for (int j = i + 1; j < numberArr.length; j++) {
                if (numberArr[j] < numberArr[i]) {
                    int temp = numberArr[i];
                    numberArr[i] = numberArr[j];
                    numberArr[j] = temp;
                }
            }
        }
        for(int i: numberArr){
            System.out.print(i);
        }
    }
}
