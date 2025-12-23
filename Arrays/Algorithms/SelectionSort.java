/* 

First, we use two loops: an outer loop and an inner loop.
The outer loop skips over the sorted part of the array and selects the first element of the unsorted array.
The inner loop iterates through the remaining unsorted elements to find the smallest element.
After the inner loop finishes, we swap the smallest element with the first element of the unsorted array.
This process continues until the entire array is sorted.

*/


public class Main {
    public static void main(String[] args) {
      int[] arr = {3,5,6,9,1};
      
      
      for(int i = 0; i<arr.length-1; i++){
        int min  = i;
        for(int j = i+1; j<arr.length; j++){
          if(arr[j] < arr[min]) min = j;
            
        }
        swap(arr, i, min);
        
      }
      
      
      for(int a:arr){
        System.out.print(a+" ");
      }
      
      
  }
  
    static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
