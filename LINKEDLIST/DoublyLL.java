public class DoublyLL {

    public class Node {
        Node next;
        int data;
        Node prev;

        public Node (int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //add 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //print doubly linkedlist
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    //rwemove linkedlist
    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //reverse doubly linkedlist
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        // LinkedList dll = new LinkedList();
        // dll.addFirst(3);
        // dll.addFirst(2);
        // dll.addFirst(1);

        // dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        // dll.reverse();
        // dll.print();
        System.out.println("Om pandey");

    }
}
