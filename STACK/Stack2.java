import java.util.Stack;
class Stack2{
    // VALID PARANTHESIS 
    public static boolean validParanthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){ //openning bracket 
                st.push(ch);
            } else { // closing bracket 
                if(st.isEmpty()){
                    return false;
                } else if (st.peek()=='[' && ch==']'){
                    st.pop();

            } else if (st.peek()=='{' && ch=='}'){
                st.pop();
            } else if(st.peek()=='(' && ch==')'){
                st.pop();
            } else {
                return false;
            }
            
        }
    }
    if(st.isEmpty()){
        return true;
    } else {
        return false;
    }
}  

// DUPLICATE PARANTHESIS 
    public static boolean dublicatePer(String str){
        Stack <Character> ch = new Stack<>();
        for(int i=0;i<str.length();i++){
            char C = str.charAt(i);
            if(C ==')'){
                int count = 0;
                while(ch.peek()!='('){
                    ch.pop();
                    count++;
                }
                if(count<1){
                    return true; // dublicate 
                } else{
                    ch.pop(); // opening pair 
                }
            } else {  //  opeaning 
                ch.push(C); 
            }   
        } 
        return false;
    }
    // hard problem in leetcode 
    // MAXIMUM RECTENGULAR AREA IN HISTOGRAM 
    public static void maxAreaHisto(int arr[]){
        int maxArea = 0;
        int nsr [] = new int[arr.length];
        int nsl [] = new int[arr.length];
        //next smallest right 
        Stack <Integer> st = new Stack<>();
        // NEXT SMALLEST IN THE RIGHT
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            } 
            if(st.isEmpty()){
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        // NEXT SMALLEST IN LEFT 
         st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            } 
            if(st.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        // CURRENT AREA : width = j-i-1 : nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Maximum area of Histogram = "+maxArea);

    }



    public static void main (String args[]){
        // valid paranthesis 
        // String str = "[{()}]";
        // System.out.println(validParanthesis(str));

        // DUBLICATE PARANTHESIS 
        // String str = "((a+b))"; // true 
        // String str1 = "(a+b)"; // false 
        // System.out.println(dublicatePer(str1));


        // MAXIMUM RECTENGULAR AREA IN HSTOGRAM 
        int arr [] = {2, 1, 5, 6, 2, 3};
        maxAreaHisto(arr);

    }
}





