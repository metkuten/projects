package algo;

import java.util.Arrays;

public class StackEx<E> {
    public static void main(String[] args) {
        String name = "Nishikant";
        String lastName = "Metkukte";
        Stack stack = new Stack();
        //stack.push(name);
        //stack.push(lastName);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class Stack<E> {

    int size = 10;
    int counter = 0;

    public Object[] array = new Object[size];


    public void push(E item){
        checkCapacity();
        array[counter] = item;
        counter++;
    }

    private void checkCapacity(){
        if(array.length == size){
            int newSize = size *2;
            array = Arrays.copyOf(array,newSize);
        }
    }

    public Object pop(){
        counter--;
        Object obj = array[counter];
        return obj;
    }
}
