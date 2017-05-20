package algo;

public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList();
        linkedList.addNode("1");
        linkedList.addNode("2");
        linkedList.addNode("3");

        linkedList.insertNode("4",3);

        linkedList.deleteNote(3);

        System.out.println("");
        linkedList.printList();
        System.out.println("");
        linkedList.reverse();
        linkedList.printList();
        System.out.println("");
    }
}

class Node<E> {
    protected E data;
    protected Node<E> next;

    protected Node(E data, Node<E> node){
        this.data= data;
        this.next = node;
    }
}

class LinkedList<E>{

    protected int size;
    Node<E> firstLink;

    public LinkedList(){
        firstLink = null;
    }

    public void addNode(E data){
        Node<E> newNode = new Node(data,firstLink);
        firstLink = newNode;
        size++;
    }

    public void printList(){
        Node<E> link = firstLink;
        while(link!=null){
            System.out.print(link.data);
            link = link.next;
        }
    }

    public void insertNode(E node,int position){
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
    }

    public void deleteNote(int position){
        Node<E> current = firstLink;
        Node<E> prev = firstLink;
        if(position == 0){
            firstLink = firstLink.next;
        }else {
            for (int i = 1; i <= position; i++) {
                prev = current;
                current = current.next;

                if (i == position) {
                    prev.next = current.next;
                }
            }
        }
    }

    public void reverse(){
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
}
