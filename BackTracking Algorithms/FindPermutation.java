
public class FindPermutation {
  public static void findPermutation(String str, String ans){
    // base class 
      if (str.length() == 0){
        System.out.println(ans);
        return ;
      }
    //recursion
    for (int i = 0 ; i< str.length(); i++){
      char curr = str.charAt (i);

      String NewStr = str.substring(0,i)+ str.substring(i+1);
      findPermutation(NewStr, ans+curr);
    }
    
  }
  public static void main (String args []){
    String str = "abc";
    String ans = "";
    findPermutation(str , ans );
  }
}