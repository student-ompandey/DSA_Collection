

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1 - craete a new node 
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step-2 new node ka next = head
        newNode.next = head;  //link
        //step-3
        head = newNode;
    }

    public void addLast(int data){
        //step1
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step-2
        tail.next = newNode;
        //step-3 
        tail = newNode;
    }

    //print linked list 
    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("LL is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add in the middle 
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i=idx-1  temp = pre 
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //REMOVE FIRST 
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

       int val = head.data;
        head = head.next;
        size--;
        return val;
    }   

    //REMOVE LAST IN LINKED LIST 
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = head.data;
            tail = head = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail 
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //FOUND KEY IN LINKED LIST 
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found 
        return -1;
    }


    //recurcively key seach
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        } 
        if(head.data==key){
            return 0;
        } 

        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //reverse the linked list 
    public void reverse(){
        Node prev = null, curr = head, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //DELET NTH ELEMENT FROM THE LINKEDLIST 
    public void deletNthFromEnd(int n){
        //calculate size 
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(n==size){
            head = head.next;
            return;
        }

        //size-n
        int i = 1;
        int toFind = size - n;
        Node prev= head;
        while(i<toFind){
           prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }  

    //slow fast approach to find the mid 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        return slow; // slow is my mid
    }

    //CHEACK PALINDROME 
    public boolean cheackPalindrome(){
        if(head==null && head.next==null){
            return true;
        }
        // find the mid 
        Node mid = findMid(head);


        //reverse the 2nd half 
        Node prev = null, curr = mid, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // compair 1st half to second half 
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    //CYCLE LINKEDLIST 
    public static boolean isCycle(){  // floys cycle findind algorithem to find the ll is cycle or not 
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    //REMOVE CYCLE IN A LINKED LIST 
    public static void removeCycle(){
        // detect the cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false ;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find the meeting point 
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        // remove cycle  last.next = null
        prev.next = null;
    }

// MERGE SORT IN LINKED LIST
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    // merge sort on linked list 
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // find the mid 
        Node mid = getMid(head);
        //left and rigth part
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft =  mergeSort(head);
        Node newRigth =mergeSort(rightHead);
        // merge 
        return merge(newLeft, newRigth);
    }


    //ZIG ZAG LINKED LIST
    public void zigZag(){
        // calculate mid poiunt 
        Node slow = head;
        Node fast = head.next;
        while(slow!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        // 2nd half reverse 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //arternative merging 
        Node lh = head;
        Node rh = prev;
        Node nextl, nextr;
        while(lh!=null && rh!=null){
            nextl = lh.next;
            lh.next = rh;
             nextr = rh.next;
             rh.next = nextl;

             lh = nextl;
             rh = nextr;
        }
    }


    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        //ll.print();
       // ll.addFirst(2);
       // ll.print();
       // ll.addFirst(1);
       // ll.print();
       // ll.addLast(2);
       // ll.print();
       // ll.addLast(1);
       // ll.add(2, 9);
       // ll.print();
        //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.recSearch(1));
        // System.out.println(ll.recSearch(10));

    //    ll.reverse();
    //    ll.print();

    // ll.deletNthFromEnd(3);
    // ll.print();

    //System.out.println(ll.cheackPalindrome());

//     head = new Node(1);
//     Node temp = new Node(2);
//     head.next = temp;
//     head.next.next = new Node(3);
//     head.next.next.next = temp;
//     //1->2->3->1  linked list cycle 
//     System.out.println(ll.isCycle());
    
//     //ll.print();
//    ll.removeCycle();
//    System.out.println(ll.isCycle());



        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        ll.zigZag();
        ll.print();





   
   
   


    
       
       
    }
}
