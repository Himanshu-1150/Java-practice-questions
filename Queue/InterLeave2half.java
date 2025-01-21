import java.util.*;

public class InterLeave2half {
  // inter leave 2 half of the queue
  
  // using stack
  public static void interleave (Queue<Integer> q){
    if (q.size() % 2 != 0){
      System.out.println("Queue size is not even");
      return;
    }
    Stack<Integer> s = new Stack<>();
    int halfSize = q.size() / 2;
    for (int i = 0; i < halfSize; i++){
      s.push(q.poll());
    }
    while (!s.isEmpty()){
      q.add(s.pop());
    }
    for (int i = 0; i < halfSize; i++){
      q.add(q.poll());
    }
    for (int i = 0; i < halfSize; i++){
      s.push(q.poll());
    }
    while (!s.isEmpty()){
      q.add(s.pop());
      q.add(q.poll());
    }
  }

  //using queue
  public static void interleave2  (Queue <Integer> q){
    if (q.size() % 2 != 0) {
      System.out.println ("Queue size is not even");
      return;
    }
    Queue <Integer> firstHalf = new LinkedList<> ();
    int size = q.size();

    for (int i=0; i<size/2; i++){
      firstHalf.add(q.remove());
    }
    while (!firstHalf.isEmpty()){
      q.add(firstHalf.remove());
      q.add(q.remove());
    }
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    interleave2(q);
    System.out.println(q);

    while (!q.isEmpty()){
      System.out.print(q.poll() + " ");
    }
    System.out.println();
    
  }
}
