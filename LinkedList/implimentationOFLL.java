
import java.util.spi.CurrencyNameProvider;
import javax.naming.spi.ResolveResult;



public class implimentationOFLL {
  public static class Node {
    int data;
    Node next;
    public Node (int data){
      this.data = data;
      this.next = null;
    }  
  } 
  // add at First
  public void addFirst (int data){
    // step1 -> create new node
    Node newNode = new Node (data);
    if (head == null){
      head = tail = newNode;
      return;
    }
    // step2 -> newNode next = head 
    newNode.next = head; // link
    // step3 -> head = newNode
     head = newNode;
     size++;
  }

  public static Node head;
  public static Node tail;
  
  // add Last in LL
  public void addLast (int data){
    Node newNode = new Node(data);
    if (head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    size++;
  }

  // print a linked list 
  public static void print () {
    Node temp = head;
    while (temp != null){
      System.out.print(temp.data + "-> ");
      temp = temp.next;
    }
    System.out.println("null");
    System.out.println(size);
  }

  // add in the Middle of LL
  public void add (int idx , int data){
    if (idx == 0){
      addFirst(data);
      return;
    }
    Node newNode = new Node (data);
    Node temp = head;
    int i = 0;
    
    while (i < idx-1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    size++;
  }
  public static int size = 1;

  // Remove First in LL
  public int removeFirst () {
    if (size == 0){
      System.out.println("ll is empty");
      return Integer.MIN_VALUE;
    }
    else if (size ==1){
      int val = head.data;
      head = tail = null; size = 0;
      return val;
    }
    int val = head.data;
    head = head.next; size--;
    return val;
  }

  // Remove Last in LL
  public int removeLast() {
    if (size == 0 ){
      System.out.println("ll is empty");
      return Integer.MIN_VALUE;
    }
    else if (size == 1){
      int val = head.data;
      head = tail = null ; size = 0 ;
      return val;
    }
    // prev : i = size-2
    Node prev = head;
    for (int i=0; i<size-2; i++){
      prev = prev.next;
    }
    int val = prev.next.data; // tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }
  
  // Iterative Search
  public int itrSearch (int key){
    Node temp = head;
    int i=0;
    while (temp != null){
      if (temp.data == key){
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  // Recursive Search
  public int helper (Node head, int key){
    if (head ==null){
      return -1;
    }
    if (head.data == key){
      return 0;
    }
    int idx = helper (head.next, key);
    if (idx == -1){
      return -1;
    }
    return idx +1;
  }
  public int recSearch (int key){
    return helper(head, key);
  }

  // Reverse a Linked List
  public void reverse () {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }
  public static void main (String args[]){
    System.out.println("Implimantation of linked list");
    implimentationOFLL ll = new implimentationOFLL() ;
    ll.addFirst(5);
    ll.addFirst(8);
    ll.addFirst(11);
    ll.addLast(3);
    ll.addFirst(2);
    print();
    ll.removeFirst();
    print();
    ll.removeLast();
    print();
    System.out.println(ll.itrSearch(8));
    System.out.println(ll.recSearch(11));
    ll.reverse();
    
  }
}
