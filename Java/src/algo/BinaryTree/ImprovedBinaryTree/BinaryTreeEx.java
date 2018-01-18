package algo.BinaryTree.ImprovedBinaryTree;

public class BinaryTreeEx {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node node = new Node(10);
        node = binaryTree.insert(node, 5);
        node = binaryTree.insert(node, 3);
        node = binaryTree.insert(node, 20);
        node = binaryTree.insert(node, 25);
        node = binaryTree.insert(node, 15);
        node = binaryTree.insert(node, 30);
        node = binaryTree.insert(node, 22);

        Node searchNode = binaryTree.search(node,22);
        System.out.println(searchNode.data);
        System.out.println("Max depth="+binaryTree.maxDepth(node));
        System.out.println("Min depth="+binaryTree.minDepth(node));
        System.out.println("#####preorder=");
        binaryTree.preOrder(node);
        System.out.println("#####postorder=");
        binaryTree.postOrder(node);
        System.out.println("#####inorder=");
        binaryTree.inOrder(node);
        System.out.println("#####reverse node=");
        System.out.println("#####delete");
        binaryTree.deleteNode(node, 25);
        binaryTree.reverse(node);
        System.out.println("#####reverse end");
    }
}
