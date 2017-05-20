package algo.BinaryTree;


public class MaximumDeth {
    public Node rootNode;
    public static void main(String[] args) {
        MaximumDeth maximumDeth = new MaximumDeth();
        maximumDeth.rootNode = new Node(1);

        maximumDeth.rootNode.left = new Node(2);
        maximumDeth.rootNode.right = new Node(3);

        maximumDeth.rootNode.left.left = new Node(4);
        maximumDeth.rootNode.left.right = new Node(5);

        maximumDeth.rootNode.left.left.left = new Node(6);
        maximumDeth.rootNode.left.left.right = new Node(7);

        System.out.println(maximumDeth.maxDepth());
    }

    public int maxDepth(){
        return maxDepth(rootNode);
    }

    public int maxDepth(Node node){
        if (null == rootNode)
            return 1;

        if(null == node.left && null == node.right){
            return 1;
        }

        return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }

}
