// package Hashing;
import java.util.*;

public class Iteration {
 public static void main (String args[]) {
  HashMap <String, Integer> hm = new HashMap <> ();
  
  hm.put("India", 100);
  hm.put("china", 150);
  hm.put("nepal", 10);

  Set<String> keys = hm.keySet();
  System.out.println(keys);

 }
}
