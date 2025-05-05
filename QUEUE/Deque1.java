import java.util.*;
public class Deque1 {
    static class Stack{
        Deque<Integer> d1 = new LinkedList<>();

        public void push(int data){
         d1.addLast(data);
        }

        public int pop(){
            return d1.removeLast();
        }

        public int peek(){
            return d1.getLast();
        }
    }
    public static void main(String args[]){
        // Deque <Integer> d = new LinkedList<>();
        // d.addFirst(1);
        // d.addFirst(2);
        // d.addFirst(3);
        // d.addLast(4);
        // d.addLast(5);
        // System.out.println(d);
        // // d.removeFirst();
        // // System.out.println(d);

        // System.out.println("first el = "+d.getFirst());
        // System.out.println("Last el = "+d.getLast());

       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());


    }
}
