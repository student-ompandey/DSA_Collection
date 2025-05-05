import java.util.LinkedList;  // JAVA COLLECTION FRAMEWORK 
class CollFrameLL{


    public static void main (String [] args){

        //create lnkedList
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}