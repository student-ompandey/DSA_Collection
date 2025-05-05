import java.util.*;
public class BST3 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = this.left = null;
        }
    }

    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst, int size, int min, int max){
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    // SEARCH LARGEST BST IN BINARY TREE 
    public static int maxBst = 0;
    public static Info largestBst(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min)); 
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max)); 

        if(root.data <= leftInfo.max || root.data>= rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBst && rightInfo.isBst){
            maxBst = Math.max(size, maxBst);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }

    // MERGE TWO BST
    public static void getInorder(Node root, ArrayList<Integer> q){
        if(root==null){
            return;
        }

        getInorder(root.left, q);
        q.add(root.data);
        getInorder(root.right, q);
    }

    public static Node createBst(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));

        root.left = createBst(arr, st, mid-1);
        root.right = createBst(arr, mid+1, end);
        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node mergeBst(Node root1, Node root2){
        //step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //merge step3
        int i=0, j=0;
        ArrayList<Integer> finalList = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalList.add(arr1.get(i));
                i++;
            } else {
                finalList.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finalList.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finalList.add(arr2.get(j));
            j++;
        }

        //step--4 sorted arrayy to convert binary search tree 
        
        return createBst(finalList, 0, finalList.size()-1);


    }
    public static void main(String args[]){
        //search bst in bt
        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);

        // Info info = largestBst(root);
        // System.out.println("Size of largest bst is : "+maxBst);


        //merge to BST

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        Node root2 = new Node(9);
         root2.left = new Node(3);
         root2.right = new Node(12);

         Node root = mergeBst(root1, root2);
         preOrder(root);

        

    }
}
