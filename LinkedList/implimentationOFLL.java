// package LinkedList;

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
  }
  // print a linked list 
  public static void print () {
    Node temp = head;
    while (temp != null){
      System.out.print(temp.data + "-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main (String args[]){
    System.out.println("Implimantation of linked list");
    implimentationOFLL ll = new implimentationOFLL() ;
    ll.addFirst(5);
    ll.addFirst(8);
    ll.addFirst(11);
    print();
    
  }
}
