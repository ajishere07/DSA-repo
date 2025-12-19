public class Main {
    public static void main(String[] args) {
      int[] arr = {3,5,6,7,2};
      
      int num_for_best_case = 3; 
      int num_for_worst_case = 2;
      
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == num_for_best_case) {
          System.out.print("at index "+i + "\n");
          break;
        }
      }
      
  
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == num_for_worst_case) {
          System.out.print("at index "+i);
          break;
        }
      }
  }
}
