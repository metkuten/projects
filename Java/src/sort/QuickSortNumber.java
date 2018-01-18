package sort;

/**
 * Created by nmetkute on 2/12/17.
 */
public class QuickSortNumber {

    public static void main(String[] args) {
        int array[] = {2,5,3,4,8,6,1,9,7};
        quicksort(array,0,8);
        String abc = "";
    }

    public static void quicksort(int array[],int start, int end){
        if(start<end) {
            int partitionIndex = partition(array, start, end);
            quicksort(array,start,partitionIndex-1);
            quicksort(array,partitionIndex+1,end);
        }
    }

    public static int partition(int array[],int start, int end){
        int pivot = array[end];
        int partitionIndex = start;

        for(int i= start;i<end;i++){
            if(array[i]<=pivot){
                int temp = array[end];
                array[end] = array[i];
                array[i] = temp;
                partitionIndex++;
            }
        }
        int temp = array[partitionIndex];
        array[partitionIndex] = array[end];
        array[end] = temp;
        return partitionIndex;
    }
}
