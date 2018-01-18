package algo;

import java.util.*;
import java.util.LinkedList;

public class QueueMore1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.poll());
        queue.peek();
    }
}
