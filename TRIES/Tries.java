public class Tries {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

        public static Node root = new Node();

        public static void insert(String word){  // time complexity O(L)
            Node curr = root;
            for(int level=0;level<word.length();level++){
                int idx = word.charAt(level)-'a';
                if(curr.children[idx] == null){
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];  
            }
            curr.eow = true ;
        }


        public static boolean search(String key){  // time complexity = O(L)
            Node curr = root;
            for(int level=0;level<key.length();level++){
                int idx = key.charAt(level)-'a';
                if(curr.children[idx] == null){
                   return false;
                }
                curr = curr.children[idx];  
            }
             return curr.eow == true ;
        }

        public static boolean wordBreak(String key){
            if(key.length()==0) return true;
            for(int i=1;i<=key.length();i++){
                if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                    return true;
                }
            }
            return false;
        }


        public static boolean startWith(String prefix){  // time complexity O(L)
            Node curr = root;
            for(int i=0;i<prefix.length();i++){
                int idx = prefix.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }

                curr = curr.children[idx];
            }

            return true;

        }

        // count unique substring 

        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int count = 0;
            for(int i=0;i<26;i++){
                if(root.children[i] != null){
                    count += count(root.children[i]);
                }
            }

            return count+1;

        }


    public static void main(String args[]){
    //     String word[] = {"the", "a", "there", "their", "any", "thee"};
    //     for(int i=0;i<word.length;i++){
    //         insert(word[i]);
    //     }

    //     System.out.println(search("thee"));
    //     System.out.println(search("their"));
    //     System.out.println(search("om"));
    // 

    // String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

    //     for(int i=0;i<arr.length;i++){
    //     insert(arr[i]);
    // }

    //     String key = "ilikesamsung";
    //     System.out.println(wordBreak(key));


    // start with problem 

    // String str[] = {"apple", "app", "mango", "man", "women"};
    // String pre1 = "app";
    // String pre2 = "moon";

    // for(int i=0;i<str.length;i++){
    //     insert(str[i]);
    // }

    // System.out.println(startWith(pre1));
    // System.out.println(startWith(pre2));


    // count unique substring 
    String str = "apple";
    for(int i=0;i<str.length();i++){
        String suffix = str.substring(i);
        insert(suffix);
    }

    System.out.println(count(root));

}
}
