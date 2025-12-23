/*

Bubble sort works by using two loops. The outer loop controls the number of passes required to sort the array. 
The inner loop compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest 
element is placed at the end, so the range of comparison is reduced using the condition j < n - 1 - i

*/

public class Main {
    public static void main(String[] args) {
      int[] arr = {6,2,7,8,3,1,9};
      
      for(int i =0; i<arr.length-1; i++){
        for(int j =0; j < arr.length-1-i;j++){
          
          if(arr[j] > arr[j+1]){
            int temp= arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
      
      for(int a : arr){
        System.out.print(a+" ");
      }
  }
}
