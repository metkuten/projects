package algo;


import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 class Queue_Ex1 {

    Scanner scan;
    Queue<Integer> queue;

    int n;

    void insert() {

        scan = new Scanner(System.in);
        queue = new LinkedList<Integer>();

        System.out.println("Integer Queue - Insert & Delete");

        System.out.println("\nEnter 'n' value :");
        n = scan.nextInt();

        System.out.println("Enter the elements");

        for(int i=0; i<n; i++) {

            queue.add(scan.nextInt());
        }
    }

    void delete() {

        System.out.println("\nThe Queue");

        while(!queue.isEmpty()) {

            System.out.println(queue.poll());
        }
    }
}

class QueueMore {

    public static void main(String args[]) {

        Queue_Ex1 obj = new Queue_Ex1();

        obj.insert();
        obj.delete();;
    }
}
