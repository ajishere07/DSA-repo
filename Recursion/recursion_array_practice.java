public class Main {
    public static void main(String[] args) {
      int[] arr = {3,9,6,7,9};
      
      System.out.print(isSorted(arr,0));
  }
  
  static boolean isSorted(int[] arr,int index){
    if(index == arr.length-1) return true; 
    return arr[index] < arr[index+1] && isSorted(arr, index+1);
  }
}
