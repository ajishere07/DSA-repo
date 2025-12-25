/*

Quick Sort is a divide-and-conquer sorting algorithm that selects a pivot element, partitions the array around the 
pivot, and recursively sorts the sub-arrays until the entire array is sorted.

*/
public class Main {
    public static void main(String[] args) {
      int[] arr = {6,7,2,1,5,3,0};
      
      quickSort(arr,0,arr.length-1);
      for(int a: arr) System.out.print(a+" ");
    }
  private static void quickSort(int[] arr, int low, int high){

    /*  low and high are used to specify the current sub-array being sorted.
    The condition low < high ensures recursion stops when the sub-array has one or no elements.
    Partitioning places the pivot in its correct position, and recursive calls sort the remaining sub-arrays. */

    if(low < high){
      int pi = partition(arr, low, high);
      
      
      quickSort(arr, low, pi-1);
      quickSort(arr, pi+1, high);
    }
  }
  
  
  private static int partition(int[] arr, int low, int high){

    /* The pointer i is initialized to low - 1 to indicate that initially no elements smaller than the pivot have 
    been found. As smaller elements are discovered, i is incremented and used to place them correctly. */
    
    int pivot = arr[high];
    int i  = low- 1;
    
    
    for(int j  = low; j<high; j++){
      if(arr[j] < pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      
      
      
      
      
     
    }
    
      int temp = arr[i+1];
      arr[i+1 ] = arr[high];
      
      arr[high] = temp;
      
    return i+1;
  }
}
