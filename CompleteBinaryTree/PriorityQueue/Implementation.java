// package CompleteBinaryTree.PriorityQueue;
import java.util.*;

public class Implementation {
  public static class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
        return this.rank - s2.rank;
    }
}

  public static void main(String[] args) {
    System.out.println("Priority Queue Implementation using Complete Binary tree");
    PriorityQueue<Student> pq = new PriorityQueue<>();
    pq.add(new Student ("B", 5));
    pq.add(new Student("A", 11));
    pq.add(new Student("c", 100));
    pq.add(new Student("D", 1));

    while (!pq.isEmpty()) {
      System.out.println(pq.peek().name +" " + pq.peek().rank);
      pq.remove();

    }
  }
}
