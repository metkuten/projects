package algo.BinaryTree;

public class MinimumDepth {
    public static Node root;
    public static void main(String[] args) {
        MinimumDepth minimumDepth = new MinimumDepth();
        minimumDepth.root = new Node(1);
        minimumDepth.root.left = new Node(2);
        minimumDepth.root.right = new Node(3);
        minimumDepth.root.left.left = new Node(4);
        minimumDepth.root.left.right = new Node(5);

        System.out.println("The minimum depth of "+
                "binary tree is : " + minimumDepth.minDepth(root));

    }
    private int minDepth(Node rootNode){
        if(rootNode == null){
            return 1;
        }
        return getMin(rootNode);
    }
    private int getMin(Node rootNode){
        if(null == rootNode){
            return 1;
        }
        if (rootNode.left == null && rootNode.right == null) {
            return 1;
        }
        return Math.min(getMin(rootNode.left),getMin(rootNode.right))+1;
    }
}
