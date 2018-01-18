package sort;

public class InsertionSortNumber {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,3};
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i;
            for (; j > 0 && temp < numbers[j - 1]; j--) {
                System.out.print(numbers[j]);
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = temp;
        }
        for (int i : numbers) System.out.print(i);
    }
}

