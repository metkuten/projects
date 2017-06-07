package algo.BinaryTree;

public class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }

    protected Node search(int data) {
        if (this.data == data) {
            return this;
        }
        if (this.left != null && data < this.data) {
            return this.left.search(data);
        }

        if (this.right != null) {
            return this.right.search(data);
        }
        return null;
    }

    private void insert(int data) {
        if (data < this.data) {
            if (this.left == null)
                this.left = new Node(data);
            else
                this.left.insert(data);
        } else {
            if (this.right == null)
                this.right = new Node(data);
            else
                this.right.insert(data);
        }
    }

    protected void insert(Node node, int[] values){
        for(int value: values){
            node.insert(value);
        }
    }

    /* A recursive function to insert a new data in BST */
    protected Node delete(Node root, int data)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;

        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);

            // if data is same as root's data, then This is the node
            // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            //root.data = minValue(root.right);
            root.data = minimumElement(root.right).data;

            // Delete the inorder successor
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    private Node minimumElement(Node root) {
        if (root.left == null)
            return root;
        else {
            return minimumElement(root.left);
        }
    }

    protected int smallest(Node root){
          if(root.left == null){
              return root.data;
          }
          return smallest(root.left);
    }

    protected int largest(Node root){
        if(root.right == null){
            return root.data;
        }
        return largest(root.right);
    }


}
