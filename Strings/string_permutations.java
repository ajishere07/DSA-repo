

public class Main {
    public static void main(String[] args) {
      permutations("","abc");
      // cba bca bac cab acb abc 
  }
  
  private static void permutations(String str, String str2){
    if(str2.isEmpty()){
      System.out.print(str+" ");
      return;
    }
    
    char ch = str2.charAt(0);
    
    for(int i =0; i<= str.length(); i++){
      String f= str.substring(0,i);
      String s = str.substring(i,str.length());
      permutations(f+ch+s, str2.substring(1));
    }
    
  }
}
