
public class ArrayReverse {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        for(int i: numbers){
            System.out.print(i);
        }
    }
}
