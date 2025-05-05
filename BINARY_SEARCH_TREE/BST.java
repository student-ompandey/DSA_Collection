import java.util.*;
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // bst form 
    public static Node bst(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data >val){
            root.left = bst(root.left, val);
        } else{
            root.right = bst(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null) {
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    //DELET NODE IN BST 

    public static Node delet(Node root, int val){
        if(root.data > val){
            root.left = delet(root.left, val);
        }

        else if(root.data< val){
            root.right = delet(root.right, val);
        }

        else{
           // case 1 -- leaf node 
           if(root.left == null && root.right == null){
            return null;
           } 
           // case 2 -- one child
           if(root.left == null){
            return root.right;
           }
           if(root.right == null){
            return root.left;
           }

           // case-3 -- 
           Node IS = findInOrderSuccessor(root.right);
           root.data = IS.data;
           root.right = delet(root.right, IS.data);
        }
        return root;
    }
    //FIND INORDER SUCCESSOR
    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    //PRINT IN RANGE
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return ;
        }
        if(root.data >=k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }

        else if(root.data <= k1){
            printInRange(root.left, k1, k2);
        } 
        else {
            printInRange(root.right, k1, k2);
        }
    }

    // ROOT TO LEAF 
    public static void rootToleaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return ;
        }

        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        rootToleaf(root.left, path);
        rootToleaf(root.right, path);
        path.remove(path.size()-1);

    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    // VALID BST OR NOT 
    // public static boolean isValidBst(Node root, Node max, Node min){
    //     if(root == null ){
    //         return true;
    //     }

        
    // }


    
    public static void main(String args[]){
        int val [] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = bst(root, val[i]);
        }
        
        // inOrder(root);
        // System.out.println();

        // if(search(root, 1)){
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not found ");
        // }


        // delet node in bst 
        // root = delet(root, 1);
        // System.out.println();
        // inOrder(root);

       // printInRange(root, 5, 12);

      // PRINT ROOT TO LEAF 

      rootToleaf(root, new ArrayList<>());





    }
}
