import java.util.Stack;
public class StackaA {
    // static class Node{
    //     int data;
    //     Node next;

    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class Stack{
        //ARRAYlIST 
        // static ArrayList<Integer> list = new ArrayList<>();
        // public static boolean isEmpty(){
        //     return list.size()==0;
        // }
        // //push
        // public static void push(int data){
        //     list.add(data);
        // }

        // //pop
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return  top;
        // }

        // // PEEK 
        // public static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return list.get(list.size()-1);
        // }

        //LINKED LIST 
    //     static Node head = null;

    //     public static boolean isEmpty(){
    //         return head==null;
    //     }

    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }

    // }
    //PUSH AT THE BOTTOM 
    public static void pushAtTheBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtTheBottom(s, data);
        s.push(top);

    }

    //REVERSE A STRING 
    public static String reverseString(String str){
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!ch.isEmpty()){
            char curr = ch.pop();
            result.append(curr);
        }

        return result.toString();
    }

    //print the stack 
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    // reverse stack 
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtTheBottom(s, top);
    }

    // stock span problem 
    public static void stockSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
            int currPrice = stock[i];
            
        while(!s.isEmpty() && currPrice > stock[s.peek()] ){
            s.pop();
        }
        if(s.isEmpty()){
            span[i] = i+1;
        }
        int prevHigh = s.peek();
        span[i] = i-prevHigh;

        s.push(i);
        }

    }

    //NEXT GREATER ELEMENT 
    public static void nextGreter(){

    }


    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtTheBottom(s, 4);

        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        //reverse string 
        // String str = "helloworld";
        // String res = reverseString(str);
        // System.out.println(res);

        //reverse stack 
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //    // printStack(s);
    //    // 3.2.1
    //     reverseStack(s);
    //     printStack(s);

    //     //1.2.3


    // stock span problem 
    // int stock [] = {100, 80, 60, 70, 60, 85, 100};
    // int span[] = new int[stock.length];
    // stockSpan(stock, span);
    // for(int i=0;i<span.length;i++){
    //     System.out.println(span[i]+" ");
    // }


    // NEXT GREATER ELEMENT 

    int arr[] = {6, 8, 0, 1, 3};
    Stack<Integer> s = new Stack<>();
    int nextGreter [] = new int[arr.length];
    //int top = s.peek();

    for(int i=arr.length-1;i>=0;i--){
        //while loop 
        while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
            s.pop();
        }
    // 2nd if else 
    if(s.isEmpty()){
        nextGreter[i] = -1;
    } else {
        nextGreter[i] = arr[s.peek()];
    }
    // s me push 
    s.push(i);
    }

    for(int i=0;i<nextGreter.length;i++){
        System.out.print(nextGreter[i]+" ");
    }


    }
}
