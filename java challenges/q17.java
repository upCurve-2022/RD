

class q17{

    // A Binary Tree Node
    static class Node
    {
        public int data;
        public Node left, right;
    };

    // Function to print leaf
// nodes from left to right
    static void printLeafNodes(Node root)
    {

        // If node is null, return
        if (root == null)
            return;

        // If node is leaf node, print its data
        if (root.left == null &&
                root.right == null)
        {
            System.out.print(root.data + " ");
            return;
        }

        if (root.left != null)
            printLeafNodes(root.left);


        if (root.right != null)
            printLeafNodes(root.right);
    }

    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }


    public static void main(String []args)
    {


        Node root = newNode('a');
        root.left = newNode('f');
        root.right = newNode('b');
        root.left.left = newNode('h');
        root.right.left = newNode('e');
        root.right.right = newNode('c');
        root.right.left.left = newNode('d');
        root.left.right = newNode('g');
        root.left.right.right = newNode('k');


        printLeafNodes(root);
    }
}
