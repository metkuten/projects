package algo;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Nishikant");
        arrayList.add("Pandurang");
        arrayList.add("Metkute");
        System.out.print(arrayList);
    }
}

class ArrayList {
    int capacity = 2;
    int counter;
    public Object[] objectArr;

    ArrayList(){
        objectArr = new Object[capacity];
    }

    public void add(Object value){
        ensureCapacity();
        objectArr[counter] = value;
        counter++;
    }

    public void add(Object value, int position){
        for(int i= 0 ; i < objectArr.length ; i++){
            if(i==position){

            }
        }
    }

    private void ensureCapacity(){
        if(counter == capacity){
            capacity = capacity * 2;
            objectArr = Arrays.copyOf(objectArr,capacity);
        }
    }
}
