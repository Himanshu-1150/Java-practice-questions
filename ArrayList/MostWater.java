// package ArrayList;

import java.util.ArrayList;

public class MostWater {
  public static int storeWater (ArrayList <Integer> height){
    int maxWater =0;
    // brute force
    for (int i=0; i<height.size(); i++){
      for(int j=i+1; j<height.size(); j++){
        int ht = Math.min(height.get(i), height.get(j));
        int width = j-1;
        int currWater = ht * width;
        maxWater = Math.max (maxWater, currWater);
      }
    }
    return maxWater;
  }
    public static void main (String args[]){
    System.out.println("Container With Most Water");
    ArrayList <Integer> h = new ArrayList<>();
    h.add(1);
    h.add(8);
    h.add(6);
    h.add(2);
    h.add(5);
    h.add(4);
    h.add(8);
    h.add(3);
    h.add(7);
    
    // Print an array List 
    for (int i = 0 ; i<h.size(); i++){
      System.out.print(h.get(i) + " ");
    }
    System.out.println();

    System.out.println(h);
    System.out.println(storeWater(h));
  }
}
