

class Node
{
    int data;
    Node left, right;
 
    // Function to create a new binary tree node having a given key
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
 
class Main{
    public static void inorder (Node root){
       
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static Node insert(Node root, int key){
        if(root==null){
              return new Node(key);
        }
         if (key < root.data) {
            root.left = insert(root.left, key);
        }
        else{ 
            root.right = insert(root.right, key);
        }
 
        return root;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25, 95 };
 
        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
 
        inorder(root);
     
    }
}
