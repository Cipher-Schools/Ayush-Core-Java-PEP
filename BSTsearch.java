class Node{
    int key;
    Node left, right;
    public Node(int key){
        this.key = key;
        left = right =null;
    }
}

public class BSTsearch {
    Node root;
    public BSTsearch() {
        root = null;
    }

    Node insert(Node node, int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        if(key < node.key)
            node.left = insert(node.left, key);
        else if(key > node.key){
            node.right = insert(node.right, key);
        }

        return node;
    }
    public static void main(String[] args) {
        BSTsearch bst = new BSTsearch();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 10);
        bst.insert(bst.root, 5);
        bst.insert(bst.root, 15);

        if(bst.search(bst.root, 10) != null){
            System.out.println("Key found");
        }
        else{
            System.out.println("key not found");
        }
        bst.inorder(bst.root);
        bst.root = bst.Delete(bst.root, 10);
        if(bst.search(bst.root, 10) != null){
            System.out.println("Key found");
        }
        else{
            System.out.println("key not found");
        }
        bst.inorder(bst.root);

    }

    Node search(Node root, int key){
        if(root == null || root.key == key){
            return root;
        }
        if(root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }

    Node Delete(Node root, int key){
        if(root == null){
            return root;
        }
        if(root.key> key){
            root.left = Delete(root.left, key);
            return root;
        }
        else if(root.key < key){
            root.right = Delete(root.right, key);
            return root;
        }
        
        if(root.left == null){
            Node temp = root.right;
            return temp;

        }
        else if(root.right == null){
            Node temp = root.left;
            return temp;
        }
        else{
            Node IS = root;
            Node successor = root.right;
            while(successor.left != null){
                IS = successor;
                successor = successor.left;
            }if(IS != root){
                IS.left = successor.right;
            }
            else{
                IS.right = successor.right;
            }
            root.key = successor.key;
            return root;
        }
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}
