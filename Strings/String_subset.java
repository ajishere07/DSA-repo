public class Main {
    public static void main(String[] args) {
      String ab = "abc";
      charSet("",ab);
      // abc ab ac a bc b c 
  }
  
  private static void charSet(String p,String a){
    if(a.isEmpty()) {
      System.out.print(p +  " "); 
      return; 
    }
    
    char ch = a.charAt(0);
    
    charSet(p+ch, a.substring(1));
    charSet(p, a.substring(1));
    
  }
}
