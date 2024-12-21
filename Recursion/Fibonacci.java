public class Fibonacci {
  public static int fibonacciNum(int n){
    // Base case
    if (n == 0|| n == 1){
      return n;
    }

    int fnm1 = fibonacciNum(n-1);
    int fnm2 = fibonacciNum(n-2);
    int fn = fnm1 + fnm2;
    return fn;
  }
  public static void main (String args[]){
    System.out.println(fibonacciNum(5));
  }
}
