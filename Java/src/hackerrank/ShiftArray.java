package hackerrank;

/**
 * Created by nmetkute on 2/13/17.
 */
public class ShiftArray {

    public static void main(String[] args) {
        int array[] = {2,3,5,7,9};
        int shift =1;

        for(int i=0;i<shift;i++){
            for(int j=0;j<array.length-1;j++){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}
