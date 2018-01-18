package algo.BinaryTree.ImprovedBinaryTree;


public class BinaryTree {

    public Node search(Node node, int data) {

        if (node == null || node.data == data) {
            return node;
        }

        if (node.data > data) {
            return search(node.left, data);
        }

        return search(node.right, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public int maxDepth(Node node) {
        if (null == node)
            return 1;

        if (null == node.left && null == node.right) {
            return 1;
        }

        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }

    public int minDepth(Node node) {
        if (null == node)
            return 1;

        if (null == node.left && null == node.right) {
            return 1;
        }

        return Math.min(maxDepth(node.left), maxDepth(node.right)) + 1;
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void reverse(Node node) {
        if (node != null) {
            Node tempNode = node.right;
            node.right = node.left;
            node.left = tempNode;
            if (null != node.left) {
                reverse(node.left);
            }
            if (null != node.right) {
                reverse(node.right);
            }
        }
    }

    public int height(Node node) {
        if (node == null) {
            return 1;
        }
        return 1;
    }

    public Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}