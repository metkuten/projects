package algo;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Nishikant");
        arrayList.add("Metkute");
        System.out.println(arrayList.toString());

    }
}

class ArrayList {
    int capacity = 10;
    int counter;
    public Object[] objectArr;

    ArrayList(){
        objectArr = new Object[5];
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
        if(objectArr.length == capacity){
            capacity = capacity * 2;
        }
    }
}
