import java.util.*;
public class BST2 {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

        public static Node mirror(Node root){
            if(root == null){
                return null;
            }

            Node leftSubMirr = mirror(root.left);
            Node rightSubMirr = mirror(root.right);

            root.left = rightSubMirr;
            root.right = leftSubMirr;
            return root;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static Node sorArrToBst(int arr[], int st, int end){
           
            if(st>end) {
                return null;
            }
            int mid = (st+end)/2;
            Node root = new Node(arr[mid]);
            root.left = sorArrToBst(arr, st, mid-1);
            root.right = sorArrToBst(arr, mid+1, end);

            return root;
        }


        // CONVERT BST TO BALANCED BST 

        public static Node balancedBst(Node root){
            //inorder sequence
            ArrayList<Integer> inorder = new ArrayList<>();
            inOrder(root, inorder);

            // inorder to balanced bst 

            root = createBst(inorder, 0, inorder.size()-1);
            return root;


        }

        public static void inOrder(Node root, ArrayList<Integer> inorder){
            if(root == null){
                return;
            }

            inOrder(root.left, inorder);
            inorder.add(root.data);
            inOrder(root.right, inorder);
        }

        public static Node createBst(ArrayList<Integer> inorder, int st, int end){
            if(st>end){
                return null;
            }
            int mid = (st+end)/2;
            Node root = new Node (inorder.get(mid));
            root.left = createBst(inorder, st, mid-1);
            root.right = createBst(inorder, mid+1, end);
            return root;
        }


    
    public static void main(String args[]){

        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(10);
        // root.left.left = new Node(3);
        // root.left.right = new Node(6);
        // root.right.right = new Node(11);

        // root = mirror(root);
        // preOrder(root);

        //SORTED ARRAY TO CONVERT BALANCED BST
        // int arr[] = {3, 5, 6, 8, 10, 11, 12};
      

        // Node root = sorArrToBst(arr, 0, arr.length-1);
        // preOrder(root);


        //CONVERT BST TO BALANCED BST 
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balancedBst(root);
        preOrder(root);




    }
}
