import java.util.*;

public class QueueB {
    // static class Node {
    //     int data;
    //     Node next;
    //     Node (int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class Queue{

        // QUEUE USING CIRCULAR ARRAY 
    //     static int arr[];
    //     static int size;
    //     static int rear;
    //     static int front;

    //     Queue(int n){
    //         arr = new int [n];
    //         size = n;
    //         rear = -1;
    //         front = -1;
    //     }

    //     public static boolean isEmpty(){
    //         return rear == -1 && front ==-1;
    //     }

    //     //full queue function
    //     public static boolean isFull(){
    //         return (rear+1)%size == front;
    //     }


    //     // add function 
    //     public static void add(int data){
    //         if(isFull()){
    //             System.out.println("Queue is full");
    //             return;
    //         }
    //         // first element add in queue
    //         if(front==-1){
    //             front = 0;
    //         }
    //         rear = (rear+1)%size;
    //         arr[rear] = data;
    //     }

    //        //remove 
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Queue is empty");
    //         return -1;
    //     }
    //     int result = arr[front];
    //     if(rear==front){
    //         rear = front = -1;
    //     } else {
    //         front = (front+1)%size;
    //     }     
    //     return result;
    // }

    // // peek 
    // public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Queue is empty");
    //         return -1;
    //     }
    //     return arr[front];
    // }

    // QUEUE USING LINKEDLIST 
    //     static Node head = null;
    //     static Node tail = null;

    //     public static boolean isEmpty(){
    //         return head==null && tail==null;
    //     }
    //     //add function in linkedList
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(head==null){
    //             head = tail = newNode;
    //             return;
    //         }
    //         tail.next = newNode;
    //         tail = newNode;
    //     }

    //     //remove function in linkedList
    //     public static int  remove(){
    //         if(isEmpty()){
    //             System.out.println("LinkedList is empty");
    //             return -1;
    //         }
    //         int front = head.data;
    //         if(head==tail){
    //             head = tail = null;
    //         } else {
    //             head = head.next;
    //         }
    //         return front;
    //     }
    //     // peek the element 
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("LinkedList is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }

    // }
    // QUEUE USING TWO STACK 
    // static class Queue{
    //     static Stack <Integer> s1 = new Stack<>();
    //     static Stack <Integer> s2 = new Stack<>();

    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }

    //     //add
    //     public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());

    //         } 
    //         s1.push(data);
    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }
    //     }
    //     //remove 
    //     public static int remove(){
    //         if(s1.isEmpty()){
    //             return -1;
    //         }
    //         return s1.pop();
    //     }
    //     //peek
    //     public static int peek(){
    //         if(s1.isEmpty()){
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    //     }

        //STACK USING TWO QUEUE 
        static class Stack{
            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<>();
            // isEmpty
            public static boolean isEmpty(){
                return q1.isEmpty() && q2.isEmpty();
            }
            // add 
            public static void push(int data){
                if(!q1.isEmpty()){
                    q1.add(data);
                } else {
                    q2.add(data);
                }
            }
            //pop

            public static int pop(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int top = -1;
                if(!q1.isEmpty()){   // case 1 
                    while(!q1.isEmpty()){
                        top = q1.remove();
                        if(q1.isEmpty()){
                            break;
                        }
                        q2.add(top);
                    }
                } else {    // case 2 
                    while(!q2.isEmpty()){
                        top = q2.remove();
                        if(q2.isEmpty()){
                            break;
                        }
                        q1.add(top);
                    }
                }
                return top;
            }


            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int top = -1;
                if(!q1.isEmpty()){   // case 1 
                    while(!q1.isEmpty()){
                        top = q1.remove();
                        q2.add(top);
                    }
                } else {    // case 2 
                    while(!q2.isEmpty()){
                        top = q2.remove();
                        q1.add(top);
                    }
                }
                return top;
            }

            }
    public static void main (String args[]){
        // Queue q = new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);

        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //LINKEDLIST USING QUEUE
         //Queue q = new Queue();
        // Queue <Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //USING TWO STACK QUEUE
        //  Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        //   while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        //   } 

        //using two queue to stack 
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
