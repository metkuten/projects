package algo.BinaryTree;

public class NodeOperations {
    public static void main(String[] args) {
        Node rootNode = new Node(50);
        rootNode.insert(rootNode,new int[]{60,40,45,35,65});

        System.out.println(rootNode.search(35).data);
        rootNode.delete(rootNode,40);

        System.out.println(rootNode.smallest(rootNode));
        System.out.println(rootNode.largest(rootNode));
    }
}
