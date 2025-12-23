
public class Main {
    public static void main(String[] args) {
      
      // for(int i = 1; i<=5 ; i++){
      //   for(int j = 1; j<=5; j++){
      //     if(j>=i) System.out.print("* ");
          
      //   }
        
      //   System.out.print("\n");
      // }
      
      
      // for(int i = 1; i<=3; i++){
      //   for(int j = 1; j<=3; j++){
      //     System.out.print("* ");
      //   }
      //   System.out.print("\n");
      // }
      
      
       recursiveStar(3,0);
    }
    
    
    static void recursiveStar(int r, int c){
      if(r==0) return;
      
      if(c < r) {
        System.out.print("*");
        recursiveStar(r, c+1);
      }
      else{
        System.out.print("\n");
        recursiveStar(r-1, 0);
      } 
    }
  
  
}
