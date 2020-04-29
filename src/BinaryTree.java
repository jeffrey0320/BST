public class BinaryTree {
    public Node root;

    public BinaryTree()
    {
        root = null;
    }

    public BinaryTree(int value)
    {
        root = new Node(value);
    }

    public void insertNode(int value)
    {
        root = insertNode(root,value);
    }

    public Node insertNode(Node node, int value)
    {
        Node newNode = new Node(value);
        if(node == null){
            node = newNode;
        }else{
            if(value < node.value){
                node.left = insertNode(node.left, value);
            }else if(value == node.value){
                System.out.println("Cant insert duplicate numbers");
            }
            else{
                node.right = insertNode(node.right, value);
            }
        }
        return node;
    }

    public void printPostOrder()
    {
        printPostOrder(root);
    }

    public void printPostOrder(Node node)
    {
        if(node == null){
            return;
        }
        printPostOrder(node.left);

        printPostOrder(node.right);

        System.out.print(node.value + " ");
    }

    public void printInOrder()
    {
        printInOrder(root);
    }

    public void printInOrder(Node node)
    {
        if (node == null) {
            return;
        }
        printInOrder(node.left);

        System.out.printf("%s ", node.value);

        printInOrder(node.right);
    }

    public void printPreOrder()
    {
        printPreOrder(root);
    }

    public void printPreOrder(Node node)
    {
        if(node == null){
            return;
        }

        System.out.print(node.value + " ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

}
