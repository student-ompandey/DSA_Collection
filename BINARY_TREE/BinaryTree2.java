import java.util.*;

public class BinaryTree2 {
    static class Node{
        int data;
        Node left, right;
         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
    }
    // height of the tree 
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    // count of the tree 
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // sum of the tree 
    // public static int sum(Node root){
        
    // }

    // DIAMETER OF A BINARY TREE 
    public static int diaMeter(Node root){

        if(root == null){
            return 0;
        }
        int ld = diaMeter(root.left);
        int rd = diaMeter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDia = lh + rh + 1;
        int dia = Math.max(ld, rd);
        return Math.max(dia, selfDia);
    }

    //SUBTREE OF A BINARY TREE 
    public static boolean isSubTree(Node root, Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
    }
        //HELPING FUNCTION OF SUBTREE IS IDENTICAL 
    public static boolean isIdentical(Node node, Node subroot){
        if(node==null && subroot==null){
            return true;
        } else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){
            return false;
        } 
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }


// top view of the binary tree 
    static class info{
        Node node;
        int hd;

        public info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    // TOP VIEW OF A BINARY TREE 
    public static void topView(Node root){

        Queue<info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else {
                
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left!=null){
                q.add(new info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right!=null){
                q.add(new info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
            }

        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
    }


    // KTH LEVEL OF A BINARY TREE 
    public static void kthLevel(Node root, int k, int level){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.print(root.data+" ");
            return;
        }

        kthLevel(root.left, k, level+1);
        kthLevel(root.right, k, level+1);
    }

    // LAST COMMON ANCESTORS LCA
    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i=0;
        for(; i<path1.size()&& i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        Node lca = path1.get(i-1);
        return lca;

    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    // LAST COMMON ANCESTOR APPROACH -2 
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }

        if(rightLca==null){
            return leftLca;
        }

        return root;

    }

    //MINIMUM DISTANCE BETWEEN THE TWO NODES

    public static int minDis(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);

        int dis1 = lcaDis(lca, n1);
        int dis2 = lcaDis(lca, n2);

        return dis1 + dis2;
    }

    public static int lcaDis(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDis = lcaDis(root.left, n);
        int rightDis = lcaDis(root.right, n);
        if(leftDis ==-1 && rightDis==-1){
            return -1;
        }
        else if(leftDis == -1){
            return rightDis + 1;
        } else{
            return leftDis + 1;
        } 
    }




    // transform to subtree 
    public static int  sumTree(Node root){
        if(root==null){
            return 0;
        }

        int left = sumTree(root.left);
        int right = sumTree(root.right);

        int data = root.data;
        int newLeft = root.left==null ? 0 : root.left.data;
        int newRight = root.right==null ? 0 : root.right.data;
        root.data = newLeft+left+newRight+right;
        return data;
    }

    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node(4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        //System.out.println(height(root));
        //System.out.println(diaMeter(root));

        // sub tree 
        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);

        //System.out.println(isSubTree(root, subroot));

        //topView(root);

        // int k = 2;
        // kthLevel(root, k, 1);

        // int n1 = 4;
        // int n2 = 5;
        // System.out.println(lca(root,n1, n2).data);


        // int n1 = 4, n2 = 5;
        // System.out.println(lca2(root, n1, n2));

        // int n1 = 4, n2 = 6;
        // System.out.println(minDis(root, n1, n2));

        sumTree(root);
        preOrder(root);
    }

}
