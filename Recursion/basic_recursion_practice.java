import java.util.*;

public class Main {
    public static void main(String[] args) {
      numbergame(9);
      
      System.out.print("\n"+factorial(10));
      
      System.out.print("\n"+digiSum(20));
      
      System.out.print("\n"+digiProduct(28));
  }
  
  static void printe(int n){
    System.out.print( n);
  }
  
  static void numbergame(int n){
    if(n < 0) return;
    System.out.print(n +" ");
    numbergame(n - 1 );
  }
  
  
  static int factorial(int n){
    if(n == 1 || n==0) return 1;
    return n * factorial(n-1);
  }
  
  
  static int digiSum(int n){
    if(n == 0) return 0;
    return (n %10)+ digiSum(n/10);
  }
  
  static int digiProduct(int n){
    if(n == 0) return n;
    return (n %10)*  digiSum(n/10);
  }
  
  
  
  // one more thing if we chose to pass the value as post or pre decreament
  // there is a catch we should make sure we opt for pre-decreament 
  
  // like recursive(n--) will fall into StackOverflowError
  // recursive(--n) or recursive(n-1) is correct since this method makes sure
  // that the value being passed after get reduced on the other hand the first 
  // method passes the value then descreases it so everycall sees the same
  // and stack over flow will happen.
}
