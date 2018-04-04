package algo.LinkedList;

class Node<E> {
    protected E data;
    protected Node<E> next;

    protected Node(E data, Node<E> node) {
        this.data = data;
        this.next = node;
    }
    protected Node() {

    }
}

class LinkedList<E> {

    protected int size;
    Node<E> firstLink;

    public LinkedList() {
        firstLink = null;
    }

    public void addNode(E data) {
        Node<E> newNode = new Node(data, firstLink);
        firstLink = newNode;
        size++;
    }

    public void printList() {
        Node<E> link = firstLink;
        while (link != null) {
            System.out.print(link.data + " ");
            link = link.next;
        }
    }

    /*public void insertNode(E node,int position){
        Node<E> link = firstLink;

        if(position == 0) {
            Node<E> newNode = new Node(node, link);
            firstLink = newNode;
        } else {
            int i =1;
            while (i <= position) {
                if (i == position) {
                    Node<E> newNode = new Node(node, link.next);
                    link.next = newNode;
                }
                link = link.next;
                i++;
            }
        }
    }*/

    public void insertNode(E node, int position) {
        /*
        Node<E> link = firstLink;
        if (position == 0) {
            Node<E> newNode = new Node<>(node, link);
            firstLink = newNode;
        } else {
            for (int i = 1; i <= position; i++) {
                if (i == position) {
                    Node<E> newNode = new Node(node, link.next);
                    link.next = newNode;
                }
                link = link.next;
            }
        }
        */

        Node<E>  newNode = new Node(node, null);
        Node tempNode = firstLink;
        if(position == 0) {
            newNode.next = tempNode;
        } else {
            int counter = 0;
            while(tempNode.next != null){
                if(position == counter){
                    newNode.next = tempNode.next;
                    tempNode.next = newNode;
                } else {
                    tempNode = tempNode.next;
                    counter++;
                }
            }
        }
    }

    public void deleteNote(int position) {
        Node<E> current = firstLink;
        Node<E> prev = firstLink;
        if (position == 0) {
            firstLink = firstLink.next;
        } else {
            for (int i = 1; i <= position; i++) {
                prev = current;
                current = current.next;
                if (i == position) {
                    prev.next = current.next;
                }
            }
        }
    }

    public void reverse() {
        Node reverseNode = null;
        Node current = firstLink;
        while (current != null) {
            Node next = current.next;
            current.next = reverseNode;
            reverseNode = current;
            current = next;
        }
        firstLink = reverseNode;
    }

    public void reversePrintList() {
        this.reversePrint(firstLink);
    }


    public void reversePrint(Node node) {
        if(node == null){
            return;
        }
        reversePrint(node.next);
        System.out.println(node.data);
    }
}

public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList();
        linkedList.addNode("1");
        linkedList.addNode("2");
        linkedList.addNode("3");

        System.out.print("Before insert=");
        linkedList.printList();

        System.out.print("\nAfter insert=");
        linkedList.insertNode("2.5", 2);
        linkedList.printList();


        /*linkedList.deleteNote(1);
        System.out.print("\nAfter delete=");
        linkedList.printList();*/

        linkedList.reverse();
        System.out.print("\nAfter reverse=");
        linkedList.printList();

        /*System.out.print("\nAfter print Reverse=");
        linkedList.reversePrintList();*/
    }
}
