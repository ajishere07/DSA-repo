/*
Merge Sort is a divide-and-conquer algorithm that first finds the middle of the array and splits it into left and 
right subarrays.

It recursively sorts both subarrays until each subarray contains only one element.

Then, the merge function compares elements from the left and right subarrays and places the smaller element into the
original array.

This process continues until all elements are merged back in sorted order, resulting in a fully sorted array.
*/


public class Main {
    public static void main(String[] args) {
      int[] arr = {9,7,2,4,6,8,5,1};
      
      mergeSort(arr);
      
      for(int a: arr) System.out.print(a+" ");
      
  }
  
  private static void mergeSort(int[] arr){
    if(arr.length <= 1) return;
    int mid = arr.length/2;
    int[] right = new int[mid];
    int[] left = new int[arr.length - mid];
    
    for(int i = 0; i<mid; i++){
      right[i] = arr[i];
    }
    
    for(int i = mid; i<arr.length; i++){
      left[i-mid] = arr[i];
    }
    
    
    mergeSort(left);
    mergeSort(right);
    
    
    merge(arr, left, right);
  }
  
  private static void merge( int[] arr,int[] left, int[] right){
    int i =0 , j = 0, k= 0;
    
    while(i < left.length && j< right.length){
      if(left[i] <= right[j]) arr[k++] = left[i++];
      else arr[k++] = right[j++];
    }
    
    
    while(i < left.length){
      arr[k++] = left[i++];
    }
    
    while(j < right.length){
      arr[k++] = right[j++];
    }
  }
}
