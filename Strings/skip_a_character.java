public class Main {
    public static void main(String[] args) {
      String a ="ggattagg";
      String ans = "";

      //skipping character 'a' recursively
      skipChar(ans,a);

  }
  
  private static void skipChar(String a, String up){
    if(up.isEmpty()) {
      System.out.print(a);
      return;
    }
    
    char ch = up.charAt(0);
    
    if(ch == 'a') skipChar(a, up.substring(1));
    else skipChar(a+ch, up.substring(1));
    
    
  }
}
